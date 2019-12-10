package com.run.app.custom;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsUtils;

import com.run.app.generate.swagger.base.BaseSwgApp;
import com.run.bll.extend.split.gp.GpLoginLogSplBll;
import com.run.bll.extend.split.gp.GpUserSplBll;
import com.run.bll.extend.unity.gp.GpLoginLogUntBll;
import com.run.bll.extend.unity.gp.GpTokenUntBll;
import com.run.bll.extend.unity.gp.GpUserUntBll;
import com.run.ent.custom.ResultModel;
import com.run.ent.extend.gp.GpLoginLog;
import com.run.ent.extend.gp.GpToken;
import com.run.ent.extend.gp.GpUser;
import com.run.set.enumer.DomainEnum;
import com.run.set.enumer.LogoutType;
import com.run.set.enumer.OperResult;
import com.run.set.exception.GlobalException;
import com.run.utl.DateUtils;
import com.run.utl.SymbolicConstant;
import com.run.utl.TokenUtil;
import com.run.utl.Tools;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@RestController
@RequestMapping(value = "/oauth")
public class AuthenticationController extends BaseSwgApp {

	@Autowired
	@Qualifier("gpLoginLogUntBll")
	protected GpLoginLogUntBll gpLoginLogUntBll;

	@Autowired
	@Qualifier("gpLoginLogSplBll")
	protected GpLoginLogSplBll gpLoginLogSplBll;

	@Resource(name = "gpTokenUntBll")
	protected GpTokenUntBll gpTokenUntBll;

	@Resource(name = "gpUserSplBll")
	protected GpUserSplBll gpUserSplBll;

	@Resource(name = "gpUserUntBll")
	protected GpUserUntBll gpUserUntBll;

	@RequestMapping(value = "/token", method = { RequestMethod.POST, RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResultModel login() {
		ResultModel result = new ResultModel();

		// 如果是预检请求返回OK
		if (CorsUtils.isPreFlightRequest(request)) {
			response.setStatus(HttpServletResponse.SC_OK);
			return result;
		}

		String grantType = request.getParameter("grant_type");
		String clientId = request.getParameter("client_id");
		if (StringUtils.isBlank(grantType))
			throw new GlobalException("授权方式不能为空！");
		if (StringUtils.isBlank(clientId))
			throw new GlobalException("应用领域不能为空！");

	
		return result;
	}

	@RequestMapping(value = "/logout", method = { RequestMethod.POST, RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResultModel logout() {

		ResultModel result = new ResultModel();

		String header = request.getHeader(SymbolicConstant.JWT_HEADER_PARAM);

		header = header.substring(SymbolicConstant.JWT_HEADER_PREFIX.length(), header.length());

		Claims claims = TokenUtil.parserJavaWebToken(header, SymbolicConstant.JWT_SECRET).getBody();

		if (DateUtils.comparator(claims.getExpiration(), DateUtils.getCurrentTime()) < 0) {
			throw new GlobalException(OperResult.TOKEN_EXPIRED.getCode(), OperResult.TOKEN_EXPIRED.getText());
		}

		String loginLogId = (String) claims.get(SymbolicConstant.JWT_LOGIN_LOG_ID);

		ResultModel resultModel = gpTokenUntBll.getModel(loginLogId);
		GpToken gpToken = (GpToken) resultModel.getData();
		if (DateUtils.comparator(gpToken.getRDeadTime(), DateUtils.getCurrentTime()) < 0) {
			throw new GlobalException(OperResult.TOKEN_EXPIRED.getCode(), OperResult.TOKEN_EXPIRED.getText());
		}

		result = gpLoginLogUntBll.getModel(loginLogId);
		GpLoginLog gpLoginLog = (GpLoginLog) result.getData();
		gpLoginLog.setLogoutTime(DateUtils.getCurrentTime());
		gpLoginLog.setLogoutTypeCode(LogoutType.INITIATIVE.getCode());
		gpLoginLogUntBll.update(gpLoginLog, false);

		gpToken.setADeadTime(DateUtils.getCurrentTime());
		gpToken.setRDeadTime(DateUtils.getCurrentTime());
		gpTokenUntBll.update(gpToken, false);

		return result;

	}
}

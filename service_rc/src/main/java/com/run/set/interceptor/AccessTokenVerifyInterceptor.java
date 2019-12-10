package com.run.set.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.run.bll.extend.split.gp.GpUserSplBll;
import com.run.bll.extend.unity.gp.GpDomainUntBll;
import com.run.bll.extend.unity.gp.GpTokenUntBll;
import com.run.bll.extend.unity.gp.GpUserUntBll;
import com.run.utl.SymbolicConstant;

/**
 * @author Zee
 * @createDate 2017年4月14日 下午2:58:58
 * @updateDate 2017年4月14日 下午2:58:58
 * @description 访问权限验证。RESTful是无状态的，所以每次请求就需要对起进行认证和授权。
 *              Token比较像是一个更加精简的自定义的Session。Session的主要功能是保持会话信息，
 *              而Token则只用于登录用户的身份鉴权。所以在移动端使用Token会比使用Session更加简易并且有更高的安全性，
 *              同时也更加符合RESTful中无状态的定义。
 * 
 *              1、客户端通过登录请求提交用户名和密码， 服务端验证通过后生成一个Token与该用户进行关联，并将Token返回给客户端。
 *              2、客户端在接下来的请求中都会携带Token，服务端通过解析Token检查登录状态。
 *              3、当用户退出登录、其他终端登录同一账号（被顶号）、长时间未进行操作时Token会失效，这时用户需要重新登录。
 * 
 *              1、登录请求一定要使用HTTPS，否则无论Token做的安全性多好密码泄露了也是白搭
 *              2、Token的生成方式有很多种，例如比较热门的有JWT（JSON Web Tokens）、OAuth等。
 */
@Component
public class AccessTokenVerifyInterceptor extends HandlerInterceptorAdapter {

	@Resource(name = "gpTokenUntBll")
	protected GpTokenUntBll gpTokenUntBll;

	@Resource(name = "gpUserUntBll")
	protected GpUserUntBll gpUserUntBll;

	@Resource(name = "gpUserSplBll")
	protected GpUserSplBll gpUserSplBll;

	@Resource(name = "gpDomainUntBll")
	protected GpDomainUntBll gpDomainUntBll;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		String header = request.getHeader(SymbolicConstant.JWT_HEADER_PARAM);
		// 如果是预检请求返回OK
		if (CorsUtils.isPreFlightRequest(request)) {
			response.setStatus(HttpServletResponse.SC_OK);
			return true;
		}

		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		uri = uri.substring(contextPath.length(), uri.length());

		return true;
	}

}
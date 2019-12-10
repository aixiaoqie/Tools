package com.run.set.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Zee
 * @createDate 2017年4月13日 下午3:21:07
 * @updateDate 2017年4月13日 下午3:21:07
 * @description 鉴权全局过滤器
 */
// @WebFilter(filterName="authFilter",urlPatterns="/*")
public class AuthenticationFilter implements Filter {
	private static String LOGINPATH = "/gy/login.html";

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String uri = request.getRequestURI();
		String alluri = request.getRequestURL().toString();
		if (alluri.endsWith("/login.html") || alluri.endsWith("/loginSys") || alluri.endsWith(".js") || alluri.endsWith(".css") || alluri.endsWith(".jpg") || alluri.endsWith(".png")) {
			chain.doFilter(req, res);
		} else {
			String base = "";
			if (uri.equals("/") || uri.equals("")) {
				base = alluri.substring(0, alluri.length() - uri.length());
			} else {
				base = alluri.replace(uri, "") + request.getContextPath();
			}
			HttpSession session = request.getSession();
			if (session == null) {
				response.sendRedirect(base + LOGINPATH);
			} else {
				Object curuser = session.getAttribute("user");
				if (curuser != null) {
					chain.doFilter(req, res);
				} else {
					response.sendRedirect(base + LOGINPATH);
				}
			}
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
	}

}
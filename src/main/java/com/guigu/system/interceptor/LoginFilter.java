package com.guigu.system.interceptor;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.guigu.system.po.Admin;

public class LoginFilter implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url=request.getRequestURI();
		if(url.contains("login.action")) {
			return true;
		}
		HttpSession session=request.getSession();
		Admin admin=(Admin) session.getAttribute("admin");
		if(admin!=null) {
			return true;
		}
		request.getRequestDispatcher("/view/login.jsp").forward( request, response);
		return false;
	}
}
package com.guigu.system.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginIntercept implements HandlerInterceptor {

		/*@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response,  
	            Object handler) throws Exception {  
	        //获取请求的URL  
		 String requestUri = request.getRequestURI();
         String contextPath = request.getContextPath();
         String url = requestUri.substring(contextPath.length());  
	        if(url.equals("/system/admin/login.action")){  
	            return true;  
	        }  
	        //获取Session  
	        HttpSession session = request.getSession();  
	        String username = (String)session.getAttribute("adminname");  
	          
	        if(username != null){  
	            return true;  
	        }  
	        //不符合条件的，跳转到登录界面  
	        request.getRequestDispatcher("/view/login.jsp").forward(request, response);  
	          
	        return false;  
	    }  */
}

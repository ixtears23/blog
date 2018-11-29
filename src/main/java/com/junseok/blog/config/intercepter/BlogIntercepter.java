package com.junseok.blog.config.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class BlogIntercepter extends HandlerInterceptorAdapter {
	
	private static final Logger LOG = LoggerFactory.getLogger(BlogIntercepter.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		LOG.info("BlogIntercepter : preHandle - first");
		
		super.preHandle(request, response, handler);
		
		LOG.info("BlogIntercepter : preHandle - second");
		
		return false; 
	}
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		LOG.info("BlogIntercepter : postHandle - first");
		
		super.postHandle(request, response, handler, modelAndView);
		
		LOG.info("BlogIntercepter : postHandle - second");
		
		super.preHandle(request, response, handler);
		
		LOG.info("BlogIntercepter : postHandle - third");
		
	}
	

}

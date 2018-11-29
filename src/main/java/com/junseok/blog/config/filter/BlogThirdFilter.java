package com.junseok.blog.config.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@WebFilter("*.do")
public class BlogThirdFilter implements Filter {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(BlogThirdFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		HttpServletResponse httpRes = (HttpServletResponse) response;
		HttpServletRequest httpReq = (HttpServletRequest) request;
		
		LOG.info("BlogThirdFilter : 1");
		
		LOG.info("BlogThirdFilter : {}", httpReq.getRequestURI());
		
		HttpServletResponseWrapper httpRespWrapper = new HttpServletResponseWrapper(httpRes);
		chain.doFilter(request, httpRespWrapper);
		
		
		String cookieSpec = String.format("%s=%s; Path=%s; HttpOnly; SameSite=Strict", "THIRD_CK_TOKEN", "test", httpReq.getRequestURI());
		String cookieSpec2 = String.format("%s=%s; Path=%s; HttpOnly; SameSite=Strict", "TEST", "THIRD_test", httpReq.getRequestURI());
		httpRespWrapper.addHeader("Set-Cookie", cookieSpec);
		httpRespWrapper.addHeader("Set-Cookie", cookieSpec2);
        //Add cookie header to give access to the token to the JS code
		httpRes.setHeader("THIRD_CK_TOKEN1", "test");
		httpRes.setHeader("TEST_TOKEN", "THIRD_test");
		
		LOG.info("BlogThirdFilter : 2");
		
	}

}

package com.junseok.blog.config.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlogFirstFilter implements Filter {
	
	private static final Logger LOG = LoggerFactory.getLogger(BlogFirstFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		HttpServletResponse httpRes = (HttpServletResponse) response;
		HttpServletRequest httpReq = (HttpServletRequest) request;
		
		LOG.info("BlogFirstFilter : 1");
		
		LOG.info("BlogFirstFilter : {}", httpReq.getRequestURI());
		
		HttpServletResponseWrapper httpRespWrapper = new HttpServletResponseWrapper(httpRes);
		
        chain.doFilter(request, httpRespWrapper);
        
        this.addTokenCookieAndHeader(httpReq, httpRespWrapper);
		
		String cookieSpec = String.format("%s=%s; Path=%s; HttpOnly; SameSite=Strict", "FIRST_CK_TOKEN", "test", httpReq.getRequestURI());
		String cookieSpec2 = String.format("%s=%s; Path=%s; HttpOnly; SameSite=Strict", "TEST", "FIRST_test", httpReq.getRequestURI());
		httpRespWrapper.addHeader("Set-Cookie", cookieSpec);
		httpRespWrapper.addHeader("Set-Cookie", cookieSpec2);
		//Add cookie header to give access to the token to the JS code
		httpRespWrapper.setHeader("FIRST_CK_TOKEN1", "test");
		httpRespWrapper.setHeader("TEST_TOKEN", "FIRST_test");
		
		LOG.info("BlogFirstFilter : 2");
		
	}
	
    private void addTokenCookieAndHeader(HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
        //Get new token
        //Add cookie manually because the current Cookie class implementation do not support the "SameSite" attribute
        //We let the adding of the "Secure" cookie attribute to the reverse proxy rewriting...
        //Here we lock the cookie from JS access and we use the SameSite new attribute protection
    	String cookieSpec = String.format("%s=%s; Path=%s; HttpOnly; SameSite=Strict", "FIRST_CK_TOKEN", "test", httpRequest.getRequestURI());
        httpResponse.addHeader("Set-Cookie", cookieSpec);
        //Add cookie header to give access to the token to the JS code
        httpResponse.setHeader("TEST_TOKEN", "FIRST_test");
    }

}

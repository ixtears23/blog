package com.junseok.blog.config.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

public class BlogSecondFilter extends OncePerRequestFilter {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(BlogSecondFilter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		LOG.info("BlogSecondFilter: 1");
		
		HttpServletRequest httpReq = (HttpServletRequest) request;
		LOG.info("BlogSecondFilter : {}", httpReq.getRequestURI());
		String cookieSpec = String.format("%s=%s; Path=%s; HttpOnly; SameSite=Strict", "SECOND_CK_TOKEN", "test", request.getRequestURI());
		response.addHeader("Set-Cookie", cookieSpec);
		//Add cookie header to give access to the token to the JS code
		response.setHeader("SECOND_CK_TOKEN1", "test");
		
		filterChain.doFilter(request, response);
//		response.sendError(HttpServletResponse.SC_BAD_GATEWAY);
		
		LOG.info("BlogSecondFilter: 2");
//		response.sendError(HttpServletResponse.SC_BAD_GATEWAY);
		
	}

}


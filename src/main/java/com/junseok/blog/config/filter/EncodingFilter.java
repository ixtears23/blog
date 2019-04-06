package com.junseok.blog.config.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class EncodingFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
//	    response.setContentType("text/html; charset=EUC-KR");
	    response.setCharacterEncoding("UTF-8");
		filterChain.doFilter(request, response);
	}

}

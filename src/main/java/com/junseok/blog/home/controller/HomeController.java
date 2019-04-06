package com.junseok.blog.home.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

	@GetMapping(value = "/message")
	@ResponseBody
	public String message() {
		
		return "Test Message Success!";
	}
	
	
	@RequestMapping(value="/responseBody", method=RequestMethod.POST)
	public @ResponseBody Map<String, Object> responseBody(HttpServletRequest request, ModelAndView mav, @RequestBody Map<String, Object> params) {
		
		logger.info("responseBody");
		logger.info("params ::: {}", params);
		
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf");
		logger.info("token ::: {}", token);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", "string");
		map.put("value", "2");
		
		return map;
	}
	
	@RequestMapping(value="/responseEntity", method=RequestMethod.GET)
	public ResponseEntity<Object> responseEntity(HttpServletRequest request, HttpServletResponse res, ModelAndView mav, @RequestParam String param) {
		
		logger.info("responseEntity");
		logger.info("param ::: {}", param);
		logger.info("ModelAndView ::: {}", mav);
		
		MultiValueMap<String, Object> body = new LinkedMultiValueMap<String, Object>();
		body.add("param", param);
		body.add("param2", param);
		body.add("param3", param);
		body.add("param4", param);
		res.setContentType("UTF-8");
		
		
//		ResponseEntity<Object> response = new ResponseEntity<Object>(header, HttpStatus.OK);
		
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON_UTF8).body(body);
		
	}
	
}

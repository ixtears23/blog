package com.junseok.blog.sign.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junseok.blog.sign.vo.Person;

@RestController
public class PersonController {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
//	@Autowired
//	@Qualifier("personValidator")
	private Validator validator;
	
	@InitBinder
	private void InitBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	
	@RequestMapping("/savePerson.do")
	public String savePerson(@Validated Person person, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			logger.debug("Returning savePerson Error");
			return "savePerson Error";
		}
		
		return "savePerson success!!!";
	}

}

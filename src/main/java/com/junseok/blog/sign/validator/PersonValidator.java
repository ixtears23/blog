package com.junseok.blog.sign.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.junseok.blog.sign.vo.Person;

public class PersonValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
		Person person = (Person) target;
		if (person.getAge() < 0) {
			errors.rejectValue("age", "negativevalue");
		} else if (person.getAge() > 110) {
			errors.rejectValue("age", "too.darn.old");
		}
		
	}

}

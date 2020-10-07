package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.beans.Student;
@Component
public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Student.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//data validations
		Student e=(Student)target;
		
		
		//pwd 2-6 upper or lower and digitis
		if(!Pattern.compile("[A-Za-z0-9]{2,6}").matcher(e.getStudPwd()).matches())
		{
		errors.rejectValue("studPwd", "studPwdErr");
		}
		
		//please choose one gender
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"studGen", "studGenErr");
		//enter address
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"studAddr", "studAddErr");
		//choose country
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"studCntry", "studCntrErr");
		//langs
		if(e.getStudLang()==null ||
		e.getStudLang().isEmpty()) {
		errors.rejectValue("studLang", "studLangErr"
		);
		}
		}
		}

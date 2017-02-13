/**
 * 
 */
package com.mango.jtt.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ȫ���쳣������
 * 
 * @author HHL
 * 
 * @date 2016��11��23��
 */
@ControllerAdvice
public class APPWideExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String exceptionHandler(){
		return "errorPage/404";
	}
}

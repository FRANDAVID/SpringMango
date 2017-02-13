package com.mango.jtt.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * security������
 * 
 * @author HHL
 * 
 * @date 2016��12��20��
 */
@Controller
public class SecurityController {

	/**
	 * �ܾ�����ʱ��תҳ��
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/security/deny")
	public String deny(HttpServletRequest request,HttpServletResponse response){
		return "security_deny";
	}
}

/**
 * 
 */
package com.mango.jtt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author HHL
 * 
 * 
 *         ����Ա������
 */
@Controller
public class ManagerController {

	/**
	 * ����������ҳ
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/manager")
	public String login(Model model) {
		return "manager/index";
	}
	
	/**
	 * ��ʾ��¼ҳ���ã���Ҫ����ʾ������Ϣ
	 * 
	 * @param model
	 * @param error
	 * @return
	 */
	@RequestMapping("/manager/login")
	public String login(Model model,
			@RequestParam(value = "error", required = false) String error) {
		if (error != null) {
			model.addAttribute("error", "�û������������");
		}
		return "manager/login";
	}
}

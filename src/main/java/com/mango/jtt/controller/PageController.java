/**
 * 
 */
package com.mango.jtt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mango.jtt.po.Product;
import com.mango.jtt.service.IProductService;

/**
 * ҳ�洦����
 * 
 * @author HHL
 * 
 * @date 2016��11��22��
 */
@Controller
public class PageController {
	@Autowired
	private IProductService productService;
	/**
	 * ��ҳ ӳ��/��/index·��
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping({ "/", "/index" })
	public String index(Model model) throws Exception {
		List<Product> productList = productService.getProductList();
		model.addAttribute("productList", productList);
		return "index";
	}

}

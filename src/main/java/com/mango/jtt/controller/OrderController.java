/**
 * 
 */
package com.mango.jtt.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mango.jtt.po.MangoUser;
import com.mango.jtt.po.Order;
import com.mango.jtt.service.IOrderService;
import com.mango.jtt.util.DateUtil;

/**
 * ����������
 * 
 * @author HHL
 * 
 * @date 2016��12��1��
 */
@Controller
public class OrderController {
	@Autowired
	private IOrderService orderService;

	/**
	 * @param order
	 * @param session
	 * @param model
	 * @return ���涩��
	 */
	@RequestMapping("order/submit")
	public String orderSubmit(Order order, HttpSession session, Model model) {

		order.setTotalPrice(order.getUnitPrice() * order.getNumber());
		order.setOrderId(Long.valueOf(DateUtil.getDateFormat1(new Date())));
		order.setCreateTime(DateUtil.getDateFormat2(new Date()));
		MangoUser user = (MangoUser) session.getAttribute("user");
		if (null != user) {
			order.setUserId(user.getUserId());
			order.setUserName(user.getUserName());
		}
		orderService.saveOrder(order);
		// ����spring aspect
		// LogUtil.testLogError("addOrder ����ֵ��" + res, null);
		model.addAttribute("orderId", order.getOrderId());
		// ��ֹ�ظ��ύ
		return "redirect:/order/{orderId}";
	}

	/**
	 * @param orderId
	 * @param model
	 * @return ������Ϣ
	 */
	@RequestMapping("order/{orderId}")
	public String orderSave(@PathVariable Long orderId, Model model) {
		Order order = orderService.getOrderById(orderId);
		model.addAttribute("order", order);
		return "order_submit";
	}

	/**
	 * @param orderId
	 * @param model
	 * @return ����֧����Ϣ
	 */
	@RequestMapping("pay/{orderId}")
	public String orderPayInfo(@PathVariable Long orderId, Model model) {
		Order order = orderService.getOrderById(orderId);
		model.addAttribute("order", order);
		return "order_pay";
	}

	/**
	 * @param orderId
	 * @param model
	 * @return ����֧��
	 */
	@RequestMapping("order/{orderId}/pay")
	public String orderPay(@PathVariable Long orderId, Model model) {
		Order order = orderService.getOrderById(orderId);
		order.setStatus("1");
		order.setPayTime(DateUtil.getDateFormat2(new Date()));
		orderService.updateOrder(order);
		return "redirect:/pay/{orderId}";
	}
}

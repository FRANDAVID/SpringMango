/**
 * 
 */
package com.mango.jtt.service;

import com.mango.jtt.po.Order;

/**
 * ����������
 * 
 * @author HHL
 * 
 * @date 2016��12��1��
 */
public interface IOrderService {

	/**
	 * ��Ӷ���
	 * 
	 * @param order
	 */
	void saveOrder(Order order);

	/**
	 * ���ݶ����Ż�ȡ����
	 * 
	 * @param orderId
	 * @return
	 */
	Order getOrderById(String orderId);

	/**
	 * ���¶���
	 * 
	 * @param order
	 */
	void updateOrder(Order order);

}

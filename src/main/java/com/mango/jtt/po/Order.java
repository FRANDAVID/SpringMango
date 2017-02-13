package com.mango.jtt.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author HHL
 * 
 * @date 2016��9��19�� ������Ϣ
 */
@Entity
@Table(name = "omorder")
public class Order extends BaseBean {

	private static final long serialVersionUID = -8131973629927813366L;
	/**
	 * �������
	 */
	@Id
	private String orderId;
	/**
	 * ��Ʒid
	 */
	private String productId;
	/**
	 * ��Ʒ����
	 */
	private String productName;
	/**
	 * ��Ʒ����
	 */
	private double unitPrice;
	/**
	 * ��������
	 */
	private int number;

	/**
	 * �����ܶ�
	 */
	private double totalPrice;

	/**
	 * ����ʱ��
	 */
	private String createTime;
	/**
	 * �����û�id
	 */
	private String userId;

	/**
	 * �û�����
	 */
	private String userName;
	/**
	 * ����״̬��0��δ֧����1:��֧��
	 */
	private String status;
	/**
	 * ֧��ʱ��
	 */
	private String payTime;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
}

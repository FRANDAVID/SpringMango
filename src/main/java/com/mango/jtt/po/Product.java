package com.mango.jtt.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author HHL
 * 
 * @date 2016��9��12��
 * 
 *       ��Ʒ��
 */
@Entity
@Table(name = "product")
public class Product extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3844317879498218112L;

	/**
	 * ��Ʒid
	 */
	@Id
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
	 * ���
	 */
	private double quantity;
	/**
	 * ��λ
	 */
	private String unit;
	/**
	 * ��ƷͼƬ��ַ
	 */
	private String picture;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
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
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
}

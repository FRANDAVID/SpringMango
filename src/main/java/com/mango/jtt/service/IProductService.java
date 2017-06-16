/**
 * 
 */
package com.mango.jtt.service;

import java.util.List;

import com.mango.jtt.po.Product;

/**
 * ��Ʒ������
 * 
 * @author HHL
 * 
 * @date 2016��11��30��
 */
public interface IProductService {
	/**
	 * ��ȡ��Ʒ�б�
	 * 
	 * @return
	 */
	List<Product> getProductList();

	/**
	 * ������Ʒid��ȡ��Ʒ��Ϣ
	 * 
	 * @param productId
	 * @return
	 */
	Product getProductById(Long productId);

	/**
	 * �����Ʒ��¼
	 * @param product
	 */
    void saveProduct(Product product);
}

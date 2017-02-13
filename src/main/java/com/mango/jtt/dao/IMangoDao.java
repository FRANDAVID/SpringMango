/**
 * 
 */
package com.mango.jtt.dao;

import java.util.List;

/**
 * dao�������ӿ�
 * 
 * @author HHL
 * 
 * @date 2016��11��29��
 */
public interface IMangoDao {

	/**
	 * ���ݲ�ѯ������ȡ��ѯ���
	 * 
	 * @return
	 */
	List list(String querySql);

	/**
	 * ����id��ȡ����
	 * 
	 * @param clazz
	 * @param productId
	 * @return
	 */
	Object get(Class clazz, String productId);

	/**
	 * �������
	 * 
	 * @param object
	 */
	void saveBean(Object object);

	/**
	 * ���¶���
	 * 
	 * @param object
	 */
	void updateBean(Object object);
}

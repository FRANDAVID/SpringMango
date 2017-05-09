/**
 * 
 */
package com.mango.jtt.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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
	 * @param querySql
	 * @param map  ��������
	 * @return
	 */
	List list(String querySql, Map<String, Object> map);

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

	Connection getConnection() throws SQLException;
}

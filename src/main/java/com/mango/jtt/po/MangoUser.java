/**
 * 
 */
package com.mango.jtt.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author HHL
 * 
 * @date 2016��12��7�� �û���Ϣ
 */
@Entity
@Table(name = "mango_user")
public class MangoUser extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9068362068362830589L;
	/**
	 * �û�id
	 */
	@Id
	private String userId;
	/**
	 * �û�����
	 */
	private String userName;
	/**
	 * �û�����
	 */
	private String password;
	/**
	 * �û���ɫ
	 */
	private String role;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}

package com.mango.jtt.springSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mango.jtt.po.MangoUser;
import com.mango.jtt.service.IUserService;

/**
 * �����ݿ��л�ȡ��Ϣ���Զ�����
 * 
 * @author HHL
 * 
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private IUserService userService;

	/**
	 * ��ȡ�û���Ϣ�����ý�ɫ
	 */
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		// ��ȡ�û���Ϣ
		MangoUser mangoUser = userService.getUserByName(username);
		if (mangoUser != null) {
			// ���ý�ɫ
			return new User(mangoUser.getUserName(), mangoUser.getPassword(),
					AuthorityUtils.createAuthorityList(mangoUser.getRole()));
		}

		throw new UsernameNotFoundException("User '" + username
					+ "' not found.");
	}
	
}

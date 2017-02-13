/**
 * 
 */
package com.mango.jtt.springSecurity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

/**
 * ��¼ʧ�ܿ���
 * 
 * @author HHL
 * 
 * @date 2016��12��20��
 */
public class MyAuthenticationFailureHandler extends
		SimpleUrlAuthenticationFailureHandler {
	private MyAuthenticationEntryPoint loginEntry;

	public MyAuthenticationEntryPoint getLoginEntry() {
		return loginEntry;
	}

	public void setLoginEntry(MyAuthenticationEntryPoint loginEntry) {
		this.loginEntry = loginEntry;
	}

	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		// ��loginEntry�л�ȡ��¼ʧ��Ҫ��ת��url�������ϴ�����Ϣerror
		String authenfailureUrl = this.loginEntry
				.determineUrlToUseForThisRequest(request, response, exception);
		authenfailureUrl = authenfailureUrl + "?error";
		super.setDefaultFailureUrl(authenfailureUrl);
		super.onAuthenticationFailure(request, response, exception);

	}

}

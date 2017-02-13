/**
 * 
 */
package com.mango.jtt.springAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;

import com.mango.jtt.util.LogUtil;

/**
 * ����xml��aop����
 * 
 * @author HHL
 * 
 * @date 2016��12��6��
 */
public class XmlAspect implements Ordered {
	public void beforeGet() {
		LogUtil.printInfoLog(getClass(), "beforeGet");
	}

	public void afterGet() {
		LogUtil.printInfoLog(getClass(), "afterGet");
	}

	public Object aroundGet(ProceedingJoinPoint joinPoint) {
		LogUtil.printInfoLog(getClass(), "beforeGet--around");
		Object obj = null;
		try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		LogUtil.printInfoLog(getClass(), "afterGet--around");
		return obj;
	}

	public void afterReturningGet(String productId) {
		LogUtil.printInfoLog(getClass(), "afterReturningGet----productId��"
				+ productId);
	}

	/*
	 * ���ø�����ĵ����ȼ�
	 */
	@Override
	public int getOrder() {
		return 0;
	}
}

/**
 * 
 */
package com.mango.jtt.springAspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.mango.jtt.po.Order;
import com.mango.jtt.util.LogUtil;

/**
 * ����@AspectJע���aop����
 * 
 * @author HHL
 * 
 * @date 2016��10��25��
 */
@Component
@Aspect
@org.springframework.core.annotation.Order(1)
public class LogAspect {

	@AfterReturning("execution(* com.mango.jtt.springTask.TaskJob.job1(..))")
	public void logTaskJob() {
		LogUtil.printInfoLog(getClass(), "���������ing......");
		LogUtil.testLogError("���������ing......", null);
	}
	
	@AfterReturning(pointcut = "execution(* com.mango.jtt.service.OrderServiceImpl.saveOrder(..)) && args(order)")
	public void saveOrder(Order order) {
		LogUtil.printInfoLog(getClass(), "���涩����������Ϊ��" + order.getOrderId());
	}

}

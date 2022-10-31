package com.zhouyu;

import com.zhouyu.service.UserService;
import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		final String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();
//		final AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition.setBeanClass(UserService.class);
//		applicationContext.registerBeanDefinition("user",beanDefinition);
//
//		final Object user = applicationContext.getBean("user");
//		System.out.println(user);

	}



}

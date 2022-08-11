package com.zhouyu.service;


import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author 周瑜
 */
@Component
public class UserService {

	@Autowired
	private OderService oderService;

	public void test() {

		System.out.println(oderService);
	}


}

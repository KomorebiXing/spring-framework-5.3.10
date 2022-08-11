package com.zhouyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 *
 * @author 世墨
 * @since 2022/7/26 10:52
 */
@Component
public class OderService {

	@Autowired
	private UserService userService;

}

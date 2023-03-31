package org.springframework.mytest.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @author TheNai
 * @date 2023-02-09
 */
public class Hello {

	// 下面的功能还可以使用 XxxAware 接口
	@Autowired // 为何能获取到，因为 之前 就保存到了 容器的实例缓存池中； 底层组件先在 resolvableDependencies 中存储
	private ApplicationContext applicationContext;

	@Autowired // BeanFactory 实例池里有
	private Environment environment;

	@Autowired // 注入环境变量信息
	private Map<String,String> systemEnvironment;
}

package com.zhouyu;


import com.zhouyu.service.UserService;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;


@ComponentScan("com.zhouyu")
@EnableAsync
public class AppConfig {

//	@Bean
//	public JdbcTemplate jdbcTemplate() {
//		return new JdbcTemplate(dataSource());
//	}
//
//
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//		transactionManager.setDataSource(dataSource());
//		return transactionManager;
//	}
//
//
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/tuling?characterEncoding=utf-8&useSSL=false");
//		dataSource.setUsername("root");
//		dataSource.setPassword("Zhouyu123456***");
//		return dataSource;
//	}


//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//		sessionFactoryBean.setDataSource(dataSource());
//		return sessionFactoryBean.getObject();
//	}


}

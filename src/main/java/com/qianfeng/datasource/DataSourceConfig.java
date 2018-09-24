package com.qianfeng.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
public class DataSourceConfig {
	@Value("${url}")
	private String url;
	@Value("${driver}")
	private String driver;
	@Value("${user}")
	private String username;
	@Value("${password}")
	private String password;
	@Bean
	public ComboPooledDataSource dataSource() throws PropertyVetoException{
		ComboPooledDataSource ds=new ComboPooledDataSource();
		ds.setDriverClass(driver);
		ds.setJdbcUrl(url);
		ds.setUser(username);
		ds.setPassword(password);
		ds.setMaxPoolSize(10);
		ds.setIdleConnectionTestPeriod(60);
		ds.setMaxIdleTime(60*60);
		ds.setInitialPoolSize(5);
		ds.setAutoCommitOnClose(false);
		ds.setAcquireRetryAttempts(10);
		ds.setAcquireRetryDelay(1000);
		ds.setCheckoutTimeout(5000);		//该值设置的太小可能会连接超时
		return ds;
	}
}

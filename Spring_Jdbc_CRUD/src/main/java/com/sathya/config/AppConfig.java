package com.sathya.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.sathya")
@PropertySource("classpath:database.properties")
public class AppConfig
{
	@Autowired
	Environment env;

	@Bean
	public JdbcTemplate jdbcTemplate ()
	{
		return new JdbcTemplate(dataSource());
	}
	 @Bean
		public DataSource dataSource() {
			// TODO Auto-generated method stub
	    	DriverManagerDataSource dmds=new DriverManagerDataSource();
	    	dmds.setDriverClassName(env.getProperty("jdbc.driver"));
	    	dmds.setUrl(env.getProperty("jdbc.url"));
	    	dmds.setUsername(env.getProperty("jdbc.username"));
	    	dmds.setPassword(env.getProperty("jdbc.password"));
			return dmds;
		}

}

package com.fileupload.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.fileupload.entity.UploadFile;



@Configuration
@EnableWebMvc
@EnableTransactionManagement
@PropertySource(value="classpath:db.properties")
@ComponentScan(basePackages = "com.fileupload")
public class Appconfig {
	private int maxUploadSizeInMb = 5 * 1024 * 1024; // 5 MB
	@Autowired
	private Environment env;
	
	@Bean
    public CommonsMultipartResolver multipartResolver() {

        CommonsMultipartResolver cmr = new CommonsMultipartResolver();
        cmr.setMaxUploadSize(maxUploadSizeInMb * 2);
        cmr.setMaxUploadSizePerFile(maxUploadSizeInMb); //bytes
        return cmr;

    }

	@Bean
	public HibernateTemplate htObj()
	{
		HibernateTemplate h=new HibernateTemplate();
		h.setSessionFactory(loc().getObject());
		return h;
			
	}
	
	@Bean
	public DriverManagerDataSource data()
	{
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName(env.getProperty("driver"));
		d.setUrl(env.getProperty("url"));
		d.setUsername(env.getProperty("un"));
		d.setPassword(env.getProperty("pwd"));
		
		
		return d;
		
	}
	
	@Bean
	public LocalSessionFactoryBean loc()
	{
		LocalSessionFactoryBean l=new LocalSessionFactoryBean();
		l.setDataSource(data());
		l.setHibernateProperties(prop());
		l.setAnnotatedClasses(UploadFile.class);
		
		return l;
	}
	
	@Bean
	public HibernateTransactionManager ht()
	{
		HibernateTransactionManager htm=new HibernateTransactionManager();
		htm.setSessionFactory(loc().getObject());
		return htm;	
	}
	
	
	@Bean
	public Properties prop()
	{
		Properties pr=new Properties();
		pr.put("hibernate.dialect", env.getProperty("dia"));
		pr.put("hibernate.show_sql", env.getProperty("sho"));
		pr.put("hibernate.format_sql", env.getProperty("for"));
		pr.put("hibernate.hbm2ddl.auto", env.getProperty("hbm"));
		return pr;
		
	}

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    
}

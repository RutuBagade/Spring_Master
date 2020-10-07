package productcrudapp.config;

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
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.web.servlet.view.InternalResourceViewResolver;



import productcrudapp.model.Product;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = "productcrudapp")
public class Appconfig implements WebMvcConfigurer  {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    @Autowired
	private Environment env;
	
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
		l.setAnnotatedClasses(Product.class);
		
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
  
  }


package com.sample.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.sample")
public class Appconfig implements WebMvcConfigurer  {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    /**multi-language configuration**/
  //1. Message Source : .properties file name and data
 
	  @Bean
	  public ReloadableResourceBundleMessageSource messageSource()
	  {
		  ReloadableResourceBundleMessageSource r=new ReloadableResourceBundleMessageSource();
		  r.setBasename("classpath:messages");
		  r.setDefaultEncoding("UTF-8");
		  return r;
		  }
	  @Bean
	  public LocaleResolver localeResolver() {
	      SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
	      return sessionLocaleResolver;
	  }

			/*
			 * @Bean public CookieLocaleResolver localeResolver() { CookieLocaleResolver
			 * c=new CookieLocaleResolver(); c.setDefaultLocale(Locale.ENGLISH);
			 * c.setCookieName("my-cke"); return c; }
			 */
  @Bean
  public LocaleChangeInterceptor interceptor() {
	  LocaleChangeInterceptor l=new  LocaleChangeInterceptor();
	  l.setParamName("lang");
	  return l;
  }
  @Override
  
  public void addInterceptors(InterceptorRegistry registry) {
  registry.addInterceptor(interceptor()).addPathPatterns("/login**");
  }
  }


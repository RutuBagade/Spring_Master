package com.fileupload.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Appinit extends
AbstractAnnotationConfigDispatcherServletInitializer {

@Override
protected Class<?>[] getRootConfigClasses() {
return new Class[]{Appconfig.class};
}

@Override
protected Class<?>[] getServletConfigClasses() {
return null;
}

@Override
protected String[] getServletMappings() {
return new String[]{"/"};
}

}
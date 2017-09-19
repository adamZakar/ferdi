package com.zakar.ferdaus.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com.zakar.ferdaus")
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	Logger LOG= LoggerFactory.getLogger(WebMvcConfig.class);

	@Bean
	public UrlBasedViewResolver urlBasedViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

/*	@Bean
	public DataSource dataSource() {
		final JndiDataSourceLookup dsLookup= new JndiDataSourceLookup();
	    dsLookup.setResourceRef(true); //full JNDI  name would be required one line down java:comp/en...
	    DataSource dataSource = dsLookup.getDataSource("jdbc/springdb");
	    return dataSource;
	}*/

//	@Bean
//	public RequestMappingHandlerMapping requestMappingHandlerMapping() {
//		RequestMappingHandlerMapping requestMappingHandler= new RequestMappingHandlerMapping();
//		return requestMappingHandler;
//	}
//
	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		LOG.info("Home has been called");
//		registry.addViewController("/home").setViewName("welcomeHome");
//	}
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
	

}

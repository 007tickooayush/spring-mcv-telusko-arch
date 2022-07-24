package com.ayush.config;
import org.springframework.context.annotation.Bean;
//creating this annotation based config file to eliminate the need of "spring-servlet" xml config file
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//@EnableWebMvc // enable annotation based config with class "WebMvcConfigurerAdapter" <- deprecated
@Configuration
@ComponentScan({"com.ayush"}) // can provide an comma separated array to set multiple packages 
public class TestConfig  {
	
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
}

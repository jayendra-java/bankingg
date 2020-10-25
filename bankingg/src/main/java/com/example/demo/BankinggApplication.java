package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@Configuration
public class BankinggApplication {

	 @Bean
	    public InternalResourceViewResolver resolver() {
	        InternalResourceViewResolver vr = new InternalResourceViewResolver();
	        vr.setPrefix("/WEB-INF/jsps/");
	        vr.setSuffix(".jsp");
	        return vr;
	    }
	public static void main(String[] args) {
		SpringApplication.run(BankinggApplication.class, args);
		
	}

}

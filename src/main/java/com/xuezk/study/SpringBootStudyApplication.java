package com.xuezk.study;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
//@MapperScans({@MapperScan("com.xuezk.study.mapper"),@MapperScan("")})
@MapperScans({@MapperScan("com.xuezk.study.mapper")})
public class SpringBootStudyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootStudyApplication.class, args);
		
		ApplicationArguments applicationArguments = context.getBean(ApplicationArguments.class);
        System.out.println("============");
        System.out.println("name="+applicationArguments.getOptionNames());
        System.out.println("values===="+applicationArguments.getOptionValues("developer.name"));
        
		String[] beans=context.getBeanDefinitionNames();
		System.out.println("============");
		for(String bean:beans) {
			System.err.println("bean:="+bean);
		}
	}
	
}

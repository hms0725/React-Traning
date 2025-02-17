package com.example.reactRemote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@MapperScan(basePackages= {""})
public class ReactRemoteApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ReactRemoteApplication.class, args);
	}
}

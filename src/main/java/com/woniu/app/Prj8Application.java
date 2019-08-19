package com.woniu.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.woniu.mapper")
@SpringBootApplication(scanBasePackages = "com.woniu")
public class Prj8Application {

	public static void main(String[] args) {
		SpringApplication.run(Prj8Application.class, args);
	}

}

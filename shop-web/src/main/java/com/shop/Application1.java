package com.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.shop.mapper")
public class Application1 {

	public static void main(String[] args) {
		SpringApplication.run(Application1.class, args);
	}




}

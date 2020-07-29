package com.bi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//声明这是个SpringBoot项目
public class MainApplication {
	public static void main(String[] args) {
		//启动SpringBoot项目
		SpringApplication.run(MainApplication.class, args);
	}

}

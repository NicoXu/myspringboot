package com.shaw.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.shaw.myspringboot.mapper")
@SpringBootApplication
public class MyspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootApplication.class, args);
	}
}

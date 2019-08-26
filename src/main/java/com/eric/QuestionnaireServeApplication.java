package com.eric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
//扫描mybatis mapper路径
@MapperScan(basePackages = "com.eric.mapper")

public class QuestionnaireServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionnaireServeApplication.class, args);
	}

}

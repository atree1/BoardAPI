package com.atree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan(value={"com.atree"})
public class AtreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtreeApplication.class, args);
	}

}

package com.atree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.atree.board.mapper"})
public class AtreeApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(AtreeApplication.class, args);
	}

}
                                                                 
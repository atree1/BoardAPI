package com.atree.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class BoardController {

	@RequestMapping("/index")
	public void index(){
		
		log.info("i======================================================");
		log.info("i======================================================");
		log.info("i======================================================");
		log.info("index");
	}
	
}

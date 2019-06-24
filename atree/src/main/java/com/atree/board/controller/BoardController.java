package com.atree.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atree.board.service.BoardService;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController {

	@Setter(onMethod_=@Autowired)
	private BoardService service;
	
	@RequestMapping("/index")
	public void index(Model model) throws Exception{
	
		
		model.addAttribute("list",service.selectBoardList());
	
	}
	
}

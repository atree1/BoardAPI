package com.atree.board.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atree.board.service.BoardService;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BoardController {

	@Setter(onMethod_=@Autowired)
	private BoardService service;
	
	@RequestMapping("/index")
	@ResponseBody
	public Map<String, Object>  index(Model model) throws Exception{
	
		Map resultMap = new HashMap();
		
		resultMap.put("list",service.selectBoardList());
		return resultMap;
	
	}
	
}

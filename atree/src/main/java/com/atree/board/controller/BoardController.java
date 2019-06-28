package com.atree.board.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atree.board.service.BoardService;
import com.atree.board.vo.BoardVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/board")
public class BoardController {

	@Setter(onMethod_ = @Autowired)
	private BoardService service;

	@RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getBoardList() throws Exception {

		Map resultMap = new HashMap();

		resultMap.put("list", service.selectBoardList());
		return resultMap;

	}

	@RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getBoard(BoardVO vo) throws Exception {

		Map resultMap = new HashMap();

		resultMap.put("board", service.selectBoardDetail(vo));
		return resultMap;

	}

	@RequestMapping(value = "/insertBoard", method = RequestMethod.POST)
	@ResponseBody
	public int insertBoard(BoardVO vo) throws Exception {

		return service.insertBoard(vo);

	}

	@RequestMapping(value = "/updateBoard", method = RequestMethod.POST)
	@ResponseBody
	public int updateBoard(BoardVO vo) throws Exception {

		return service.updateBoard(vo);

	}

	@RequestMapping(value = "/deleteBoard", method = RequestMethod.POST)
	@ResponseBody
	public int deleteBoard(BoardVO vo) throws Exception {

		return service.removeBoard(vo);
	}
}

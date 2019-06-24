package com.atree.board.service;

import java.util.HashMap;
import java.util.List;

import com.atree.board.vo.BoardVO;

public interface BoardDaoService {

	List<HashMap> selectBoardList() throws Exception;

	HashMap selectBoardDetail(BoardVO vo) throws Exception;

	int insertBoard(BoardVO vo) throws Exception;

	int updateBoard(BoardVO vo) throws Exception;

	int removeBoard(BoardVO vo) throws Exception;
}

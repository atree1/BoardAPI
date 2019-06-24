package com.atree.board.service;

import java.util.HashMap;
import java.util.List;

import com.atree.board.mapper.BoardMapper;
import com.atree.board.vo.BoardVO;


public class BoardDao implements BoardDaoService{


	private BoardMapper m;
	
	@Override
	public List<HashMap> selectBoardList() throws Exception {
		// TODO Auto-generated method stub
		return m.selectBoardList();
	}

	@Override
	public HashMap selectBoardDetail(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return m.selectBoardDetail(vo);
	}

	@Override
	public int insertBoard(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return m.insertBoard(vo);
	}

	@Override
	public int updateBoard(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return m.updateBoard(vo);
	}

	@Override
	public int removeBoard(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return m.removeBoard(vo);
		}

}

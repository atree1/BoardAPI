package com.atree.board.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.atree.board.vo.BoardVO;

@Mapper
public interface BoardMapper {

	List<HashMap> selectBoardList() throws Exception;

	HashMap selectBoardDetail(BoardVO vo) throws Exception;

	int insertBoard(BoardVO vo) throws Exception;

	int updateBoard(BoardVO vo) throws Exception;

	int removeBoard(BoardVO vo) throws Exception;
}

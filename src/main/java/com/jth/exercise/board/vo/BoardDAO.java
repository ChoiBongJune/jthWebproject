package com.jth.exercise.board.vo;

import java.util.List;

import com.jth.exercise.board.vo.BoardVO;

public interface BoardDAO {
	
	int insertBoard(BoardVO boardVO);
	
	List<BoardVO> selectBoardList();
	
}

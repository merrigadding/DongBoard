package com.dongproject.board.service;

import java.util.List;

import com.dongproject.board.vo.Board;
import com.dongproject.board.vo.CatogoryDetailVo;
import com.dongproject.board.vo.CatogoryVo;

public interface BoardService {

	List<CatogoryVo> selectCategoryOption();

	List<CatogoryDetailVo> selectCategoryDetailOption(CatogoryDetailVo vo);

	void insertBoard(Board board);

}

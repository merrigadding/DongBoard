package com.dongproject.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongproject.board.mapper.BoardMapper;
import com.dongproject.board.service.BoardService;
import com.dongproject.board.vo.Board;
import com.dongproject.board.vo.CatogoryDetailVo;
import com.dongproject.board.vo.CatogoryVo;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<CatogoryVo> selectCategoryOption() {
		return mapper.selectCategoryOption();
	}

	@Override
	public List<CatogoryDetailVo> selectCategoryDetailOption(CatogoryDetailVo vo) {
		// TODO Auto-generated method stub
		return mapper.selectCategoryDetailOption(vo);
	}

	@Override
	public void insertBoard(Board board) {
		// TODO Auto-generated method stub
		mapper.insertBoard(board);
	}
	
	

	
}

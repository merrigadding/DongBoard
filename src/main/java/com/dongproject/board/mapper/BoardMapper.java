package com.dongproject.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dongproject.board.vo.Board;
import com.dongproject.board.vo.CatogoryDetailVo;
import com.dongproject.board.vo.CatogoryVo;

@Mapper
public interface BoardMapper {

	List<CatogoryVo> selectCategoryOption();

	List<CatogoryDetailVo> selectCategoryDetailOption(CatogoryDetailVo vo);

	void insertBoard(Board board);

}

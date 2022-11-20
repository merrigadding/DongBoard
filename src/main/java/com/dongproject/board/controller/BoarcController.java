package com.dongproject.board.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dongproject.board.service.BoardService;
import com.dongproject.board.vo.Board;
import com.dongproject.board.vo.CatogoryDetailVo;
import com.dongproject.board.vo.CatogoryVo;
import com.dongproject.board.vo.SiteAddressVo;

@RestController
@RequestMapping("/api/v1/board")
public class BoarcController {
	private static final Logger LOGGER = LoggerFactory.getLogger(BoarcController.class);
	@Autowired
	private BoardService boardSerive;
	
	@RequestMapping(value="/boardWrite",method = RequestMethod.GET,produces = "application/json" )
	public String writeBoard() {
		return "writeBoard";
	}
	@RequestMapping(value="/selectBoard",method = RequestMethod.GET,produces = "application/json" )
	public String selectBoard() {
		return "selectBoard";
	}
	@RequestMapping(value="/selectBoardTitle",method = RequestMethod.GET,produces = "application/json" )
	public ResponseEntity<SiteAddressVo> selectBoardTitle(
			@RequestParam(required = false, value = "siteId") String siteId
			) {
		
		return new ResponseEntity<SiteAddressVo>(new SiteAddressVo(),HttpStatus.OK);
	}
	@RequestMapping(value="/category", method = RequestMethod.GET,produces = "application/json" )
	public ResponseEntity<List<CatogoryVo>> selectCategoryOption() {

		return new ResponseEntity<List<CatogoryVo>>(boardSerive.selectCategoryOption(),HttpStatus.OK);
	}
	@RequestMapping(value="/categoryDetail", method = RequestMethod.GET,produces = "application/json" )
	public ResponseEntity<List<CatogoryDetailVo>> selectCategoryDetailOption(
			@RequestParam(required = false, value = "category") int category
			) {
		
		CatogoryDetailVo vo = new CatogoryDetailVo();
		vo.setCategoryDetailNo(category);
		return new ResponseEntity<List<CatogoryDetailVo>>(boardSerive.selectCategoryDetailOption(vo),HttpStatus.OK);
	}
	
	@RequestMapping(value="/insertBoard", method = RequestMethod.POST,produces = "application/json" )
	public void insertBoard(
			@RequestBody Board board

			) {
		System.out.println(board);
		boardSerive.insertBoard(board);
		
}

}
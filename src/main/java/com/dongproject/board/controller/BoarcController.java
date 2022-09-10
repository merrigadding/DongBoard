package com.dongproject.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/board")
public class BoarcController {

	@RequestMapping(value="/boardWrite",method = RequestMethod.GET,produces = "application/json" )
	public String writeBoard() {
		return "writeBoard";
	}
	@RequestMapping(value="/selectBoard",method = RequestMethod.GET,produces = "application/json" )
	public String selectBoard() {
		return "selectBoard";
	}
	@RequestMapping(value="/selectBoardTitle",method = RequestMethod.GET,produces = "application/json" )
	public String selectBoardTitle(
			@RequestParam(required = false, value = "siteId") String siteId
			) {
		return "selectBoard";
	}
	
}

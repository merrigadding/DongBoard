package com.dongproject.board.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Board {
	private int boardNo;
	private String boardTitle;
	private String textContent;
	private int categoryDetailNo;
	
}

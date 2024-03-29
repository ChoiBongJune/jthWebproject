package com.jth.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/freeboard")
public class FreeBoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(FreeBoardController.class);
	
	/**
	 * 자유게시판 목록
	 * @author 최봉준
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String freebaordList() {
		
		return "freeBoardList";
	}
	
	
	/**
	 * 자유게시판 등록
	 * @return
	 */
	@GetMapping(value = "/insert")
	public String freeboardInsert() {
		
		return "freeBoardInsert";
	}
	
	/**
	 * 자유게시판 수정
	 * @return
	 */
	@GetMapping(value = "/modify")
	public String freeboardModify() {
		
		return "freeboard/freeBaordModify";
	}
	
}

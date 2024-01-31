package com.jth.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jth.exercise.test.vo.TestBoardVO;

@Controller
@RequestMapping("/test")
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/list")
	public String testList() {
		
		logger.info("TestController, testList.");
		
		return "test/testList";
	}

//	@GetMapping("/detail/{no}")
	//public String testDetail(@PathVariable("no") int no, Model model) {
	@GetMapping("/detail")
	public String testDetail(Model model) {
		
		logger.info("TestController, testDetail");
		//logger.info("check no : {}", no);
		//model.addAttribute("no", no);
				
		return "test/testDetail";
	}
	
	
	/**
	 * Post 전송
	 * @param testBoardVO
	 * @return
	 */
	@PostMapping("/detail/post")
	public ResponseEntity<String> testDetailPost(@RequestBody TestBoardVO testBoardVO){
		logger.info("TestController, testDetailPost.");
		
		if(testBoardVO != null) {
			logger.info(testBoardVO.toString());
			
		}
		
		ResponseEntity<String> resultEntity = null;
		try {
			resultEntity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		} catch (Exception e) {
			resultEntity = new ResponseEntity<String>("FAIL",HttpStatus.BAD_REQUEST);
		}
		
		return resultEntity;
		
	}
	/**
	 * Put 전송
	 * @param testBoardVO
	 * @return
	 */
	//@PutMapping("/detail/put")
	@RequestMapping(value = "/detail/put", method=RequestMethod.PUT)
	public ResponseEntity<String> testDetailPut(@RequestBody TestBoardVO testBoardVO){
		logger.info("TestController, testDetailPut.");
		
		if(testBoardVO != null) {
			logger.info(testBoardVO.toString());
			
		}
		
		ResponseEntity<String> resultEntity = null;
		
		try {
			resultEntity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
			//throw new Exception("good day"); -> 예외를 발생시키는 법
		} catch (Exception e) {
			resultEntity = new ResponseEntity<String>("FAIL",HttpStatus.BAD_REQUEST);
		}
		
		return resultEntity;
	}
	
	@PostMapping("/detail/xml")
	public ResponseEntity<String> testDetailXml(@RequestBody TestBoardVO testBoardVO){
		logger.info("");
		
		if(testBoardVO != null) {
			logger.info(testBoardVO.toString());
		}
		
		ResponseEntity<String> resultEntity = null;				
		
		try {
			resultEntity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch (Exception e) {
			resultEntity = new ResponseEntity<String>("FAIL", HttpStatus.BAD_REQUEST);
		}
		
		
		return resultEntity;
		
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String testInsert() {
		
		logger.info("TestController, testInsert");
		
		return "test/testInsert";
	}

	@PostMapping(value = "/update")
	public String testUpdate() {
		
		logger.info("TestController, testUpdate");
		
		return "test/testUpdate";
	}

	@PostMapping(value = "/delete")
	public String testDelete() {
		
		logger.info("TestController, testDelete");
		
		return "test/testDelete";
	}
	
	
	
	
}

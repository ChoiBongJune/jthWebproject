package com.jth.exercise.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jth.exercise.test.vo.TestReturnBoardVO;

@Controller
public class TestReturnController {

	private static final Logger logger = LoggerFactory.getLogger(TestReturnController.class);
	/*
	 * @GetMapping("/test/return/list") public String list() {
	 * 
	 * return "test/return/testReturnList"; }
	 */
	
	@GetMapping("/test/return/voList")
	@ResponseBody
	public TestReturnBoardVO listVO() {
		
		TestReturnBoardVO testReturnBoardVO = new TestReturnBoardVO();
		testReturnBoardVO.setBoardId("20210817001");
		testReturnBoardVO.setBoardTitle("긴급 구매 요청입니다.");
		testReturnBoardVO.setBoardContent("고등학교 수련회 단체 방문으로 인하여 주요 식자재 긴급 구매 요청 건입니다.");
		testReturnBoardVO.setBoardWriter("김유신");
		
		return testReturnBoardVO;
		
	}
	
	@GetMapping("/test/return/strList")
	@ResponseBody
	public List<String> strList() {
		
		List<String> resultList = new ArrayList<String>();
		resultList.add("보병");
		resultList.add("기갑");
		resultList.add("포병");
		resultList.add("항공");
		
		return resultList;
	}
	
	@GetMapping("/test/return/strMap")
	@ResponseBody
	public Map<String, Object> strMap() {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("기관단총", "K1A1");
		resultMap.put("소총", "K2");
		resultMap.put("기관총", "K3");
		
		return resultMap;
	}
	
	@GetMapping("/test/return/reString")
	@ResponseBody
	public ResponseEntity<String> strRe() {
		
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("Good day, business partner", HttpStatus.OK);
		
		return responseEntity;
		
	}
	
	@GetMapping("/test/return/reList")
	@ResponseBody
	public ResponseEntity<List<String>> listStrRe() {
		
		ResponseEntity<List<String>> resultList = null;
		
		List<String> strList = new ArrayList<String>();
		strList.add("네이버");
		strList.add("카카오");
		strList.add("배달의민족");
		strList.add("쿠팡");
		
		resultList = new ResponseEntity<List<String>>(strList, HttpStatus.OK);
		
		return resultList;
	}
	
	@GetMapping("/test/return/reListMap")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listMapRE() {
		
		ResponseEntity<List<Map<String, Object>>> resultEntity = null;
		
		List<Map<String, Object>> resultList = new ArrayList<Map<String,Object>>();
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("삼성", "전자");
		inMap.put("삼성", "건설");
		inMap.put("삼성", "금융");
		inMap.put("삼성", "조선");
		
		resultList.add(inMap);
		
		inMap = new HashMap<String, Object>();
		inMap.put("네이버", "포털");
		inMap.put("네이버", "라인");
		inMap.put("네이버", "이커머스");
		
		resultList.add(inMap);
		
		inMap = new HashMap<String, Object>();
		inMap.put("카카오", "메신저");
		inMap.put("카카오", "은행");
		inMap.put("카카오", "020");
		
		resultList.add(inMap);
		
		resultEntity = new ResponseEntity<List<Map<String,Object>>>(resultList, HttpStatus.OK);
		
		
		return resultEntity;
		
	}
	
}

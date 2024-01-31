package com.jth.exercise.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jth.exercise.test.vo.OrderRequest;

/**
 * 스프링 폼 태그
 * @author 최봉준
 *
 */
@Controller
public class SpringFormController {
	private static final Logger logger = LoggerFactory.getLogger(SpringFormController.class);
	
	
	@GetMapping("/springform/registerForm")
	public String registerForm(Model model) throws Exception {
		
		logger.info("SpringFormController, registerFrom.");
		
		model.addAttribute("orderRequest", new OrderRequest());
		
		return "springform/registerForm";
	}
	
	/**
	 * 스프링폼 데이터 전달
	 * @param orderRequest
	 * @return
	 */
	@PostMapping("/springform/register")
	public String sprinfFormRegisterPost(OrderRequest orderRequest) {
		
		logger.info("SpringFormController, springFormRegisterPost");
		
		logger.info("데이터확인 : {}", orderRequest.getOrderRequestNo());
		logger.info("데이터확인 : {}", orderRequest.getOrderRequestDate());
		logger.info("데이터확인 : {}", orderRequest.getItemNm());
		
		return "springform/result";
	}
	
}

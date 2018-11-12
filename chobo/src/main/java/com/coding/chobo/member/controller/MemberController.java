package com.coding.chobo.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coding.chobo.member.service.MemberService;
import com.coding.chobo.sample.SampleController;

@Controller
public class MemberController {
	
	@Autowired MemberService memberService;
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("/member/getTime")
	public void getTime(){
		
		logger.info(memberService.getTime());
		logger.info("getTime called....................");
				
	}
	
	
	
}

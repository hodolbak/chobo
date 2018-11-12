package com.coding.chobo.sample;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")
	public void doA(){
		
		logger.info("doA called....................");
		
	}
	
	@RequestMapping("/doJSON")
	public @ResponseBody HashMap<String, String> doJSON(){
		
		// SampleVO vo = new SampleVO("»ùÇÃ»óÇ°",30000);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("name", "hong gil dong");
		map.put("age", "18");
		
		return map;
		
	}
	
	
}

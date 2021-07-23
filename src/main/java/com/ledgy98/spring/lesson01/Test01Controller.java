package com.ledgy98.spring.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/test01")
@Controller
public class Test01Controller {

	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		return "<h1> Test Project complate </h1>";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Object> map(){
		Map<String, Object> map = new HashMap<>();
		
		return map;
	}
	
}
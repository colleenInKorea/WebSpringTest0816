package com.ledgy98.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ledgy98.spring.lesson04.bo.RealtorBO;
import com.ledgy98.spring.lesson04.model.Realtor;

@RequestMapping("/lesson04/test02")
@Controller
public class RealtorController {
	
	@Autowired
	private RealtorBO realtorBO;
	
	@GetMapping("/1")
	public String addRealtorView() {
		
		return "lesson04/addRealtor";
	}
	
	@PostMapping("/add_realtor")
	public String addRealtor(
			@ModelAttribute Realtor realtor
			, Model model) {
		
		realtorBO.addRealtor(realtor);
		
		model.addAttribute("result", realtor);
		
		
		return "lesson04/realtorInfo";
	}
	
}

package com.ledgy98.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ledgy98.spring.lesson04.bo.SellerBO;
import com.ledgy98.spring.lesson04.model.Seller;

@RequestMapping("/lesson04/test01")
@Controller
public class SellerController {
	
	@Autowired
	private SellerBO sellerBO;
	
	@GetMapping("/add_seller")
	public String addSeller (
			@RequestParam ("nickname") String nickname
			, @RequestParam("profileImageUrl") String profileImageUrl
			, @RequestParam("temperature") double temperature
			) {
		
		int count = sellerBO.addSeller(nickname, profileImageUrl, temperature);
		
		return "redirect:/lesson04/test01/seller_info";
		
		// return "lesson04/addSellerSuccess";
	}
	
	@GetMapping("/seller_info")
	public String sellerInfo(
			@RequestParam(value = "id", required = false) Integer id, 
			Model model) {
		
		Seller seller = null;
		
		if(id == null) {
			seller = sellerBO.getSeller();
		}else {
			seller = sellerBO.getSeller();
		}
		
		model.addAttribute("result", seller);
		
		return "lesson04/sellerInfo";
		
	}
	
}

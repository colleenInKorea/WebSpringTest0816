package com.ledgy98.spring.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ledgy98.spring.lesson04.dao.SellerDAO;
import com.ledgy98.spring.lesson04.model.Seller;

@Service
public class SellerBO {
	
	@Autowired
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickName, String profileImageUrl, double temperature) {
			return sellerDAO.insertSeller(nickName, profileImageUrl, temperature);
	}
	
	public Seller getSeller() {
		return sellerDAO.selectSeller();
	}
	
	public Seller getSeller(int id) {
		return sellerDAO.selectSellerById(id);
	}
	
}

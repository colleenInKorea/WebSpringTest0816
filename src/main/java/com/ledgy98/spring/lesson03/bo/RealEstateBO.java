package com.ledgy98.spring.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ledgy98.spring.lesson03.dao.RealEstateDAO;
import com.ledgy98.spring.lesson03.model.RealEstate;

@Service
public class RealEstateBO {
		@Autowired
		private RealEstateDAO realEstateDAO;
		
		public RealEstate getRealEstate(int id) {
			 return realEstateDAO.selectRealEstate(id);
		}
		
		public List<RealEstate> getRealEstateAsRent(int rentPrice){
			return realEstateDAO.selectRealEstateAsRent(rentPrice);
		}
		
		public List<RealEstate> getRealEstateAsAreaPrice(int area, int price){
			return realEstateDAO.selectRealEstateAsAreaPrice(area, price);
		}
		
		// °´Ã¼·Î insert
		public int addRealEstateByObject(RealEstate realEstate) {
			return realEstateDAO.insertRealEstateByObject(realEstate);
		}
		
		public int AddRealEstate(int realtorId, String address, int area,  String type, int price, int rentPrice) {
			
			return realEstateDAO.insertRealEstate(realtorId, address, area, type, price, rentPrice);
		}
		
		//update info
		public int updateRealEstateById (int id, String type, int price) {
			return realEstateDAO.updateRealEstateById(id, type, price);
		}
		
		//delete info
		public int  deleteRealEstateById (int id) {
			return realEstateDAO.deleteRealEstateById(id);
		}
}

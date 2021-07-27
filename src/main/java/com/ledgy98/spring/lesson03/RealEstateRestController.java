package com.ledgy98.spring.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ledgy98.spring.lesson03.bo.RealEstateBO;
import com.ledgy98.spring.lesson03.model.RealEstate;

@RestController
@RequestMapping("/lesson03")
public class RealEstateRestController {
	
	@Autowired
	private RealEstateBO realEstateBO;
	
	//id�� select �ϱ� 
	@RequestMapping("/test01/1")
	public RealEstate test01_1(
			@RequestParam("id") int id
			) {
		 return realEstateBO.getRealEstate(id);
	}
	
	//���� ����
	// /test01/2
	@RequestMapping("/test01/2")
	public List<RealEstate> test01_2(
			@RequestParam("rent") int rentPrice
			){
		return realEstateBO.getRealEstateAsRent(rentPrice);
	}
	
	@RequestMapping("/test01/3")
	public List<RealEstate> test01_3(
			@RequestParam("area") int area, 
			@RequestParam("price") int price
			){
		return realEstateBO.getRealEstateAsAreaPrice(area, price);
	}
	
////��û URL : http://localhost/lesson03/test02/1
	
	@RequestMapping("/test02/1")
	public String test02_1() {
		
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("Ǫ������ ���� 303�� 1104ȣ");
		realEstate.setArea(89);
		realEstate.setType("�Ÿ�");
		realEstate.setPrice(100000);
		
		int count = realEstateBO.addRealEstateByObject(realEstate);
		
		return "insert ����: " + count;
	}
	
	@RequestMapping("/test02/2")
	public String test02_2(
			@RequestParam("realtorid") int realtorId) {
		
		int count = realEstateBO.AddRealEstate(realtorId, "�඼������ ���ǽ��� 814ȣ", 45, "����", 100000, 120);
		
		return "insert ���� : " + count;
	}
	
	@RequestMapping("/test03")
	public String test03(
			@RequestParam("id") int id, 
			@RequestParam("type") String type, 
			@RequestParam("price") int  price
			) {
		int count = realEstateBO.updateRealEstateById(id, type, price);
		
		return "���� ���� Ƚ��: " + count;
	}
	
	@RequestMapping("/test04")
	public String test04(
			@RequestParam("id") int id
			) {
			
		int count = realEstateBO.deleteRealEstateById(id);
				
		return "delete complate : " + count;
	}
}

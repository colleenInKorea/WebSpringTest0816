package com.ledgy98.spring.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ledgy98.spring.lesson03.model.RealEstate;

@Repository
public interface RealEstateDAO {
	
	//id로 select
	public RealEstate selectRealEstate(@Param("id") int id);
	
	//월세 조건 select
	public List<RealEstate> selectRealEstateAsRent(@Param("rentPrice") int rentPrice);
	
	public List<RealEstate> selectRealEstateAsAreaPrice(
			@Param("area")int area,
			@Param("price")int price);

	// 객체로 insert
		public int insertRealEstateByObject(RealEstate realEstate);
		
		public int insertRealEstate(
				@Param("realtorId") int realtorId
				, @Param("address") String address
				, @Param("area") int area
				, @Param("type") String type
				, @Param("price") int price
				, @Param("rentPrice") int rentPrice);
		
	//update Info
		public int updateRealEstateById(
				@Param("id") int id, 
				@Param("type") String type, 
				@Param("price") int price
				);
	
	//delete info
		public int deleteRealEstateById(@Param("id") int id); 

}

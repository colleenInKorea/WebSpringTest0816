package com.ledgy98.spring.lesson05.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ledgy98.spring.lesson05.model.Weather;

@Repository
public interface WeatherHistoryDAO {
	
	//select
	public List<Weather> selectWeatherHistory();
	
	//insert
	public int insertWeatherHistory(
			@Param("date") String date, 
			@Param("weather") String weather, 
			@Param("temperatures") double temperatures, 
			@Param("precipitation") double precipitation, 
			@Param("microDust") String microDust, 
			@Param("windSpeed") double windSpeed);
}

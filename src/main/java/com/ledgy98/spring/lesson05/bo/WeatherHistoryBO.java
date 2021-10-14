package com.ledgy98.spring.lesson05.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ledgy98.spring.lesson05.dao.WeatherHistoryDAO;
import com.ledgy98.spring.lesson05.model.Weather;

@Service
public class WeatherHistoryBO {
	
	@Autowired
	private WeatherHistoryDAO weatherHistoryDAO;
	
	//날씨 정보 리스트 가져오기 
	public List<Weather> getWeatherHistory(){
		return weatherHistoryDAO.selectWeatherHistory();
	}
	
	//날씨 정보 추가 
	public int addWeatherHistory(String date, String weather, double temperatures, double precipitation, String microDust, double windSpeed) {
		return weatherHistoryDAO.insertWeatherHistory(date, weather, temperatures, precipitation, microDust, windSpeed);
	}
}

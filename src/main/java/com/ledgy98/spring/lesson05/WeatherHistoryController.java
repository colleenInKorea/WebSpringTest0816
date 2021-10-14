package com.ledgy98.spring.lesson05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ledgy98.spring.lesson05.bo.WeatherHistoryBO;
import com.ledgy98.spring.lesson05.model.Weather;

@RequestMapping("/lesson05/test05")
@Controller
public class WeatherHistoryController {
	
	@Autowired
	private WeatherHistoryBO weatherHistoryBO;
	
	@GetMapping("/add_weather_view")
	public String addWeatherView() {
		return "lesson05/test05/addWeather";
	}
	
	@PostMapping("/add_weather")
	public String addWeather(
			@RequestParam("date") String date, 
			@RequestParam("weather") String weather,
			@RequestParam("temperatures") double temperatures,
			@RequestParam("precipitation") double precipitaion,
			@RequestParam("microDust") String microDust,
			@RequestParam("windSpeed") double windSpeed
			) {
		
		weatherHistoryBO.addWeatherHistory(date, weather, temperatures, precipitaion, microDust, windSpeed);
		
		return "redirect:/lesson05/test05/weather_history";
		
	}
	
	//  날씨 정보 리스트 
	@GetMapping("/weather_history")
	public String weatherHistory(Model model) {
		 List<Weather> weatherList = weatherHistoryBO.getWeatherHistory();
		 
		 model.addAttribute("weatherHistory", weatherList);
		 return "lesson05/test05/weatherHistory";
	}
}

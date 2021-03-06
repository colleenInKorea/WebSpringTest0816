package com.ledgy98.spring.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @Controller + @ResponseBody
@RequestMapping("/lesson01/test02")
public class Test02Controller {
	
	@RequestMapping("/1")
	public List<Map<String, Object>> movieList() {
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movie = new HashMap<>();
		movie.put("rate", 15);
		movie.put("director", "λ΄μ??Έ");
		movie.put("time", 131);
		movie.put("title", "κΈ°μμΆ?");
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "?Έ??? ?λ¦λ€?");
		movie.put("director", "λ‘λ² λ₯΄ν  λ² λ?");
		movie.put("time", 116);
		movie.put("rate", 0);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "?Έ??");
		movie.put("director", "?¬λ¦¬μ€? ?Ό ????");
		movie.put("time", 147);
		movie.put("rate", 12);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "λ²μ£??? ? ? : ????€ ? ?±???");
		movie.put("director", "?€μ’λΉ");
		movie.put("time", 133);
		movie.put("rate", 19);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "?κ±°κ²?");
		movie.put("director", "?????€ λ‘λ ?€");
		movie.put("time", 137);
		movie.put("rate", 15);
		movieList.add(movie);
		
		
		return movieList;
	}
	
	@RequestMapping("/2")
	public List<BoardContent> boardList() {
		List<BoardContent> boardList = new ArrayList<>();
		
		BoardContent content = new BoardContent("????Έ? κ°???Έ?¬ ?λ¦½λ?€."
				, "hagulu", "????Έ? κ°????΄? ??Όλ‘? ? λΆ?? ?? €?");
		boardList.add(content);
		

		content = new BoardContent();
		content.setTitle("? ??λ°?");
		content.setUser("bada");
		content.setContent("?€? λͺ©μ?Ό?΄ ??΄... κΈμ?Ό?Έμ€?");
		boardList.add(content);
		
		content = new BoardContent();
		content.setTitle("?€? ?°?΄?Έ ? ?΄?ΌκΈ? ?΄?λ¦΄κ²?.");
		content.setUser("dulumary");
		content.setContent("....");
		boardList.add(content);
		
		return boardList;
	}
	@RequestMapping("/3")
	public ResponseEntity<BoardContent> entity() {
		
		BoardContent content = new BoardContent("????Έ? κ°???Έ?¬ ?λ¦½λ?€."
				, "hagulu", "????Έ? κ°????΄? ??Όλ‘? ? λΆ?? ?? €?");
		
		ResponseEntity<BoardContent> entity = new ResponseEntity(content, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	

}

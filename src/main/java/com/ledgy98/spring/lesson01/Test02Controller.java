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
		movie.put("director", "봉�??��");
		movie.put("time", 131);
		movie.put("title", "기생�?");
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "?��?��?? ?��름다?��");
		movie.put("director", "로베르토 베니?��");
		movie.put("time", 116);
		movie.put("rate", 0);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "?��?��?��");
		movie.put("director", "?��리스?��?�� ????");
		movie.put("time", 147);
		movie.put("rate", 12);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "범죄???�� ?��?�� : ?��?��?��?�� ?��?��?��??");
		movie.put("director", "?��종빈");
		movie.put("time", 133);
		movie.put("rate", 19);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "?��거게?��");
		movie.put("director", "?��???��?�� 로렌?��");
		movie.put("time", 137);
		movie.put("rate", 15);
		movieList.add(movie);
		
		
		return movieList;
	}
	
	@RequestMapping("/2")
	public List<BoardContent> boardList() {
		List<BoardContent> boardList = new ArrayList<>();
		
		BoardContent content = new BoardContent("?��?��?��?��?�� �??��?��?�� ?��립니?��."
				, "hagulu", "?��?��?��?��?�� �??��?��?��?�� ?��?���? ?�� �??�� ?��?��?��");
		boardList.add(content);
		

		content = new BoardContent();
		content.setTitle("?�� ??�?");
		content.setUser("bada");
		content.setContent("?��?�� 목요?��?�� ?��?��... 금요?��?���?");
		boardList.add(content);
		
		content = new BoardContent();
		content.setTitle("?��?�� ?��?��?�� ?�� ?��?���? ?��?��릴게?��.");
		content.setUser("dulumary");
		content.setContent("....");
		boardList.add(content);
		
		return boardList;
	}
	@RequestMapping("/3")
	public ResponseEntity<BoardContent> entity() {
		
		BoardContent content = new BoardContent("?��?��?��?��?�� �??��?��?�� ?��립니?��."
				, "hagulu", "?��?��?��?��?�� �??��?��?��?�� ?��?���? ?�� �??�� ?��?��?��");
		
		ResponseEntity<BoardContent> entity = new ResponseEntity(content, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	

}

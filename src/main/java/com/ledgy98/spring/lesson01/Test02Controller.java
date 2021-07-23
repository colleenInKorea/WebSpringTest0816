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
		movie.put("director", "ë´‰ì??˜¸");
		movie.put("time", 131);
		movie.put("title", "ê¸°ìƒì¶?");
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "?¸?ƒ?? ?•„ë¦„ë‹¤?›Œ");
		movie.put("director", "ë¡œë² ë¥´í†  ë² ë‹ˆ?‹ˆ");
		movie.put("time", 116);
		movie.put("rate", 0);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "?¸?…‰?…˜");
		movie.put("director", "?¬ë¦¬ìŠ¤?† ?¼ ????");
		movie.put("time", 147);
		movie.put("rate", 12);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "ë²”ì£„???˜ ? „?Ÿ : ?‚˜?œ?†ˆ?“¤ ? „?„±?‹œ??");
		movie.put("director", "?œ¤ì¢…ë¹ˆ");
		movie.put("time", 133);
		movie.put("rate", 19);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "?—ê±°ê²Œ?„");
		movie.put("director", "?”„???‹œ?Š¤ ë¡œë Œ?Š¤");
		movie.put("time", 137);
		movie.put("rate", 15);
		movieList.add(movie);
		
		
		return movieList;
	}
	
	@RequestMapping("/2")
	public List<BoardContent> boardList() {
		List<BoardContent> boardList = new ArrayList<>();
		
		BoardContent content = new BoardContent("?•ˆ?…•?•˜?„¸?š” ê°??…?¸?‚¬ ?“œë¦½ë‹ˆ?‹¤."
				, "hagulu", "?•ˆ?…•?•˜?„¸?š” ê°??…?–ˆ?–´?š” ?•?œ¼ë¡? ?˜ ë¶??ƒ ?“œ? ¤?š”");
		boardList.add(content);
		

		content = new BoardContent();
		content.setTitle("?— ??ë°?");
		content.setUser("bada");
		content.setContent("?˜¤?Š˜ ëª©ìš”?¼?´ ?—ˆ?–´... ê¸ˆìš”?¼?¸ì¤?");
		boardList.add(content);
		
		content = new BoardContent();
		content.setTitle("?˜¤?Š˜ ?°?´?Š¸ ?•œ ?´?•¼ê¸? ?•´?“œë¦´ê²Œ?š”.");
		content.setUser("dulumary");
		content.setContent("....");
		boardList.add(content);
		
		return boardList;
	}
	@RequestMapping("/3")
	public ResponseEntity<BoardContent> entity() {
		
		BoardContent content = new BoardContent("?•ˆ?…•?•˜?„¸?š” ê°??…?¸?‚¬ ?“œë¦½ë‹ˆ?‹¤."
				, "hagulu", "?•ˆ?…•?•˜?„¸?š” ê°??…?–ˆ?–´?š” ?•?œ¼ë¡? ?˜ ë¶??ƒ ?“œ? ¤?š”");
		
		ResponseEntity<BoardContent> entity = new ResponseEntity(content, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	

}

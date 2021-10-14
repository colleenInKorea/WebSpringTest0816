package com.ledgy98.spring.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ledgy98.spring.lesson06.dao.FavoriteDAO;
import com.ledgy98.spring.lesson06.model.Favorite;


@Service
public class FavoriteBO {
	
	@Autowired
	private FavoriteDAO favoriteDAO;
	
	public int addFavorite(String title, String url) {
		return favoriteDAO.insertFavorite(title, url);
	}
	
	public List<Favorite> getFavoriteList(){
		return favoriteDAO.selectFavoriteList();
	}
	
	public boolean existFavoriteUrl (String url) {
		if(favoriteDAO.selectCountFavoriteUrl(url) > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int deleteFavorite(int id) {
		return favoriteDAO.deleteFavorite(id);
	}
	
}

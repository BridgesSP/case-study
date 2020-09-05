package com.CaseStudy.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CaseStudy.entities.Cart;
import com.CaseStudy.entities.Song;
import com.CaseStudy.services.CartService;
import com.CaseStudy.services.SongService;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String welcomehandler() {
		return "welcome";
	}
	
	@RequestMapping("/home")
	public String homehandler() {
		return "home";
	}
	
	@RequestMapping("/buysongs")
	public String buysongshandler(HttpServletRequest request) {
		
		
		String songname=request.getParameter("song"); 
		Song newsong=new Song();
		newsong.setSongtitle(songname);
		SongService songservice=new SongService();
		songservice.addSongService(song);
		Cart cart = new Cart();
		CartService cartservice = new CartService();
		cartservice.addService(song);
		
		return "buysongs";
	}
	
	@RequestMapping("/login")
	public String loginhandler() {
		return "login";
	}
	
	@RequestMapping("/create")
	public String createhandler() {
		return "create";
	}
	
	@RequestMapping("/cart")
	public String carthandler() {
		return "cart";
	}
	
	@RequestMapping("/logout")
	public String logouthandler() {
		return "logout";
	}
	
	
}

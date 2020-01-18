package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.data.Person;

@Controller
public class AppController {
	
	@RequestMapping("/home")
	public String homePage(ModelMap modelx) {
		
//		create person object inside this method
		Person x=new Person("101", "james","ja@gmail.com","NY");
		Person m= new Person("107", "CssK","ck@gmail.com","FL");
		modelx.put("x",x);
		modelx.put("m",m);
		return "home.jsp";
	}

}

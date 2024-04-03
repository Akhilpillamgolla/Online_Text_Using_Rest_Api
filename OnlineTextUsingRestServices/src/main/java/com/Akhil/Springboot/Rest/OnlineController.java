package com.Akhil.Springboot.Rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineController {
	
	@RequestMapping ("aki")        //mapping to Uri 
	public String hello() {
		return "🅷🅴🅻🅻🅾 🅰🅺🅷🅸🅻 🅿🅸🅻🅻🅰🅼🅶🅾🅻🅻🅰 🆆🅴🅻🅲🅾🅼🅴 🅱🅰🅲🅺"; // can see in Browser
		
		
		// no war file 
		//no dispatcherServlet
		//No xml COnfiguration 
		
		
		//This runs on embedded Tomcat Server
		
	}

}

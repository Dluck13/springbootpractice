package com.fleet.fleet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	
	@GetMapping("/index2")
	public String users() {
		return "index2";
	}
	
	


}

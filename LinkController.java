package com.ankur.nidhitya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Controller
public class LinkController {
	
	//Landing page
		public void addViewControllers(ViewControllerRegistry registry) {
		    registry.addViewController("/").setViewName("forward:/index.html");
		}
		
		@GetMapping("/home")
		public String home() {
		     return "index";
		    }
		
		
		@GetMapping("/products")
		public String batman() {
		     return "products";
		    }
		
		@GetMapping("/aboutus")
		public String aboutMe() {
		     return "aboutus";
		    }
		
		@GetMapping("/thankyou")
		public String superman() {
		     return "contact_thanks";
		    }

}

package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@Autowired
	private girlProperties girl;
	
//	@RequestMapping(value = {"/hello"} ,method=RequestMethod.GET)
	@GetMapping(value = "hello")
	public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
		return "id" + id;
	}
}

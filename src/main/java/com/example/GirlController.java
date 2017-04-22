package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/girls")
public class GirlController {
	
	@Autowired
	private GirlRepository girlRepository;
	
	@GetMapping(value = "/girls")
	public List<Girl> girlList(){
		return girlRepository.findAll();
	}
	
	@PostMapping(value = "/girls")
	public Girl girlAdd(@RequestParam("cupSize") String cupSize,
							@RequestParam("age") Integer age){
		Girl girl1 = new Girl();
		girl1.setAge(age);
		girl1.setCupSize(cupSize);
		
		return girlRepository.save(girl1);
	}
}

package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Prod;

@RestController
public class ProdController {
	
	@GetMapping("/allProd")
	public List<Prod> getAllProd(){
		List<Prod> prodList = Arrays.asList(new Prod(1001, "Srini", "dev"), new Prod(1002, "Srini", "dev"),
				new Prod(1003, "Srini", "dev"));
		return prodList;
	}

}

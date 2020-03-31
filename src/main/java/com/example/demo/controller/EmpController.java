package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.EmpVo;

@RestController
public class EmpController {

	@RequestMapping("/insertEmp")
	public String insertEmp(EmpVo e) {
		String str = "";
		
		return str;
	}
}

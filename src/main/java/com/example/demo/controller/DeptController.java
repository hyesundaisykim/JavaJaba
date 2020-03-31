package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DeptManager;
import com.example.demo.vo.DeptVo;
import com.google.gson.Gson;

@RestController
public class DeptController {
	
	@RequestMapping(value = "/listDept", produces ="application/json;charset=UTF-8" )
	public String listDept() {
		String str ="";
		List<DeptVo> list = DeptManager.listDept();
		Gson gson = new Gson();
		str = gson.toJson(list);
		return str;
	}
	
	@RequestMapping("/insertDept")
	public String insertDept(DeptVo d) {
		DeptManager.insertDept(d);
		String str = "ok";
		
		return str;
	}
	
}

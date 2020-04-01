package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.AopLogManager;
import com.example.demo.vo.AopLogVo;
import com.example.demo.vo.UrlCntVo;
import com.google.gson.Gson;

@RestController
public class AopLogController {

	@RequestMapping(value = "/listAop", produces = "application/json;charset=UTF-8")
	public String listAopLog() {
		String str ="";
		List<AopLogVo> list = AopLogManager.listAop();
		Gson gson = new Gson();
		str =gson.toJson(list);
		return str;
	}
	
	@RequestMapping(value = "/cunt.do", produces = "application/json;charset=UTF-8")
	public String listCunt() {
		String str = "";
		List<UrlCntVo> list = AopLogManager.listCnt();
		Gson gson = new Gson();
		str = gson.toJson(list);
		//System.out.println(str);
		return str;
	}
	
}

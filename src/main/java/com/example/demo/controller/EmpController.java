package com.example.demo.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.EmpDao;
import com.example.demo.db.EmpManager;
import com.example.demo.vo.EmpVo;
import com.google.gson.Gson;

@RestController
public class EmpController {

	
	@Autowired
	private EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/listEmp.do", produces = "application/json;charset=UTF-8")
	public String list(HttpServletRequest request) {
		String str = "";
		List<EmpVo> list = dao.listAll();
		Gson gson = new Gson();
		str = gson.toJson(list);
		return str;
	}
	
	@RequestMapping("/insertEmp")
	public String insertEmp(EmpVo e, HttpServletRequest request) {
		String str = "false";
		int re = dao.insertEmp(e);
		if(re>0) {
			str = "등록에 성공하였습니다.";
		}else {
			str = "등록에 실패하였습니다.";
		}
		return str;
	}
	
	@RequestMapping("/deleteEmp")
	public String deleteEmp(EmpVo e, HttpServletRequest request) {
		String str = "ok";
		EmpManager.deleteEmp(e);
		return str;
	}
	
	@RequestMapping("/updateEmp")
	public String updateEmp(EmpVo e, HttpServletRequest request) {
		String str = "ok";
		EmpManager.updateEmp(e);
		return str;
	}
	
}

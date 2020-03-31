package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.EmpDao;
import com.example.demo.vo.EmpVo;

@RestController
public class EmpController {


	

	@Autowired
	private EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/listEmp.do", produces = "application/json;charset=UTF-8")
	public void empList() {
		String str = "";
		List<EmpVo> list = dao.listAll();
		
	}
	
	@RequestMapping("/insertEmp")
	public String insertEmp(EmpVo e) {
		String str = "";
		
		return str;
	}
	
	
	
}

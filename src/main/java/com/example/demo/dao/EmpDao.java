package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.EmpManager;
import com.example.demo.vo.EmpVo;

@Repository
public class EmpDao {
	
	public List<EmpVo> listAll(){
		return EmpManager.listAll();
	}
}
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.EmpManager;
import com.example.demo.vo.MemberVo;

@RestController
public class MemberController {

	@RequestMapping("/login")
	public String login(MemberVo m) {
		String str = "no";
		MemberVo r = EmpManager.isMember(m);
		if(r != null) {
			System.out.println("로그인 성공");
			str = m.getId();
		}else {
			System.out.println("로그인 실패");
		}
		System.out.println("결과" + str);
		
		return str;
	}	
	
}
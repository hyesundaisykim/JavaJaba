package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AopLogVo {
	
	private int no;
	private String url;
	private String ip;
	private String time;

}

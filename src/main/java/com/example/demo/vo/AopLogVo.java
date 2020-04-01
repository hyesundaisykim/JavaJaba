package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class AopLogVo {
	
	private int no;
	private String url;
	private String ip;
	private String time;
	
	public AopLogVo(int no, String url, String ip, String time) {
		super();
		this.no = no;
		this.url = url;
		this.ip = ip;
		this.time = time;
	}

	public AopLogVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}

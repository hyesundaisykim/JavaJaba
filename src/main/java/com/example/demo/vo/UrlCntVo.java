package com.example.demo.vo;

public class UrlCntVo {
	private String url;
	private int cnt;
	
	public UrlCntVo(String url, int cnt) {
		super();
		this.url = url;
		this.cnt = cnt;
	}

	public UrlCntVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}		
}

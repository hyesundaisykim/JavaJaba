package com.example.demo.vo;

public class EmpVo {
	private int eno;
	private String ename;
	private String jab;
	private int sal;
	private int conn;
	private int mgr;
	private String hiredate;
	private int dno;
	private String email;
	private String jumin;
	
	public EmpVo(int eno, String ename, String jab, int sal, int conn, int mgr, String hiredate, int dno, String email,
			String jumin) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.jab = jab;
		this.sal = sal;
		this.conn = conn;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.dno = dno;
		this.email = email;
		this.jumin = jumin;
	}
	
	public EmpVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setEno(int eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJab(String jab) {
		this.jab = jab;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setConn(int conn) {
		this.conn = conn;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
		
}

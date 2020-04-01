package com.example.demo.db;

import java.io.Reader;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.EmpVo;
import com.example.demo.vo.MemberVo;

public class EmpManager {

	private static SqlSessionFactory factory;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	
	public static List<EmpVo> listAll(){
		SqlSession session = factory.openSession();
		List<EmpVo> list = session.selectList("emp.selectAll");
		System.out.println(list);
		session.close();
		return list;
	}
	
	public static int insertEmp(EmpVo e) {
		SqlSession session = factory.openSession(true);
		int re = session.insert("emp.insert", e);
		session.close();
		return re;
	}
	
	public static int deleteEmp(EmpVo e) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.delete("emp.delete", e);
		session.close();
		return re;
	}
	
	public static int updateEmp(EmpVo e) {
		int re =  -1;
		SqlSession session = factory.openSession(true);
		re= session.update("emp.update",e);
		session.close();
		return re;
	}
	
	
	public static MemberVo isMember(MemberVo m) {
		MemberVo r = null;
		SqlSession session = factory.openSession();
		r = session.selectOne("member.isMember", m);
		session.close();
		return r;
	}
	
}

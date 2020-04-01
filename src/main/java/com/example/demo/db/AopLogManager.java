package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.AopLogVo;
import com.example.demo.vo.UrlCntVo;

public class AopLogManager {

	public static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int insertAop(AopLogVo a) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("aopLog.insert",a);
		session.commit();
		session.close();
		return re;
	}
	
	public static List<AopLogVo> listAop(){
		SqlSession session = factory.openSession();
		List<AopLogVo> list = session.selectList("aopLog.selectAll");
		session.close();
		return list;
	}
	
	public static List<UrlCntVo> listCnt(){
		SqlSession session = factory.openSession();
		List<UrlCntVo> list = session.selectList("urlcnt.count");
		session.close();
		return list;
	}
	
}

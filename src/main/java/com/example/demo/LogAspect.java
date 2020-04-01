package com.example.demo;


import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.example.demo.db.AopLogManager;
import com.example.demo.vo.AopLogVo;

@Component
@Aspect
public class LogAspect {

	
	@Pointcut("execution(public * com.example.demo.controller..*(..))")
	private void aopMethod() {}
	
	@Before("aopMethod()")
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		
		HttpServletRequest request = (HttpServletRequest)joinPoint.getArgs()[0];
		String url = request.getRequestURI();
		String ip = request.getRemoteAddr();
		String time = new Date().toLocaleString();
		String msg = url + "\t" + ip + "\t" + time + "\r\n";
		
		Date today = new Date();
		int yy = today.getYear()+1900;
		int mm =today.getMonth()+1;
		int dd = today.getDate();
		String fname = yy +""+mm+""+dd+".txt";
		
		AopLogVo a = new AopLogVo();
		a.setUrl(url);
		a.setIp(ip);
		a.setTime(time);
		AopLogManager.insertAop(a);
		
	}
	
}

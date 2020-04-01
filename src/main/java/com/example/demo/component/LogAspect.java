package com.example.demo.component;


import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

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
		
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		String url = request.getRequestURI();
		
		if(url.equals("/listAop")) {
			//System.out.println("삭제하기");
			
		}else if(url.equals("/cunt.do")) {
			
		}else {
			String ip = request.getRemoteAddr();
			String time = new Date().toLocaleString();
			
			AopLogVo a = new AopLogVo();
			a.setUrl(url);
			a.setIp(ip);
			a.setTime(time);
			AopLogManager.insertAop(a);
		}
		
		
//		Object obj = new Object();
//		return obj;
	}	
}

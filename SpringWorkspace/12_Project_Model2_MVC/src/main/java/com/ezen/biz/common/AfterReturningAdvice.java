package com.ezen.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
/*
 * 입력 매겨변수 :
 * 	returnObj : 비즈니스메소드에서 리턴한 데이터를 저장
 */
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterReturningAdvice {
//	@Pointcut("execution(* com.ezen.biz..*Impl.get*(..))")
//	public void getPointcut() {}
	
	@AfterReturning(pointcut="PointcutCommon.getPointcut()",returning="returnObj")
	public void afterLog(JoinPoint jp,Object returnObj) {
		String method =jp.getSignature().getName();
		
		System.out.printf("[사후 처리] 메소드 : %s,리턴값: %s\n",
									method, returnObj.toString());
		}

}

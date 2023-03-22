package com.ezen.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
   public void beforeLog(JoinPoint jp) {
      String method=jp.getSignature().getName();//비즈니스 로직 메소드명 추출
      Object[] args=jp.getArgs();//메소드에 입력된 매개변수의 내용을 반환
      if(args.length==0) {//매개변수 없는경우
         System.out.println("[사전 처리] "+method+ "()메소드, 매개변수 없음 ");
      }else {
         System.out.println("[사전 처리] "+method+ "()메소드, 매개변수 정보 : "+args[0].toString());
      }
   }
}
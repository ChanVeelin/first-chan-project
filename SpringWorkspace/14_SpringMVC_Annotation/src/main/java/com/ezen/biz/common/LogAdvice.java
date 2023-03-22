package com.ezen.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
		public void printLog() {
			System.out.println("[공통로그]비즈니스 로직 수행 전 작업...");
		}
}

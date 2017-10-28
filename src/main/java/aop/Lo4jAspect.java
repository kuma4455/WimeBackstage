package aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Lo4jAspect {
	private static Logger logger = LogManager.getLogger(Lo4jAspect.class);
	
	@Before("execution(* controller.*(..))")
	public void beforeAdvice(JoinPoint joinPoint){
		
		System.out.println("成功執行aspect");
	}
	
}

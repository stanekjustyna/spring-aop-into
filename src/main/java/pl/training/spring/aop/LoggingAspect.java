package pl.training.spring.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Log
public class LoggingAspect {

    @Before("execution(* *.*Passenger(..))")
    public void before() {
        log.info("Entering method...");
    }

    @After("execution(* *.*Passenger(..))")
    public void after() {
        log.info("Exiting method...");
    }
}

package pl.training.spring.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Log
public class ExceptionAspect {

    @AfterThrowing(pointcut = "execution(* *(..))", throwing = "runtimeException")
    public void processException(RuntimeException runtimeException) throws Throwable{
        log.severe(runtimeException.getMessage());
    }

}

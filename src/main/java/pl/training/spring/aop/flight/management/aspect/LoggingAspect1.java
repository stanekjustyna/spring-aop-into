package pl.training.spring.aop.flight.management.aspect;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Log
@Order(1)
public class LoggingAspect1 {

    @Before("execution(public String pl.training.spring.aop.flight.management.domain.Flight.getId())")
    public void loggingAdviceGetId() {
        log.info("Flight getId method will be called");
    }

    @AfterReturning("execution(public * *.print())")
    public void loggingAdvicePrint() {
        log.warning("A print method has been called");
    }

    @Pointcut("within(pl.training.spring.aop.flight.management.domain.Ticket)")
    public void allTicketMethods() {}

    @After("allTicketMethods()")
    public void loggingAdvice(JoinPoint joinPoint) {
        log.info("A ticket method has been called");
        log.info(joinPoint.toString());
        log.info(joinPoint.getTarget().toString());
    }
}

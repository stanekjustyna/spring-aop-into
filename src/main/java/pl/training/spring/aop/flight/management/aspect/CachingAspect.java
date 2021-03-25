package pl.training.spring.aop.flight.management.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import pl.training.spring.aop.flight.management.dao.PassengerDaoImpl;
import pl.training.spring.aop.flight.management.domain.Passenger;

@Aspect
@Order(3)
public class CachingAspect {

    @Around("execution(* pl.training.spring.aop.flight.management.dao.PassengerDaoImpl.getPassenger(..))")
    public void cachePassenger(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] methodArgs = proceedingJoinPoint.getArgs();
        Passenger result = (Passenger) proceedingJoinPoint.proceed();

        int id = (Integer) methodArgs[0];

        if (!PassengerDaoImpl.getPassengersMap().containsKey(id)) {
            PassengerDaoImpl.getPassengersMap().put(id, result);
        }
    }
}

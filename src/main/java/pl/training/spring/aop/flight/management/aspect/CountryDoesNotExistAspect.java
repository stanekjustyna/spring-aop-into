package pl.training.spring.aop.flight.management.aspect;

import lombok.extern.java.Log;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import pl.training.spring.aop.flight.management.exception.CountryDoesNotExistException;

@Aspect
@Log
public class CountryDoesNotExistAspect {

    @AfterThrowing(pointcut="execution(* pl.training.spring.aop.flight.management.dao.PassengerDaoImpl.insert(..))",
    throwing = "ex")
    public void log(CountryDoesNotExistException ex) {
        log.severe("Attempt to insert a passenger with an unexisting country code");
    }
}

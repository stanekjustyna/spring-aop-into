package pl.training.spring.aop.flight.management.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import pl.training.spring.aop.flight.management.flyer.Flyer;
import pl.training.spring.aop.flight.management.flyer.FlyerImpl;

@Aspect
public class FlightAspect {

    @DeclareParents(value="pl.training.spring.aop.flight.management.domain.Flight", defaultImpl = FlyerImpl.class)
    private Flyer flight;
}

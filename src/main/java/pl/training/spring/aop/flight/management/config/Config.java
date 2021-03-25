package pl.training.spring.aop.flight.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.training.spring.aop.flight.management.aspect.FlightAspect;
import pl.training.spring.aop.flight.management.domain.Flight;

@Configuration
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public FlightAspect aspect() {
        return new FlightAspect();
    }

    @Bean
    public Flight flight() {
        Flight flight = new Flight();

        flight.setId("AA1234");
        flight.setCompany("ABC Flights");
        return flight;
    }
}

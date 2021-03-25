package pl.training.spring.aop.flight.management;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import pl.training.spring.aop.flight.management.config.Config;
import pl.training.spring.aop.flight.management.domain.Flight;
import pl.training.spring.aop.flight.management.flyer.Flyer;

import static org.junit.jupiter.api.Assertions.assertTrue;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Config.class)
public class FlyerTest {

    @Autowired
    private Flight flight;

    @Test
    public void flyerTest() {
        assertTrue(flight instanceof Flight);
        System.out.println(flight.getId());
        System.out.println(flight.getCompany());

        assertTrue(flight instanceof Flyer);
        ((Flyer)flight).takeOff();
        ((Flyer)flight).fly();
        ((Flyer)flight).land();

        System.out.println(flight.getClass().getName());
    }
}

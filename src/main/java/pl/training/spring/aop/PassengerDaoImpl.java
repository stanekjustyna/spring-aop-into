package pl.training.spring.aop;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

    private static Map<Long, Passenger> passengersMap = new HashMap<>();

    @Override
    public Passenger getPassenger(Long id) {
        if (null != passengersMap.get(id)) {
            return passengersMap.get(id);
        }
        if (id < 1) throw new RuntimeException("Incorrect id!");

        Passenger passenger = new Passenger(id);
        passengersMap.put(id, passenger);
        return passenger;
    }
}

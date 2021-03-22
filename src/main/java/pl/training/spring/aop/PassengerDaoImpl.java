package pl.training.spring.aop;

import java.util.HashMap;
import java.util.Map;

public class PassengerDaoImpl implements PassengerDao {

    private static Map<Long, Passenger> passengersMap = new HashMap<>();

    @Override
    public Passenger getPassenger(Long id) {
        if (null != passengersMap.get(id)) {
            return passengersMap.get(id);
        }
        Passenger passenger = new Passenger(id);
        passengersMap.put(id, passenger);
        return passenger;
    }
}

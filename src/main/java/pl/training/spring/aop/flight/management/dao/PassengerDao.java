package pl.training.spring.aop.flight.management.dao;

import pl.training.spring.aop.flight.management.domain.Passenger;

public interface PassengerDao {

    Passenger getPassenger(int id);
    void insert(Passenger passenger);
}

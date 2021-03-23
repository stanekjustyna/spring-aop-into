package pl.training.spring.aop.flight.management.domain;

import lombok.Data;

@Data
public class Ticket {

    private String number;
    private Passenger passenger;

    public String emittingCountry() {
        return passenger.getCountry();
    }

    @Override
    public String toString() {
        return "Ticket number: " + number;
    }
}

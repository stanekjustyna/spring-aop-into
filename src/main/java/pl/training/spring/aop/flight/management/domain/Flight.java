package pl.training.spring.aop.flight.management.domain;

import lombok.Data;

import java.util.List;

@Data
public class Flight {

    private String id;
    private String company;
    private List<Passenger> passengers;

    public void print() {
        for(Passenger passenger: this.passengers) {
            System.out.println(passenger);
        }
    }


}

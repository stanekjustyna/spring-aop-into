package pl.training.spring.aop.flight.management.domain;

import lombok.Data;

@Data
public class Passenger {

    private String name;
    private String country;

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Passenger " + name + " from " + country;
    }
}

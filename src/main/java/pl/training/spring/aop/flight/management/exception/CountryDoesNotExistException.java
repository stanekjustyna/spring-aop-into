package pl.training.spring.aop.flight.management.exception;

public class CountryDoesNotExistException extends RuntimeException {

    private String countryCode;

    public CountryDoesNotExistException(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}

package com.flightbooking.exception;

public class AirlinesNotExistException extends RuntimeException {

    public AirlinesNotExistException() {

        super(String.format("Airline Does not exist"));
    }
}

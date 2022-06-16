package com.alten.booking.exceptions;

public class BookingNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BookingNotFoundException(final String message) {
        super(message);
    }

}
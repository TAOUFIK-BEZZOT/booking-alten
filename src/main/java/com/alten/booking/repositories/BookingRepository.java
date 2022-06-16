package com.alten.booking.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alten.booking.entities.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {

}

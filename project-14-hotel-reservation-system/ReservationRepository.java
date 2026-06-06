package com.alhanoof.hotel.repository;

import com.alhanoof.hotel.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByBookingStatusIgnoreCase(String bookingStatus);

    List<Reservation> findByGuestNameContainingIgnoreCase(String guestName);
}

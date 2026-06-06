package com.alhanoof.hotel.mapper;

import com.alhanoof.hotel.dto.ReservationRequest;
import com.alhanoof.hotel.dto.ReservationResponse;
import com.alhanoof.hotel.entity.Reservation;

import java.time.LocalDate;

public class ReservationMapper {

    private ReservationMapper() {
    }

    public static Reservation toEntity(ReservationRequest request) {
        Double totalAmount = request.getNumberOfNights() * request.getNightlyRate();

        return new Reservation(
                request.getGuestName(),
                request.getRoomType().toUpperCase(),
                request.getNumberOfNights(),
                request.getNightlyRate(),
                totalAmount,
                request.getPaymentStatus().toUpperCase(),
                request.getBookingStatus().toUpperCase(),
                LocalDate.now()
        );
    }

    public static ReservationResponse toResponse(Reservation reservation) {
        return new ReservationResponse(
                reservation.getId(),
                reservation.getGuestName(),
                reservation.getRoomType(),
                reservation.getNumberOfNights(),
                reservation.getNightlyRate(),
                reservation.getTotalAmount(),
                reservation.getPaymentStatus(),
                reservation.getBookingStatus(),
                reservation.getReservationDate()
        );
    }

    public static void updateEntity(Reservation reservation, ReservationRequest request) {
        Double totalAmount = request.getNumberOfNights() * request.getNightlyRate();

        reservation.setGuestName(request.getGuestName());
        reservation.setRoomType(request.getRoomType().toUpperCase());
        reservation.setNumberOfNights(request.getNumberOfNights());
        reservation.setNightlyRate(request.getNightlyRate());
        reservation.setTotalAmount(totalAmount);
        reservation.setPaymentStatus(request.getPaymentStatus().toUpperCase());
        reservation.setBookingStatus(request.getBookingStatus().toUpperCase());
    }
}

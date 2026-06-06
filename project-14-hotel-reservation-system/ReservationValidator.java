package com.alhanoof.hotel.validation;

import com.alhanoof.hotel.dto.ReservationRequest;
import com.alhanoof.hotel.exception.ValidationException;
import com.alhanoof.hotel.util.Constants;

public class ReservationValidator {

    private ReservationValidator() {
    }

    public static void validateRoomType(ReservationRequest request) {
        String roomType = request.getRoomType().toUpperCase();

        if (!roomType.equals(Constants.STANDARD)
                && !roomType.equals(Constants.DELUXE)
                && !roomType.equals(Constants.SUITE)) {
            throw new ValidationException("Room type must be STANDARD, DELUXE, or SUITE");
        }
    }

    public static void validatePaymentStatus(ReservationRequest request) {
        String paymentStatus = request.getPaymentStatus().toUpperCase();

        if (!paymentStatus.equals(Constants.PAID)
                && !paymentStatus.equals(Constants.PENDING)
                && !paymentStatus.equals(Constants.FAILED)) {
            throw new ValidationException("Payment status must be PAID, PENDING, or FAILED");
        }
    }

    public static void validateBookingStatus(ReservationRequest request) {
        String bookingStatus = request.getBookingStatus().toUpperCase();

        if (!bookingStatus.equals(Constants.CONFIRMED)
                && !bookingStatus.equals(Constants.CHECKED_IN)
                && !bookingStatus.equals(Constants.CHECKED_OUT)
                && !bookingStatus.equals(Constants.CANCELLED)) {
            throw new ValidationException("Booking status must be CONFIRMED, CHECKED_IN, CHECKED_OUT, or CANCELLED");
        }
    }
}

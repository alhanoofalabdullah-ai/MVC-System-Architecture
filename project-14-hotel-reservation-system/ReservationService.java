package com.alhanoof.hotel.service;

import com.alhanoof.hotel.dto.ReservationRequest;
import com.alhanoof.hotel.dto.ReservationResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ReservationService {

    ReservationResponse createReservation(ReservationRequest request);

    List<ReservationResponse> getAllReservations();

    ReservationResponse getReservationById(Long id);

    ReservationResponse updateReservation(Long id, ReservationRequest request);

    String deleteReservation(Long id);

    List<ReservationResponse> searchByBookingStatus(String bookingStatus);

    List<ReservationResponse> searchByGuestName(String guestName);

    Page<ReservationResponse> getReservationsWithPagination(int page, int size, String sortBy);
}

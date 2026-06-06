package com.alhanoof.hotel.service;

import com.alhanoof.hotel.dto.ReservationRequest;
import com.alhanoof.hotel.dto.ReservationResponse;
import com.alhanoof.hotel.entity.Reservation;
import com.alhanoof.hotel.exception.ResourceNotFoundException;
import com.alhanoof.hotel.mapper.ReservationMapper;
import com.alhanoof.hotel.repository.ReservationRepository;
import com.alhanoof.hotel.validation.ReservationValidator;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository repository;

    public ReservationServiceImpl(ReservationRepository repository) {
        this.repository = repository;
    }

    public ReservationResponse createReservation(ReservationRequest request) {
        ReservationValidator.validateRoomType(request);
        ReservationValidator.validatePaymentStatus(request);
        ReservationValidator.validateBookingStatus(request);

        Reservation reservation = ReservationMapper.toEntity(request);
        return ReservationMapper.toResponse(repository.save(reservation));
    }

    public List<ReservationResponse> getAllReservations() {
        return repository.findAll().stream().map(ReservationMapper::toResponse).toList();
    }

    public ReservationResponse getReservationById(Long id) {
        Reservation reservation = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation not found with id: " + id));

        return ReservationMapper.toResponse(reservation);
    }

    public ReservationResponse updateReservation(Long id, ReservationRequest request) {
        ReservationValidator.validateRoomType(request);
        ReservationValidator.validatePaymentStatus(request);
        ReservationValidator.validateBookingStatus(request);

        Reservation reservation = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation not found with id: " + id));

        ReservationMapper.updateEntity(reservation, request);
        return ReservationMapper.toResponse(repository.save(reservation));
    }

    public String deleteReservation(Long id) {
        Reservation reservation = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation not found with id: " + id));

        repository.delete(reservation);
        return "Reservation deleted successfully";
    }

    public List<ReservationResponse> searchByBookingStatus(String bookingStatus) {
        return repository.findByBookingStatusIgnoreCase(bookingStatus)
                .stream().map(ReservationMapper::toResponse).toList();
    }

    public List<ReservationResponse> searchByGuestName(String guestName) {
        return repository.findByGuestNameContainingIgnoreCase(guestName)
                .stream().map(ReservationMapper::toResponse).toList();
    }

    public Page<ReservationResponse> getReservationsWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
        return repository.findAll(pageable).map(ReservationMapper::toResponse);
    }
}

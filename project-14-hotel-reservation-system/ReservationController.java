package com.alhanoof.hotel.controller;

import com.alhanoof.hotel.dto.ReservationRequest;
import com.alhanoof.hotel.dto.ReservationResponse;
import com.alhanoof.hotel.service.ReservationService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @PostMapping
    public ReservationResponse createReservation(@Valid @RequestBody ReservationRequest request) {
        return service.createReservation(request);
    }

    @GetMapping
    public List<ReservationResponse> getAllReservations() {
        return service.getAllReservations();
    }

    @GetMapping("/{id}")
    public ReservationResponse getReservationById(@PathVariable Long id) {
        return service.getReservationById(id);
    }

    @PutMapping("/{id}")
    public ReservationResponse updateReservation(@PathVariable Long id, @Valid @RequestBody ReservationRequest request) {
        return service.updateReservation(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteReservation(@PathVariable Long id) {
        return service.deleteReservation(id);
    }

    @GetMapping("/search/status")
    public List<ReservationResponse> searchByBookingStatus(@RequestParam String bookingStatus) {
        return service.searchByBookingStatus(bookingStatus);
    }

    @GetMapping("/search/guest")
    public List<ReservationResponse> searchByGuestName(@RequestParam String guestName) {
        return service.searchByGuestName(guestName);
    }

    @GetMapping("/paged")
    public Page<ReservationResponse> getReservationsWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getReservationsWithPagination(page, size, sortBy);
    }
}

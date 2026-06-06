package com.alhanoof.hotel.dto;

import java.time.LocalDate;

public class ReservationResponse {

    private Long id;
    private String guestName;
    private String roomType;
    private Integer numberOfNights;
    private Double nightlyRate;
    private Double totalAmount;
    private String paymentStatus;
    private String bookingStatus;
    private LocalDate reservationDate;

    public ReservationResponse(Long id,
                               String guestName,
                               String roomType,
                               Integer numberOfNights,
                               Double nightlyRate,
                               Double totalAmount,
                               String paymentStatus,
                               String bookingStatus,
                               LocalDate reservationDate) {
        this.id = id;
        this.guestName = guestName;
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.nightlyRate = nightlyRate;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
        this.bookingStatus = bookingStatus;
        this.reservationDate = reservationDate;
    }

    public Long getId() { return id; }

    public String getGuestName() { return guestName; }

    public String getRoomType() { return roomType; }

    public Integer getNumberOfNights() { return numberOfNights; }

    public Double getNightlyRate() { return nightlyRate; }

    public Double getTotalAmount() { return totalAmount; }

    public String getPaymentStatus() { return paymentStatus; }

    public String getBookingStatus() { return bookingStatus; }

    public LocalDate getReservationDate() { return reservationDate; }
}

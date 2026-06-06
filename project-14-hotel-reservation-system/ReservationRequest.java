package com.alhanoof.hotel.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ReservationRequest {

    @NotBlank
    private String guestName;

    @NotBlank
    private String roomType;

    @Positive
    private Integer numberOfNights;

    @Positive
    private Double nightlyRate;

    @NotBlank
    private String paymentStatus;

    @NotBlank
    private String bookingStatus;

    public String getGuestName() { return guestName; }

    public String getRoomType() { return roomType; }

    public Integer getNumberOfNights() { return numberOfNights; }

    public Double getNightlyRate() { return nightlyRate; }

    public String getPaymentStatus() { return paymentStatus; }

    public String getBookingStatus() { return bookingStatus; }

    public void setGuestName(String guestName) { this.guestName = guestName; }

    public void setRoomType(String roomType) { this.roomType = roomType; }

    public void setNumberOfNights(Integer numberOfNights) { this.numberOfNights = numberOfNights; }

    public void setNightlyRate(Double nightlyRate) { this.nightlyRate = nightlyRate; }

    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }

    public void setBookingStatus(String bookingStatus) { this.bookingStatus = bookingStatus; }
}

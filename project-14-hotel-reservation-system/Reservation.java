package com.alhanoof.hotel.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "hotel_reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String guestName;

    private String roomType;

    private Integer numberOfNights;

    private Double nightlyRate;

    private Double totalAmount;

    private String paymentStatus;

    private String bookingStatus;

    private LocalDate reservationDate;

    public Reservation() {
    }

    public Reservation(String guestName,
                       String roomType,
                       Integer numberOfNights,
                       Double nightlyRate,
                       Double totalAmount,
                       String paymentStatus,
                       String bookingStatus,
                       LocalDate reservationDate) {
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

    public void setGuestName(String guestName) { this.guestName = guestName; }

    public void setRoomType(String roomType) { this.roomType = roomType; }

    public void setNumberOfNights(Integer numberOfNights) { this.numberOfNights = numberOfNights; }

    public void setNightlyRate(Double nightlyRate) { this.nightlyRate = nightlyRate; }

    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }

    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }

    public void setBookingStatus(String bookingStatus) { this.bookingStatus = bookingStatus; }

    public void setReservationDate(LocalDate reservationDate) { this.reservationDate = reservationDate; }
}

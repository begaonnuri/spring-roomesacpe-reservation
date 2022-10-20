package nextstep.app.web.dto;

import nextstep.core.reservation.Reservation;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationWebResponse {
    private final Long id;
    private final LocalDate date;
    private final LocalTime time;
    private final String name;

    private ReservationWebResponse(Long id, LocalDate date, LocalTime time, String name) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.name = name;
    }

    public static ReservationWebResponse from(Reservation reservation) {
        return new ReservationWebResponse(reservation.getId(), reservation.getDate(), reservation.getTime(), reservation.getName());
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getName() {
        return name;
    }
}

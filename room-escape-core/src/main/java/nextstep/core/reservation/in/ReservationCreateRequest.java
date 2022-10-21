package nextstep.core.reservation.in;

import nextstep.core.reservation.Reservation;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationCreateRequest {
    private final LocalDate date;
    private final LocalTime time;
    private final String name;

    public ReservationCreateRequest(LocalDate date, LocalTime time, String name) {
        this.date = date;
        this.time = time;
        this.name = name;
    }

    public Reservation to() {
        return new Reservation(date, time, name);
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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern(
            "MM/d/yyyy HH:mm:ss"
        );
        return LocalDateTime.parse(appointmentDateDescription, pattern);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime today = LocalDateTime.now();
        return appointmentDate.isBefore(today);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        boolean isAfternoon =
            appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;

        return isAfternoon;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern(
            "EEEE, MMMM d, yyyy, 'at' h:mm a"
        );

        return String.format(
            "You have an appointment on %s.",
            appointmentDate.format(pattern)
        );
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}

// DateTimeFormatter patterns examples:
// https://howtodoinjava.com/java/date-time/java8-datetimeformatter-example/

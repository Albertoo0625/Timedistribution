package Average_Time_Calculator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class two extends Computer{

    private String Location;

    public two(String name, LocalTime currentTime, LocalDate currentDate, String location) {
        super(name, currentTime, currentDate);
        Location = location;
    }

    public LocalTime time(){
        LocalTime LT= this.setCurrentTime(LocalTime.now().plusHours(1));
        return LT;

    }
    public LocalDate date(){
        LocalDate LD= this.setCurrentDate(LocalDate.now().plusDays(1));
        return LD;
    }

    public LocalDateTime dateTime(){
        LocalDateTime LDT= LocalDateTime.of(date(),time());
        return LDT;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}

package Average_Time_Calculator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class one extends Computer{
    private String Location;

    public one(String name, LocalTime currentTime, LocalDate currentDate, String location) {
        super(name, currentTime, currentDate);
        Location = location;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Location: " + this.getLocation());

    }

    public LocalTime time(){
        LocalTime LT= this.setCurrentTime(LocalTime.now());
        return LT;
    }
    public LocalDate date(){
       LocalDate LD= this.setCurrentDate(LocalDate.now());
        return LD;
    }

    public LocalDateTime dateTime(){
        LocalDateTime LDT= LocalDateTime.of(date(),time());
        return LDT;
    }

//    public LocalDateTime getDateTime(LocalDateTime LDT){
//       return LocalDateTime.of(date(),time());
//    }
    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}

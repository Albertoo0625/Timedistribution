package Average_Time_Calculator;

import java.time.LocalDate;
import java.time.LocalTime;

public class Computer {
    public String Name;
    public LocalTime currentTime;
    public LocalDate currentDate;

    public Computer(String name, LocalTime currentTime, LocalDate currentDate) {
        Name = name;
        this.currentTime = currentTime;
        this.currentDate = currentDate;
    }


    public void getDetails(){
        System.out.println("Computer Name: " + this.getName()) ;
        System.out.println("CurrentTime: " + this.getCurrentTime()) ;
        System.out.println("CurrentDate: " + this.getCurrentDate()) ;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalTime getCurrentTime() {
        return currentTime;
    }

    public LocalTime setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
        return currentTime;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public LocalDate setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
        return currentDate;
    }
}

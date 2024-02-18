package Average_Time_Calculator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Network Master = new Network(2,
                new one("lenovo", LocalTime.now(),LocalDate.now(), "Kaboi"),
                new two("Dell", LocalTime.now(), LocalDate.now(), "Kaboi"));

        System.out.println("One DateTime: " + Network.one.dateTime());
        System.out.println("Two DateTime: " + Network.two.dateTime());

        Scanner scanner = new Scanner(System.in);

        boolean shouldExit = false;

        while (!shouldExit) {
            System.out.println("choose an option " +
                    "\n\t 1.GET ONE DETAILS" +
                    "\n\t 2.GET TWO DETAILS"+
                    "\n\t 3.EXIT"

            );
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (null != Network.one.currentTime) {
                        Network.one.getDetails();
                    } else continue;

                    break;
                case 2:
                    if (null != Network.two.currentTime) {
                        Network.two.getDetails();
                    }else continue;

                    break;
                case 3:
                    shouldExit=true;
            }
        }
    }
}
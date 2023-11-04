package day15_dateandtime_enum_stringBuilder;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C01DateAndTime01 {
    public static void main(String[] args) {


        // How to get local date:
        LocalDate myDate = LocalDate.now(); // Obtains the current date from the system clock in the default time-zone
        System.out.println(myDate);

        // How to go to future date
        LocalDate futureDate = myDate.
                plusDays(20).
                plusMonths(2).
                plusYears(55); // method chain
        System.out.println(futureDate);

        // How to go to past
        LocalDate pastDate = myDate.
                minusMonths(69).
                minusYears(25);
        System.out.println(pastDate);


        // How to format date:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String currentDate = dtf.format(myDate);
        System.out.println(currentDate);


        /////////////////////////////////////////////////////////////////////////
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String currentDate1 = dt.format(myDate);
        System.out.println(currentDate1);

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        // how to go future and past:
        LocalTime anotherTime = currentTime.plusHours(2).
                plusMinutes(20).
                minusSeconds(30);
        System.out.println(anotherTime);

        // How to format time:
        // DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("hh:mm a");
        String strTime = format1.format(currentTime);
        System.out.println("strTime = " + strTime);


        // Local time in toronto
        LocalTime timeInToronto = LocalTime.now(ZoneId.of("America/Toronto"));
        System.out.println("timeInToronto = " + timeInToronto);


        // How to set certain time:
        // 15:30
        LocalTime time = LocalTime.of(15,30);
        System.out.println("time = " + time);


        // How to get both date and time
        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println("dateAndTime = " + dateAndTime);
        System.out.println("dateAndTime.getDayOfYear() = " + dateAndTime.getDayOfYear());
        System.out.println("dateAndTime.getDayOfMonth() = " + dateAndTime.getDayOfMonth());
        System.out.println("dateAndTime.getDayOfWeek() = " + dateAndTime.getDayOfWeek());


        System.out.println("dateAndTime.getMonthValue() = " + dateAndTime.getMonthValue());
        Month month = dateAndTime.getMonth();
        System.out.println("month = " + month);


        //Example 4: If the given date is before the current date give message to user like "Invalid date"
        //           If the given date equals the current date give message to user like "Give the time"
        //           If the time is before current time tell to user "No ticket" otherwise tell to user "There is just 1 ticket"
        //           If the given date is after the current date give message to user like "Buy the ticket"


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the date...");
        System.out.println("First enter year...");
        int year = input.nextInt();
        System.out.println("Second enter month...");
        int mont = input.nextInt();
        System.out.println("Last enter day...");
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);
        if (givenDate.isBefore(myDate)){
            System.out.println("Invalid Date!...");
        }else if (givenDate.isEqual(myDate)){
            System.out.println("Enter the hour:...");
            int hour = input.nextInt();
            System.out.println("Enter the minutes:...");
            int minutes = input.nextInt();

            LocalTime givenTime = LocalTime.of(hour,minutes);
            if (givenTime.isAfter(currentTime)){
                System.out.println("There is just 1 ticket");
            }else {
                System.out.println("There is no ticket ! Sorry lowda...");
            }
        }else if (givenDate.isAfter(myDate)){
            System.out.println("But ticket ! ...");
        }


    }
}

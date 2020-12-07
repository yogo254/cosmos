package cosmos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String... args) {

        LocalDate today = LocalDate.now();

        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        int year = today.getYear();

        System.out.println("day:" + day + " month: " + month + " year: " + year);

        LocalDate pastMonth = today.minusMonths(1);

        System.out.println(today.toString());
        System.out.println(pastMonth.toString());

        System.out.println(today.compareTo(today.plusDays(1)));

    }
}
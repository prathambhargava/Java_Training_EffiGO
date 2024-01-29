package DateConversions_Assign1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date and time (dd/MM/yyyy HH:mm): ");
        String userInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime localDT = null;
        try {
            localDT = LocalDateTime.parse(userInput, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date and time format. Please use the format dd/MM/yyyy HH:mm");
            System.exit(1); 
        }
        LocalDateTime addOneDay = localDT.plusDays(1);
        LocalDateTime minusTenDays = localDT.minusDays(10);
        LocalDateTime addOneHour = localDT.plusHours(1);
        LocalDateTime minusFiveHoursThirtyMins = localDT.minusHours(5).minusMinutes(30);

        List<LocalDateTime> dateList = new ArrayList<>();
        dateList.add(localDT);
        dateList.add(addOneDay);
        dateList.add(minusTenDays);
        dateList.add(addOneHour);
        dateList.add(minusFiveHoursThirtyMins);

        Collections.sort(dateList, Comparator.naturalOrder());

        System.out.println("Original Date: " + localDT.format(formatter));
        System.out.println("After Adding one day: " + addOneDay.format(formatter));
        System.out.println("After Subtracting 10 days: " + minusTenDays.format(formatter));
        System.out.println("After Adding 1 hour: " + addOneHour.format(formatter));
        System.out.println("After Subtracting 5 hours and 30 minutes: " + minusFiveHoursThirtyMins.format(formatter));

        System.out.println("\nSorted Dates:");
        for (LocalDateTime date : dateList) {
            System.out.println(date.format(formatter));
        }
    }
}

package DateConversions_Assign1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date and time (dd/MM/yyyy HH:mm): ");
        String userInput = scanner.nextLine();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            LocalDateTime localDT = LocalDateTime.parse(userInput, formatter);
            long unix = localDT.atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli();
            System.out.println("Unix Timestamp: " + unix);

            ZonedDateTime zonedIST = localDT.atZone(ZoneId.of("Asia/Kolkata"));
            ZonedDateTime zonedUTC = zonedIST.withZoneSameInstant(ZoneId.of("UTC"));
            System.out.println("UTC Timestamp: " + zonedUTC.format(formatter));
            
            LocalDateTime localUTC = zonedUTC.toLocalDateTime();
            System.out.println("Local Timestamp (IST): " + localUTC.format(formatter));

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use the format dd/MM/yyyy HH:mm");
        }
    }
}

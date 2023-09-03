package HT1;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type date in format: yyyy/mm/dd:");

        String inputDate = scanner.next();

        String[] arr = inputDate.split("/");

        int year = Integer.parseInt(arr[0]);

        int month = Integer.parseInt(arr[1]);

        int day = Integer.parseInt(arr[2]);

//        System.out.println(Arrays.toString(arr));

        LocalDate localDate = LocalDate.of(year, month, day);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        System.out.println(dayOfWeek);


    }

}

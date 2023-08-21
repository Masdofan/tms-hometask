package HT2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        int dayOfWeek = 3;

        int dayOfWeekNow = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(dayOfWeekNow);

        int days = dayOfWeek - dayOfWeekNow;

    }

}

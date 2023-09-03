package HT2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Main {

    public static void main(String[] args) {

        int dayOfWeekToFound = 3;

        Calendar calendar = new GregorianCalendar();

        int weekDayNow = calendar.get(Calendar.DAY_OF_WEEK);

        int daysLeft = dayOfWeekToFound - weekDayNow;

        if (daysLeft < 0) {
            daysLeft += 7;
        }

        calendar.add(Calendar.DAY_OF_YEAR, daysLeft);

        Date date = calendar.getTime();

        String nextTue = new SimpleDateFormat("dd/MM/yyyy").format(date);

        System.out.println(nextTue);




    }

}

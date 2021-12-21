package dates;
import java.util.*;

import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SUNDAY;

public class Dispatcher {

    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        d.set(Calendar.DAY_OF_MONTH, 1);
        int weekday = d.get(Calendar.DAY_OF_WEEK);

        System.out.println("Пн.  Вт.  Ср.  Чт.  Пт.  Сб.  Вс.");

        for (int i = MONDAY; i<weekday; i++) {
            System.out.print("     ");
        }

        do {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            if (day == today) {
            System.out.print("* ");
            } else {
            System.out.print("  ");
            }
            if (weekday == SUNDAY) {
            System.out.println();
            }
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }
        while (d.get(Calendar.MONTH) == month);
    }
}

/*
    int date = 0;
    int year = 0;
    GregorianCalendar gc = new GregorianCalendar();
        gc.set(Calendar.MONTH, Calendar.JULY);
                gc.set(Calendar.DAY_OF_MONTH, 28);
                gc.set(Calendar.YEAR, 2022);
                date = gc.get(Calendar.DAY_OF_WEEK)-1;
                year = gc.get(Calendar.YEAR);
                System.out.println("date = " + date);
                System.out.println("year = " + year); */
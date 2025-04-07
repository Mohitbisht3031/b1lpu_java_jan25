package Day27;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class utility {
    public static void main(String[] args) {
        // Date class
        Date d = new Date();
        System.out.println("current date is "+d);

        // calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(c.getTime());

        c.set(2023,Calendar.NOVEMBER,10);
        System.out.println(c.getTime());

        // Local
        LocalDate ld  = LocalDate.now();
        System.out.println(ld);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld2 = LocalDate.of(2023,8,30);
        System.out.println(ld2);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        String fd = format.format(d);
        System.out.println(fd);

    }
}

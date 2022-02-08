package app;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Programa {
    public static void main(String[] args){
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2022-02-08T16:35:00Z"));

        System.out.println(sdf1.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 3);
        d = cal.getTime();

        System.out.println(sdf1.format(d));

        //Obtendo uma unidade de tempo

        int minutes = cal.get(Calendar.MINUTE);
        System.out.println("Minutes: " + minutes);

        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println("Mes: " + month);
    }
}

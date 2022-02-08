package app.exemplos;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.text.ParseException;
import java.util.TimeZone;

public class ExemploAula {
    public static void main(String[] args) throws ParseException {
        // É usado para formatar uma data, nesse caso com dia, mes e ano
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        // É usado para formatar uma data, nesse caso com dia, mes, ano, Hora, minutos e segundos
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

    Date y1 = sdf1.parse("25/06/2018");
    Date y2 = sdf2.parse("25/06/2018 15:42:07");
    // Busca a hora atual de acordo com o sua localização
    Date x1 = new Date();
    // Busca a hora atual de acordo com o sua localização
    Date x2 = new Date(System.currentTimeMillis());
    // É passado um parâmetro em milisegundos e é convertido para a data que foi
    Date x3 = new Date(0L);
        // Aqui foi passado um parametro para calcular 5 horas e retorna a data
    Date x4 = new Date(1000L * 60L * 60L * 5L);

    Date x5 = Date.from(Instant.parse("2022-02-08T16:11:00Z"));


        System.out.println("----------------------------------------------------------");
        System.out.println("======================= UTC ==============================");
        System.out.println("----------------------------------------------------------");
        System.out.println("Y1: " + y1);
        System.out.println("----------------------------------------------------------");
        System.out.println("Y2: " + y2);
        System.out.println("----------------------------------------------------------");
        System.out.println("SDF1: " + sdf1.format(y1));
        System.out.println("----------------------------------------------------------");
        System.out.println("SDF2: " + sdf2.format(y2));
        System.out.println("----------------------------------------------------------");
        System.out.println("X1: " + sdf2.format(x1));
        System.out.println("----------------------------------------------------------");
        System.out.println("X2: " + sdf2.format(x2));
        System.out.println("----------------------------------------------------------");
        System.out.println("X3: " + sdf2.format(x3));
        System.out.println("----------------------------------------------------------");
        System.out.println("X4: " + sdf2.format(x4));
        System.out.println("----------------------------------------------------------");
        System.out.println("X5: " + sdf2.format(x5));
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("======================== GMT =============================");
        System.out.println("----------------------------------------------------------");
        System.out.println("X1: " + sdf3.format(x1));
        System.out.println("----------------------------------------------------------");
        System.out.println("X2: " + sdf3.format(x2));
        System.out.println("----------------------------------------------------------");
        System.out.println("X3: " + sdf3.format(x3));
        System.out.println("----------------------------------------------------------");
        System.out.println("X4: " + sdf3.format(x4));
        System.out.println("----------------------------------------------------------");
        System.out.println("X5: " + sdf3.format(x5));
    }
}

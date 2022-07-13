package Data;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author caian
 */
public class Data {
  public static void main(String[] args) throws ParseException {
    // DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    // Cria um Objeto LocalDate com a data atual.
    // LocalDate hoje = LocalDate.now();

    LocalDate entrada = LocalDate.now();
    LocalTime entradaTime = LocalTime.now();
    // create a LocalTime Objects
    LocalTime time = LocalTime.parse("03:18");

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    String value = time.format(formatter);

    System.out.println("value : " + value);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println("Entrada: " + entrada.format(dtf) + " " + entradaTime.format(formatter));
    LocalDate saida = entrada.plusDays(2);
    LocalTime saidaTime = entradaTime.minusHours(1);

    System.out.println("Saída: " + saida.format(dtf) + " " + saidaTime.format(formatter));

    // Cria um Objeto LocalDate com a data 26/09/2020.
    LocalDate outraData = LocalDate.of(2020, Month.SEPTEMBER, 26);

    // Date outraData2 = new Date(df.parse("10/10/2021").getTime());
    Date outraData2 = Date.valueOf(LocalDate.parse("10/10/2021", dtf));

    Calendar gc = Calendar.getInstance();
    // Calcula a diferença de dias entre as duas datas

    Date date = new Date(System.currentTimeMillis());
    // LocalDate.
    System.out.println(date);
    // gc.set(Calendar.HOUR_OF_DAY, 15);
    System.out.println(gc.getTimeInMillis());
    DateFormat formatBrasil = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
    System.out.println(formatBrasil.format(gc.getTime())); // Segunda-feira, 14 de Março de 2016
    System.out.println(formatBrasil.format(outraData2)); // Segunda-feira, 14 de Março de 2016
    System.out.println(formatBrasil.format(Date.valueOf(outraData)));

    DateFormat formatEUA = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
    System.out.println(formatEUA.format(gc.getTime())); // Monday, March 14, 2016

    DateFormat formatItalia = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALIAN);
    System.out.println(formatItalia.format(gc.getTime())); // lunedì 14 marzo 2016

    // Adiciona 10 dias:
    gc.add((Calendar.DAY_OF_MONTH), 10);
    System.out.println(formatBrasil.format(gc.getTime()));
    // gc.isLeapYear(2015);

    System.out.println("Ano: " + gc.get(Calendar.YEAR)); // Ano: 2016
    System.out.println("Mês: " + gc.get(Calendar.MONTH)); // Mês: 2
    System.out.println("Dia do mês: " + gc.get(Calendar.DAY_OF_MONTH)); // Dia do mês: 14
    System.out.println("Dia da semana: " + gc.get(Calendar.DAY_OF_WEEK)); // Dia da semana: 2
    System.out.println("Dia da ano: " + gc.get(Calendar.DAY_OF_YEAR)); // Dia da ano: 74
    System.out.println("Semana do ano: " + gc.get(Calendar.WEEK_OF_YEAR)); // Semana do ano: 12
    System.out.println("Semana do mês: " + gc.get(Calendar.WEEK_OF_MONTH)); // Semana do mês: 3
    System.out.println("Hora: " + gc.get(Calendar.HOUR)); // Hora: 1
    System.out.println("AM/PM? " + gc.get(Calendar.AM_PM)); // AM/PM? 1
    System.out.println("Hora do dia: " + gc.get(Calendar.HOUR_OF_DAY)); // Hora do dia: 13
    System.out.println("Minuto: " + gc.get(Calendar.MINUTE)); // Minuto: 19
    System.out.println("Segundo: " + gc.get(Calendar.SECOND)); // Segundo: 36

    DateTimeFormatter dTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    // Date localDateTime = Date.parse("10/10/2021 10:21", dtf);
    // System.out.println(localDateTime);
    // java.sql.Timestamp sqlTS = new java.sql.Timestamp(localDateTime.get));
    // System.out.println("java.sql.Timestamp time: " + sqlTS);
    // java.util.Date utilDate = new java.util.Date(sqlTS.getTime());
    // System.out.println("java.util.Date time : " + utilDate);

    DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    // System.out.println("Date formatted : " + df.format(utilDate));

    dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    java.util.Date data = df.parse("10/01/2018 10:30");
    gc.setTime(data);
    LocalDateTime dataHora = LocalDateTime.ofInstant(gc.toInstant(), gc.getTimeZone().toZoneId());
    System.out.println("Data e hora " + dataHora.format(dtf));

    data = df.parse("10/01/2019 10:30");

    gc.setTime(data);
    LocalDateTime outraDataHora = LocalDateTime.ofInstant(gc.toInstant(), gc.getTimeZone().toZoneId());
    // Calcula a diferença em dias entre as duas datas
    long diferencaEmDias = ChronoUnit.DAYS.between(dataHora, outraDataHora);
    // Calcula a diferença em meses entre as duas datas
    long diferencaEmMes = ChronoUnit.MONTHS.between(dataHora, outraDataHora);
    // Calcula a diferença em anos entre as duas datas
    long diferencaEmAnos = ChronoUnit.YEARS.between(dataHora, outraDataHora);

    // Exibe a diferença em dias entre as datas
    System.out.println("Diferença em dias entre " + dataHora + " e " + outraDataHora + " = " + diferencaEmDias);
    // Exibe a diferença em meses entre as datas
    System.out.println("Diferença em meses entre " + dataHora + " e " + outraDataHora + " = " + diferencaEmMes);
    // Exibe a diferença em anos entre as datas
    System.out.println("Diferença em anos entre " + dataHora + " e " + outraDataHora + " = " + diferencaEmAnos);
  }
}

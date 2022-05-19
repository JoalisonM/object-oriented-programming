package Calendario;

public class Main {
  public static void main(String[] args) {
    Calendario calendario = new Calendario(12, 05, 2022);

    calendario.mostrarData();
    calendario.anoBissexto();
  }
}

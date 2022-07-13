package Exercicio2.FitaVideo;

public class Main {
  public static void main(String[] args) {
    FitaVideo batman = new FitaVideo("The Batman", 2.0);
    FitaVideo coringa = new FitaVideo("Coringa", 1.3);
    FitaVideo doutorEstranho = new FitaVideo("Doutor estranho e o multiverso da loucura", 5.0);
    FitaVideo homemAranha = new FitaVideo("Homem aranha sem volta pra casa", 4.0);

    batman.getValorAluguel(7);
    coringa.getValorAluguel(9);
    doutorEstranho.getValorAluguel(5);
    homemAranha.getValorAluguel(2);

    System.out.println(batman.toString());
    System.out.println(coringa.toString());
    System.out.println(doutorEstranho.toString());
    System.out.println(homemAranha.toString());

  }
}

package Quadrado;

public class Main {
  public static void main(String[] args) {
    Quadrado bolaDoKiko = new Quadrado(3);

    System.out.println("Área: " + bolaDoKiko.calcularArea());
    System.out.println("Perímetro: " + bolaDoKiko.calcularPerimetro());
  }
}

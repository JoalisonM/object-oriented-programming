package Circulo;

public class Main {
  public static void main(String[] args) {
    Circulo bola = new Circulo(10);

    System.out.println("Área: " + bola.calcularArea());
    System.out.println("Perímetro: " + bola.calcularPerimetro());
  }
}

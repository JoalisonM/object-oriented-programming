package Retangulo;

public class Main {
  public static void main(String[] args) {
    Retangulo paralelepido = new Retangulo(2, 3);

    System.out.println("Área: " + paralelepido.calcularArea());
    System.out.println("Perímetro: " + paralelepido.calcularPerimetro());
  }
}

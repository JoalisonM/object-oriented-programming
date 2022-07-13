package Exercicio2.Circulo;

public class Circulo {
  private double raio;
  private final double PI = 3.141516;

  public Circulo(double raio) {
    this.raio = raio;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public double calcularArea() {
    double area = PI * raio * raio;

    return area;
  }

  public double calcularPerimetro() {
    double perimetro = 2 * PI * raio;

    return perimetro;
  }
}

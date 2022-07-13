package Exercicio2.Retangulo;

public class Retangulo {
  private double largura, comprimento;

  public Retangulo(double largura, double comprimento) {
    this.largura = largura;
    this.comprimento = comprimento;
  }

  public double getLargura() {
    return largura;
  }

  public void setLargura(double largura) {
    this.largura = largura;
  }

  public double getComprimento() {
    return comprimento;
  }

  public void setComprimento(double comprimento) {
    this.comprimento = comprimento;
  }

  public double calcularArea() {
    double area = largura * comprimento;

    return area;
  }

  public double calcularPerimetro() {
    double perimetro = (2 * comprimento) + (2 * largura);

    return perimetro;
  }

  public void imprimir() {
    System.out.println("Largura: " + largura);
    System.out.println("Comprimento: " + comprimento);
    System.out.println("Área do quadrado: " + calcularArea());
    System.out.println("Perímetro do quadrado: " + calcularPerimetro());
  }
}

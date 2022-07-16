package Atividade2.Adega;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
  public static void main(String[] args) throws ParseException {
    DateFormat brFormat = new SimpleDateFormat("dd/MM/yyyy");
    VinhoBranco vinhoBranco = new VinhoBranco("vinho1", "verde", "jooj", 100.00, brFormat.parse("15/07/2002"),
        "normal");
    VinhoTinto vinhoTinto = new VinhoTinto("vinho2", "preta", "jooj", 100.00, brFormat.parse("10/10/2020"),
        brFormat.parse("10/10/2000"));

    Adega adega = new Adega();

    adega.adicionarGarrafa(vinhoTinto);
    adega.adicionarGarrafa(vinhoTinto);
    adega.adicionarGarrafa(vinhoTinto);
    adega.adicionarGarrafa(vinhoTinto);
    adega.adicionarGarrafa(vinhoTinto);
    adega.adicionarGarrafa(vinhoTinto);
    adega.adicionarGarrafa(vinhoTinto);
    adega.adicionarGarrafa(vinhoTinto);
    adega.adicionarGarrafa(vinhoTinto);
    adega.adicionarGarrafa(vinhoTinto);
    adega.adicionarGarrafa(vinhoBranco);

    adega.ObterVinhoPorTipo("verde");
    System.out.println("Quantidade de garrafas: " + adega.totalDeGarrafas());
    System.out.println("Valor total da adega: " + adega.valorTotalAdega());
    System.out.println("Vinho mais antigo: " + adega.vinhoMaisAntigo());
    System.out.println("Obter vinho: " + adega.obterVinho(1, 0));
    adega.imprimirAdega();
  }
}

package Adega;

import java.util.Date;

public abstract class Vinho {
  private double valor;
  private Date dataFabricacao;
  private String nome, tipoUva, fabricante;

  public Vinho(String nome, String tipoUva, String fabricante, double valor, Date dataFabricacao) {
    this.nome = nome;
    this.valor = valor;
    this.tipoUva = tipoUva;
    this.fabricante = fabricante;
    this.dataFabricacao = dataFabricacao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipoUva() {
    return tipoUva;
  }

  public void setTipoUva(String tipoUva) {
    this.tipoUva = tipoUva;
  }

  public String getFabricante() {
    return fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public Date getDataFabricacao() {
    return dataFabricacao;
  }

  public void setDataFabricacao(Date dataFabricacao) {
    this.dataFabricacao = dataFabricacao;
  }

  public abstract String toString();
}

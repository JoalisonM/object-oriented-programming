package Atividade2.Mercadinho;

import java.util.Date;

public abstract class Produto {
  private double valor;
  private String codigo, descricao, nome;
  private Date dataFabricacao, dataValidade;

  public Produto(String nome, String codigo, String descricao, double valor, Date dataFabricacao, Date dataValidade) {
    this.nome = nome;
    this.valor = valor;
    this.codigo = codigo;
    this.descricao = descricao;
    this.dataValidade = dataValidade;
    this.dataFabricacao = dataFabricacao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Date getDataFabricacao() {
    return dataFabricacao;
  }

  public void setDataFabricacao(Date dataFabricacao) {
    this.dataFabricacao = dataFabricacao;
  }

  public Date getDataValidade() {
    return dataValidade;
  }

  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public abstract String toString();
}

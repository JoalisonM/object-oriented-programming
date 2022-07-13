package Biblioteca;

import java.util.Date;

public class Emprestimo {
  private Date dataDeEmprestimo, dataPrevisaoDeDevolucao, dataDeEntregaReal;
  private int situacao;
  private Usuario usuario;
  private Exemplar exemplar;

  public Emprestimo(Date dataDeEmprestimo, Date dataPrevisaoDeDevolucao, Date dataDeEntregaReal, int situacao,
      Usuario usuario, Exemplar exemplar) {
    this.dataDeEmprestimo = dataDeEmprestimo;
    this.dataPrevisaoDeDevolucao = dataPrevisaoDeDevolucao;
    this.dataDeEntregaReal = dataDeEntregaReal;
    this.situacao = situacao;
    this.usuario = usuario;
    this.exemplar = exemplar;
  }

  public Date getDataDeEmprestimo() {
    return dataDeEmprestimo;
  }

  public void setDataDeEmprestimo() {
    this.dataDeEmprestimo = dataDeEmprestimo;
  }

  public Date getDataPrevisaoDeDevolucao() {
    return dataPrevisaoDeDevolucao;
  }

  public void setDataPrevisaoDeDevolucao(Date dataPrevisaoDeDevolucao) {
    this.dataPrevisaoDeDevolucao = dataPrevisaoDeDevolucao;
  }

  public Date getDataDeEntregaReal() {
    return dataDeEntregaReal;
  }

  public void setDataDeEntregaReal(Date dataDeEntregaReal) {
    this.dataDeEntregaReal = dataDeEntregaReal;
  }

  public int getSituacao() {
    return situacao;
  }

  public void setSituacao(int situacao) {
    this.situacao = situacao;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Exemplar getExemplar() {
    return exemplar;
  }

  public void setExemplar(Exemplar exemplar) {
    this.exemplar = exemplar;
  }
}

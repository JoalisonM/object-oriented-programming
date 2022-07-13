package Atividade2.Mercadinho;

import java.util.Date;

public class Proprietario {
  private String nome, sexo;
  private Date dataNascimento;

  public Proprietario(String nome, String sexo, Date dataNascimento) {
    this.nome = nome;
    this.sexo = sexo;
    this.dataNascimento = dataNascimento;
  }

  public String getNome() {
    return nome;
  }

  public void SETnome(String nome) {
    this.nome = nome;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
}

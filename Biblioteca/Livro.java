package Biblioteca;

import java.util.Date;

public class Livro {
  private String titulo, autor, editora, ISBN;
  private Date ano;
  private int edicao;

  public Livro(String titulo, String autor, String editora, String ISBN, Date ano, int edicao) {
    this.titulo = titulo;
    this.autor = autor;
    this.editora = editora;
    this.ISBN = ISBN;
    this.ano = ano;
    this.edicao = edicao;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public Date getAno() {
    return ano;
  }

  public void setAno(Date ano) {
    this.ano = ano;
  }

  public int getEdicao() {
    return edicao;
  }

  public void setEdicao(int edicao) {
    this.edicao = edicao;
  }
}

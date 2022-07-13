package Professor;

public class Professor {
  private String nome, matricula, nomeDepartamento;

  public Professor(String nome, String matricula, String nomeDepartamento) {
    this.nome = nome;
    this.matricula = matricula;
    this.nomeDepartamento = nomeDepartamento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNomeDepartamento() {
    return nomeDepartamento;
  }

  public void setNomeDepartamento(String nomeDepartamento) {
    this.nomeDepartamento = nomeDepartamento;
  }
}
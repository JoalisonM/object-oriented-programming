public class Usuario {
  private String nome, telefone, matricula;
  private int CPF;

  public Usuario(String nome, String telefone, String matricula, int CPF) {
    this.nome = nome;
    this.telefone = telefone;
    this.matricula = matricula;
    this.CPF = CPF;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public int getCPF() {
    return CPF;
  }

  public void setCPF(int CPF) {
    this.CPF = CPF;
  }
}
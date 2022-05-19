package Funcionario;

public class Funcionario {
  private int idade;
  private double salario;
  private String[] endereco;
  private String nome, cpf, codigo;

  public Funcionario(String nome, String cpf, String codigo, double salario, int idade, String[] endereco) {
    this.cpf = cpf;
    this.nome = nome;
    this.idade = idade;
    this.codigo = codigo;
    this.salario = salario;
    this.endereco = endereco;
  }

  public String getCPF() {
    return cpf;
  }

  public void setCPF(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String[] getEndereco() {
    return endereco;
  }

  public void setEndeeco(String[] endereco) {
    this.endereco = endereco;
  }

  public double calculaSalarioLiquido() {
    double salarioLiquido = salario - ((salario * 11) / 100);

    return salarioLiquido;
  }

  public String toString() {
    return "Nome: " + nome + "\n" + "CPF: " + cpf + "\n" + "Idade: " + idade + "\n" + "Código: " + codigo + "\n"
        + "Salario"
        + salario + "\n" + "Endereço: " + endereco + "\n" + "Salario liquido: " + calculaSalarioLiquido();
  }
}
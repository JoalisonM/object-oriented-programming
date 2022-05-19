public class ContaAgua {
  // Attributes
  private double consumoEmMetros;
  private double valorMetro;
  private Cliente cliente;

  // Constructor
  public ContaAgua(double consumoEmMetros, double valorMetro, Cliente cliente) {
    this.consumoEmMetros = consumoEmMetros;
    this.valorMetro = valorMetro;
    this.cliente = cliente;
  }

  // Methods
  public double getConsumoEmMetros() {
    return consumoEmMetros;
  }

  public void setConsumoEmMetros(double consumoEmMetros) {
    this.consumoEmMetros = consumoEmMetros;
  }

  public double valorMetro() {
    return valorMetro;
  }

  public void setValorMetro(double valorMetro) {
    this.valorMetro = valorMetro;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public double totalConta() {
    double total = consumoEmMetros * valorMetro;

    return total;
  }

  public void printConta() {
    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    System.out.print("Rua: " + getCliente().getEndereco()[0]);
    System.out.println("  Número: " + getCliente().getEndereco()[1]);
    System.out.print("Bairro: " + getCliente().getEndereco()[2]);
    System.out.print("  Cidade: " + getCliente().getEndereco()[4]);
    System.out.println("  CEP: " + getCliente().getEndereco()[3]);
    System.out.println();
    System.out.print("Nome: " + getCliente().getNome());
    System.out.println("  CPF: " + getCliente().getCpf());
    System.out.println("Total a se pagar: " + totalConta());
    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
  }
}
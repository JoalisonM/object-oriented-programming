package WaterBill;

public class Main {
  public static void main(String[] args) {
    Cliente jooj = new Cliente("Jooj", 20, "11111111111",
        new String[] { "Rua edite Pereira da Silva", "420", "Centro", "583400", "Sapé" });

    ContaAgua contaJooj = new ContaAgua(1.50, 10.0, jooj);

    contaJooj.printConta();
  }
}

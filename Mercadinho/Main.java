package Mercadinho;

import java.util.Date;
import java.util.UUID;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
  private static Alimento cadastrarAlimento() throws ParseException {
    UUID uuid = UUID.randomUUID();
    Scanner teclado = new Scanner(System.in);
    DateFormat brFormat = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Adicionar Alimento no estoque\n");
    System.out.print("Nome: ");
    String nome = teclado.nextLine();

    System.out.print("\nDescrição: ");
    String descricao = teclado.nextLine();

    System.out.print("\nValor: ");
    double valor = Double.parseDouble(teclado.nextLine());

    System.out.print("\nData de fabricação: ");
    String dataFabricacao = teclado.nextLine();
    Date dataF = brFormat.parse(dataFabricacao);

    System.out.print("\nData de validade: ");
    String dataValidade = teclado.nextLine();
    Date dataV = brFormat.parse(dataValidade);

    System.out.print("\nClassificação (natural/artificial): ");
    String classificacao = teclado.nextLine();

    Alimento alimento = new Alimento(nome, uuid.toString(), descricao, valor, dataF, dataV, classificacao);

    return alimento;
  }

  private static Bebida cadastrarBebida() throws ParseException {
    UUID uuid = UUID.randomUUID();
    Scanner teclado = new Scanner(System.in);
    DateFormat brFormat = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Adicionar Bebida no estoque\n");
    System.out.print("Nome: ");
    String nome = teclado.nextLine();

    System.out.print("\nDescrição: ");
    String descricao = teclado.nextLine();

    System.out.print("\nValor: ");
    double valor = Double.parseDouble(teclado.nextLine());

    System.out.print("\nData de fabricação: ");
    String dataFabricacao = teclado.nextLine();
    Date dataF = brFormat.parse(dataFabricacao);

    System.out.print("\nData de validade: ");
    String dataValidade = teclado.nextLine();
    Date dataV = brFormat.parse(dataValidade);

    System.out.print("\nGraduação alcoólica: ");
    int graduacaoAlcoolica = teclado.nextInt();

    Bebida bebida = new Bebida(nome, uuid.toString(), descricao, valor, dataF, dataV, graduacaoAlcoolica);

    return bebida;
  }

  private static Limpeza cadastrarLimpeza() throws ParseException {
    UUID uuid = UUID.randomUUID();
    Scanner teclado = new Scanner(System.in);
    DateFormat brFormat = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Adicionar Produto de limpeza no estoque\n");
    System.out.print("Nome: ");
    String nome = teclado.nextLine();

    System.out.print("\nDescrição: ");
    String descricao = teclado.nextLine();

    System.out.print("\nValor: ");
    double valor = Double.parseDouble(teclado.nextLine());

    System.out.print("\nData de fabricação: ");
    String dataFabricacao = teclado.nextLine();
    Date dataF = brFormat.parse(dataFabricacao);

    System.out.print("\nData de validade: ");
    String dataValidade = teclado.nextLine();
    Date dataV = brFormat.parse(dataValidade);

    System.out.print("\nÉ nocivo?: ");
    boolean ehNocivo = teclado.nextBoolean();

    Limpeza limpeza = new Limpeza(nome, uuid.toString(), descricao, valor, dataF, dataV, ehNocivo);

    return limpeza;
  }

  private static Proprietario adicionarProprietario() throws ParseException {
    Scanner teclado = new Scanner(System.in);
    DateFormat brFormat = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("\nAdicionar Proprietário do Mercado");

    System.out.print("Nome: ");
    String nome = teclado.nextLine();

    System.out.print("\nSexo: ");
    String sexo = teclado.nextLine();

    System.out.print("\nData de Nascimento: ");
    String dataNascimento = teclado.nextLine();
    Date dataN = brFormat.parse(dataNascimento);

    Proprietario proprietario = new Proprietario(nome, sexo, dataN);

    return proprietario;
  }

  private static Mercadinho cadastrarMercadinho() throws ParseException {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Cadastrar novo Mercado\n");

    System.out.print("Nome: ");
    String nome = teclado.nextLine();

    Mercadinho mercadinho = new Mercadinho(nome, adicionarProprietario());

    return mercadinho;
  }

  public static void main(String[] args) throws ParseException {
    System.out.println("-†-†-†-†-†-†-† Criar um mercadinho †-†-†-†-†-†-†-");
    Scanner teclado = new Scanner(System.in);
    Mercadinho mercadinho = cadastrarMercadinho();
    DateFormat brFormat = new SimpleDateFormat("dd/MM/yyyy");

    boolean whileCondicao = true;

    while (whileCondicao) {
      System.out.println("\n-†-†-†-†-†-†-†-†-†-†-† Menu do mercadinho †-†-†-†-†-†-†-†-†-†-†-");
      System.out.println("Digite [1] para cadastrar produto");
      System.out.println("Digite [2] para consultar produto");
      System.out.println("Digite [3] para editar produto");
      System.out.println("Digite [4] para remover produto");
      System.out.println("Digite [5] para obter a quantidade de produtos cadastrados");
      System.out.println("Digite [6] para obter valor das mercadorias cadastradas no estoque");
      System.out.println("Digite [7] para obter o produto mais antigo no estoque");
      System.out.println("Digite [8] para obter produtos vencidos que estão no estoque");
      System.out.println("Digite [9] para obter todos os produtos");
      System.out.println("-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†-†");

      System.out.print("Digite uma das opções: ");
      int opcao = Integer.parseInt(teclado.nextLine());
      switch (opcao) {
        case 1:
          System.out.println("\n-x-x-x-x-x-x-x Cadastrar Produto x-x-x-x-x-x-x-");
          System.out.println("Digite 1 para adicionar Alimento");
          System.out.println("Digite 2 para adicionar Bebida");
          System.out.println("Digite 3 para adicionar Produto de Limpeza");

          System.out.print("Digite uma das opções: ");
          int produtoOpcao = Integer.parseInt(teclado.nextLine());
          if (produtoOpcao == 1) {
            Alimento alimento = cadastrarAlimento();
            mercadinho.cadastrarProduto(alimento);
          } else if (produtoOpcao == 2) {
            Bebida bebida = cadastrarBebida();
            mercadinho.cadastrarProduto(bebida);
          } else {
            Limpeza limpeza = cadastrarLimpeza();
            mercadinho.cadastrarProduto(limpeza);
          }
          break;

        case 2:
          System.out.print("\nPesquisar por produto: ");
          String consulta = teclado.nextLine();
          mercadinho.consultarProduto(consulta);
          break;
        case 3:
          System.out.println("Digite o código do produto para editar: ");
          String codigo = teclado.nextLine();
          System.out.println("Digite o novo nome: ");
          String nome = teclado.nextLine();
          System.out.println("Digite a nova descrição: ");
          String descricao = teclado.nextLine();
          System.out.println("Digite o novo valor: ");
          double valor = Double.parseDouble(teclado.nextLine());
          System.out.println("Digite a nova ata de fabricação: ");
          String dataFabricacao = teclado.nextLine();
          Date dataF = brFormat.parse(dataFabricacao);
          System.out.println("Digite a nova ata de validade: ");
          String dataValidade = teclado.nextLine();
          Date dataV = brFormat.parse(dataValidade);
          mercadinho.editarProduto(codigo, nome, descricao, valor, dataF, dataV);
          break;
        case 4:
          System.out.print("\nRemover produto: ");
          String codigoProduto = teclado.nextLine();
          mercadinho.removerProduto(codigoProduto);
          break;
        case 5:
          System.out.println("Quantidade de items: " + mercadinho.quantidadeProdutosCadastrados());
          break;
        case 6:
          System.out.println("Valor total de tudo: " + mercadinho.calcularTotal());
          break;
        case 7:
          System.out.println("Produto mais antigo: " + mercadinho.produtoMaisAntigo());
          break;
        case 8:
          mercadinho.produtosVencidos();
          break;
        case 9:
          mercadinho.todosProdutos();
          break;
        default:
          whileCondicao = false;
      }
    }
  }
}

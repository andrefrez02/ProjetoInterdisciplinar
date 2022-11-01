import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int opcao;
    String nome;
    int codigo;
    double preco;

    Produto produto = new Produto("Bermudão Adidas", 123544, 25.75);

    System.out.printf("****************************************************\n");
    System.out.printf("\tSistema de Controle de Estoque\n");
    System.out.printf("****************************************************\n\n");

    System.out.printf("\t\tMENU\n");
    System.out.printf("1. Adicionar produto\n");
    System.out.printf("2. Excluir produto\n");
    System.out.printf("3. Visualizar lista de produtos\n");
    System.out.printf("9. Sair do programa\n\n");

    do {
      System.out.printf("Digite apenas uma das opções do menu acima[0 - 9]: ");
      opcao = sc.nextInt();
      if (opcao <= 0 || opcao >= 10) {
        System.out.printf("Opção digitada é inválida\n\n");
      }
    } while (opcao <= 0 || opcao >= 10);

    if (opcao == 9) {
      System.exit(0);
    }
    else if(opcao == 1){
      System.out.printf("\nVocê selecionou a opção [%d] - Adicionar produto\n", opcao);
      System.out.printf("Digite o Nome do produto: ");
      nome = sc.next(); // Usando next() ao invés de usar o nextLine() pois o há algum bug do
      // vscode com o nextLine() fazendo com que o programa pule essa linha e impossibilidando
      // a entrada de dados pelo usuário. A diferença entre next() e nextLine() é que o
      // next() só aceita Strings sem o caractere de espaço;
      produto.setNome(nome);
      System.out.printf("Digite o Código do produto: ");
      codigo = sc.nextInt();
      produto.setCodigo(codigo);
      System.out.printf("Digite o Preço do produto: R$");
      preco = sc.nextDouble();
      produto.setPreco(preco);
    }

    System.out.println(produto.getNome());


    sc.close();
  }
}

import java.util.Scanner;
public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    Estoque produto = new Estoque();
    
    int opcao = 0;
    String nome;
    double preco;
    int id;

    produto.IniciarArray();

    System.out.printf("****************************************************\n");
    System.out.printf("\tSistema de Controle de Estoque\n");
    System.out.printf("****************************************************\n\n");

    do 
    {
      System.out.println("\n=------------------------------------------=");
      System.out.printf("\n\t\tMENU\n");
      System.out.printf("1. Adicionar produto\n");
      System.out.printf("2. Excluir produto\n");
      System.out.printf("3. Visualizar lista de produtos\n");
      System.out.printf("4. Alterar informações de um produto\n");
      System.out.printf("5. Localizar produtos por Nome\n");
      System.out.printf("6. Localizar produtos por ID\n");

      System.out.printf("7. Sair do programa\n\n");

      System.out.printf("Digite apenas uma das opções do menu acima[1 - 7]: ");

      opcao = sc.nextInt();
      
      if (opcao <= 0 || opcao >= 8) 
      {
        System.out.printf("Opção digitada é inválida\n\n");
      }

      else
      {
        System.out.printf("\nVocê selecionou a opção [%d] - ", opcao);
        if (opcao == 7) 
        {
          System.out.printf("Sair do programa.\n\nPrograma finalizado.");
          System.exit(0);
        }

        else if(opcao == 1)
        {
          System.out.printf("Adicionar produto.\n\nDigite o Nome do produto: ");
          nome = sc.next(); // Usando next() ao invés de usar o nextLine() pois o há algum bug do
                            // vscode com o nextLine() fazendo com que o programa pule essa linha 
                            // e impossibilidando a entrada de dados pelo usuário. A diferença 
                            // entre next() e nextLine() é que o next() só aceita Strings sem o 
                            // caractere de espaço;
          System.out.printf("Digite o Preço do produto: R$");
          preco = sc.nextDouble();

          produto.CadastrarProduto(nome, preco);
        }
        
        else if(opcao == 2)
        {
          System.out.printf("Excluir produto.\n\nDigite o Id do produto que você deseja excluir: ");
          id = sc.nextInt();
          if (produto.getIdProduto(id) >= 0){
            produto.ExcluirProduto(id);
            System.out.printf("\n\nProduto excluído com sucesso.");
          }
          else{
            System.out.printf("\n\nNão foi encontrado nenhum produto com o Id escolhido.");
          }
        }

        else if(opcao == 3)
        {
          System.out.printf("Visualizar lista de produtos.\n");
          produto.ListarProdutos();
        }

        else if(opcao == 4)
        {
          System.out.printf("Alterar informações de um produto.\n\nDigite o Id do produto que você deseja alterar: ");
          id = sc.nextInt();
          if (produto.getIdProduto(id) >= 0){
            produto.ExcluirProduto(id);
            System.out.printf("\nDigite o novo Nome do produto: ");
            nome = sc.next();
            System.out.printf("\nDigite o novo Preço do produto: R$");
            preco = sc.nextDouble();
            produto.CadastrarProduto(nome, preco);
            System.out.printf("\n\nDados do Produto alterados com sucesso.");
          }
          else{
            System.out.printf("\n\nNão foi encontrado nenhum produto com o Id escolhido.");
          }
        }
        
        else if(opcao == 5)
        {
          System.out.printf("Localizar produtos por Nome.\n\nDigite o Nome do produto que você deseja encontrar: ");
          nome = sc.next();
          produto.LocalizarPorNome(nome);
        }

        else if(opcao == 6)
        {
          System.out.printf("Localizar produtos por ID.\n\nDigite o ID do produto que você deseja encontrar: ");
          id = sc.nextInt();
          produto.LocalizarPorId(id);
        }
      }
    } 
    while (opcao != 7);

    sc.close();
  }
}

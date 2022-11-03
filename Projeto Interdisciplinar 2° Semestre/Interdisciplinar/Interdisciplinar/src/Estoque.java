public class Estoque {
  private int[] idProduto = new int[20];
  private String[] nomeProduto = new String[20];
  private double[] precoProduto = new double[20];

  void CadastrarProduto(String nome, double preco) {
    int id = VerificarArray(idProduto);
    if (id != 404) {
      idProduto[id] = id;
      nomeProduto[id] = nome;
      precoProduto[id] = preco;
    }
  }

  int VerificarArray(int[] ids) {
    int id = -1;
    int count = 0;
    for (int i = 0; i < ids.length; i++) {
      if (ids[i] == -1) {
        id = i;
        break;
      } else {
        count++;
      }
    }
    if (count == 20) {
      System.out.println("\n\n********************************************************");
      System.out.println("Você alcançou o número máximo de produtos do estoque.\n" +
          "Para continuar cadastrando você deve excluir alguns registros.");
      System.out.println("********************************************************\n\n");
      return 404;
    }
    return id;
  }

  void ListarProdutos() {
    for (int i = 0; i < idProduto.length; i++) {
      if (nomeProduto[i] != null) {
        System.out.printf("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n");
        System.out.printf("\nId: %d\n", idProduto[i]);
        System.out.printf("Nome: %s\n", nomeProduto[i]);
        System.out.printf("Preço: R$%.2f\n\n", precoProduto[i]);
      }
    }
  }

  void ExcluirProduto(int id) {
    idProduto[id] = -1;
    nomeProduto[id] = null;
    precoProduto[id] = 0;
  }

  void IniciarArray() {
    for (int i = 0; i < idProduto.length; i++) {
      idProduto[i] = -1;
    }
  }

  int getIdProduto(int id) {
    return idProduto[id];
  }

  void LocalizarPorNome(String nome) {
    int count = 0;
    for (int i = 0; i < idProduto.length; i++) {
      if (nomeProduto[i] != null) {
        if (nomeProduto[i].equals(nome)) {
          System.out.printf("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n");
          System.out.printf("\nId: %d\n", idProduto[i]);
          System.out.printf("Nome: %s\n", nomeProduto[i]);
          System.out.printf("Preço: R$%.2f\n\n", precoProduto[i]);
        }
        else{
          count++;
        }
      }
      else{
        count++;
      }
    }
    if (count == 20) {
      System.out.printf("\n\nNão foi encontrado nenhum produto com o Nome escolhido.");
    }
  }

  void LocalizarPorId(int id) {
    if (id == idProduto[id]) {
      System.out.printf("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n");
      System.out.printf("\nId: %d\n", idProduto[id]);
      System.out.printf("Nome: %s\n", nomeProduto[id]);
      System.out.printf("Preço: R$%.2f\n\n", precoProduto[id]);
    }
    else{
      System.out.printf("\n\nNão foi encontrado nenhum produto com o Id escolhido.");
    }
  }
}

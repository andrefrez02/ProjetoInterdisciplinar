public class Produto {
  private String nome;
  private int codigo;
  private double preco;

  public Produto(String vNome, int vCodigo, double vPreco){
    this.nome = vNome;
    this.codigo = vCodigo;
    this.preco = vPreco;
  }

  public String getNome(){
    return nome;
  }

  public int getCodigo(){
    return codigo;
  }

  public double getPreco(){
    return preco;
  }

  public void setNome(String n){
    nome = n;
  }

  public void setCodigo(int c){
    codigo = c;
  }

  public void setPreco(double p){
    preco = p;
  }
  
}
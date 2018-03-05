
public class Fornecedor
{
   public String nome;
   private String cnpj;
   public String uri;
   private Produto[] produtos = new Produto[0];
   
   public Fornecedor(String nome){ this.setNome(nome);}
   
   public String getNome(){ return this.nome;}
   
   private void setNome(String nome){ this.nome = nome;}
    
   public String getUri(){ return this.uri;}
   
   private void setUri(String uri){ this.uri = uri;}
   
   private void setCnpj(String cnpj){ this.cnpj = cnpj;}
   
   public void addProduto(Produto produto){
      Produto[] novo = new Produto[this.produtos.length + 1];
      for(int icont = 0; icont < this.produtos.length; icont++)     
            novo[icont] = this.produtos[icont];
      
      novo[novo.length - 1] = produto;
      this.produtos = novo;
    
   }
    
}

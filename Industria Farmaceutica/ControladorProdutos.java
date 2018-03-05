
public class ControladorProdutos
{
    private Produto[] produtos = new Produto[0];
    
    public void addProduto(Produto produto){
      Produto[] novo = new Produto[this.produtos.length + 1];
      for(int icont = 0; icont < this.produtos.length; icont++)     
            novo[icont] = this.produtos[icont];
      
      novo[novo.length - 1] = produto;
      this.produtos = novo;
    
   }

    public void registrarProducao(String nomeProduto, float quantidadeProduzida){
        Produto produto = buscarProduto(nomeProduto);
        if(produto == null)
            return;
        produto.ajustar(quantidadeProduzida);   
    }
    
    public Produto buscarProduto(String nomeProduto){
        for(Produto produto : this.produtos)
            if(produto.equals(nomeProduto))
                return produto;
                
        return null;        
    
    }
    
}

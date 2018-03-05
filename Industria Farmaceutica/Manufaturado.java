
public class Manufaturado extends Produto
{
    private Componente[] componentes;
    
    public Manufaturado(String nome, String formula, int toxidade, double valorMin, double valorReg, double valorAtual){ 
        super(nome,formula,toxidade, valorMin, valorReg, valorAtual);}
    
    public void addComponete(Componente componente){
      Componente[] novo = new Componente[this.componentes.length + 1];
      for(int icont = 0; icont < this.componentes.length; icont++)     
            novo[icont] = this.componentes[icont];
      
      novo[novo.length - 1] = componente;
      this.componentes = novo;
    
   }
   
   public void ajustar(double quantidadeProduzida){
       this.estoque.incrementar(quantidadeProduzida);
       for(Componente componente : this.componentes)
            componente.contabilizarInsumo(quantidadeProduzida);
   }
    
}


public class Estoque
{
   private Produto produto;
   public double valorMin;
   public double valorReg;
   public double valorAtual;
   
   public Estoque(Produto produto, double valorMin, double valorReg, double valorAtual){ 
       this.setProduto(produto);
       this.setValorMin(valorMin);
       this.setValorReg(valorReg);
       this.setValorAtual(valorAtual);
    }
   
   private void setProduto(Produto produto){ this.produto = produto;}
    
   public Produto getProduto(){ return this.produto;}
    
   private void setValorMin(double valorMin){ this.valorMin = valorMin;}
    
   public double getValorMin(){ return this.valorMin;}
    
   private void setValorReg(double valorReg){ this.valorReg = valorReg;}
    
   public double getValorReg(){ return this.valorReg;}
    
   private void setValorAtual(double valorAtual){ this.valorAtual = valorAtual;}
    
   public double getValorAtual(){ return this.valorAtual;}
    
    public boolean estaNoNilvelCritico(){
        if(this.getValorAtual() < this.getValorMin())
            return true;
        return false;
    }
    
    public void incrementar(double quantidade){ this.setValorAtual(this.getValorAtual() + quantidade);}
    
    public void decrementar(double quantidade){ this.setValorAtual(this.getValorAtual() - quantidade);}
    
    
    
}

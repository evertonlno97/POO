
public class Componente
{
    public double quantidade;
    private Insumo insumo;
    
    public Componente(Insumo insumo, double quantidade){
        this.setInsumo(insumo);
        this.setQuantidade(quantidade);
    }
    
    private void setQuantidade(double quantidade){ this.quantidade = quantidade;}
    
    public double getQuantidade(){ return this.quantidade;}
    
    private void setInsumo(Insumo insumo){ this.insumo = insumo;}
    
    public Insumo getInsumo(){ return this.insumo;}
    
    public void contabilizarInsumo(double quantidadeProduzida ){
        this.insumo.ajustar(quantidadeProduzida * this.quantidade);
    
    }
}

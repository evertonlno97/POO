
public class Insumo extends Produto
{
    private Fornecedor fornecedor;
    
    public Insumo(String nome, String formula, int toxidade, double valorMin, double valorReg, double valorAtual){ 
        super(nome,formula,toxidade, valorMin, valorReg, valorAtual);}
        
    public void ajustar(double quantidade){
        this.estoque.decrementar(quantidade);
    }    
}

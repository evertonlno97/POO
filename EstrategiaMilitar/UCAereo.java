public class UCAereo extends UnidadeCombate{
    
    private int qtdeCacas;
    
    public UCAereo(String id, int qtdeMilitaresAlocados,
                   int qtdeCacas, Localidade l) {
        super(id, qtdeMilitaresAlocados, l);
        this.setQtdeCacas(qtdeCacas);
    }    
    
    public int getQtdeCacas() {
        return this.qtdeCacas;
    }
    
    public void setQtdeCacas(int qtdeCacas) {
        this.qtdeCacas = qtdeCacas;
    }
    
    public int getPotenciaCombateAbsoluta(){
        return this.getQtdeMilitaresAlocados() + 
               10 * this.getQtdeCacas();

    }    
    
    
}
public class UCNaval extends UnidadeCombate{
    
    private int qtdeNavios;
    private int qtdeCacas;
    
    public UCNaval(String id, int qtdeMilitaresAlocados,
                   int qtdeNavios, int qtdeCacas,
                       Localidade l) {
        super(id, qtdeMilitaresAlocados, l);
        this.setQtdeNavios(qtdeNavios);
        this.setQtdeCacas(qtdeCacas);
    } 
    
    public int getQtdeNavios() {
        return this.qtdeNavios;
    }
    
    public void setQtdeNavios(int qtdeNavios) {
        this.qtdeNavios = qtdeNavios;
    }
    
    public int getQtdeCacas() {
        return this.qtdeCacas;
    }
    
    public void setQtdeCacas(int qtdeCacas) {
        this.qtdeCacas = qtdeCacas;
    }
    
    public int getPotenciaCombateAbsoluta(){
        return this.getQtdeMilitaresAlocados() + 
               2 * this.getQtdeNavios() +
               10 * this.getQtdeCacas();
    }    
}

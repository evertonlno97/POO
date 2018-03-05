public class UCTerrestre extends UnidadeCombate{
    
    private int qtdeTanque;
    private int qtdeBlindado;
    
    public UCTerrestre(String id, int qtdeMilitaresAlocados,
                       int qtdeTanque, int qtdeBlindado,
                       Localidade l) {
        super(id, qtdeMilitaresAlocados, l);
        this.setQtdeTanque(qtdeTanque);
        this.setQtdeBlindado(qtdeBlindado);
    } 
    
    public int getQtdeTanque() {
        return this.qtdeTanque;
    }
    
    public void setQtdeTanque(int qtdeTanque) {
        this.qtdeTanque = qtdeTanque;
    }
    
    public int getQtdeBlindado() {
        return this.qtdeBlindado;
    }
    
    public void setQtdeBlindado(int qtdeBlindado) {
        this.qtdeBlindado = qtdeBlindado;
    }
    
    public int getPotenciaCombateAbsoluta(){
        return this.getQtdeMilitaresAlocados() + 
               3 * this.getQtdeBlindado() +
               5 * this.getQtdeTanque();
    }    
}

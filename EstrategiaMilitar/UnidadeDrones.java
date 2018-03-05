public class UnidadeDrones implements ElementoCombateIF{
    
    private Localidade l;
    
    public UnidadeDrones(Localidade l){
        this.l = l;        
    }    
    
    public double getPotenciaCombateRelativa(Localidade localidade){
        return 50 * l.getValorInfluencia(localidade);
    };
}

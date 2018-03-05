public class SistemaEstrategiaMilitar{
  private Exercito[] aliados;
  private Exercito[] inimigos;
  private Localidade[] localidades;
  
  public SistemaEstrategiaMilitar(){
      this.aliados = new Exercito[0];
      this.inimigos = new Exercito[0];
      this.localidades = new Localidade[0];
  }    
  
  public double calcularForcaConflito(String nomeLocalidade){
      Localidade localidade = this.findByName(nomeLocalidade);
      return this.getPotenciaRelativaAliados(localidade) - 
             this.getPotenciaRelativaInimigos(localidade);
      
  }
  
    public double getPotenciaRelativaAliados(Localidade localidade){
        double potencia = 0;
        for(Exercito exercito : this.aliados)
          potencia += exercito.getPotenciaCombateRelativa(localidade);
        return potencia; 
    }  
    
    public double getPotenciaRelativaInimigos(Localidade localidade){
        double potencia = 0;
        for(Exercito exercito : this.inimigos)
          potencia += exercito.getPotenciaCombateRelativa(localidade);
        return potencia; 
    }    
    
    public Localidade findByName(String nomeLocalidade){
        for(Localidade localidade : this.localidades)
          if(localidade.getNome().equals(nomeLocalidade))
            return localidade;
        return null;    

    }    
    
    public void addExercitoAliado(Exercito exercito){
       Exercito[] novo = new Exercito[this.aliados.length + 1];    
       for(int i = 0; i < this.aliados.length ; i++)
         novo[i] = this.aliados[i];
       novo[novo.length - 1] = exercito; 
       this.aliados=novo;
    } 
    
    public void addExercitoInimigo(Exercito exercito){
       Exercito[] novo = new Exercito[this.inimigos.length + 1];    
       for(int i = 0; i < this.inimigos.length ; i++)
         novo[i] = this.inimigos[i];
       novo[novo.length - 1] = exercito; 
       this.inimigos=novo;
    }   
    
   public void addLocalidade(Localidade localidade){
       Localidade[] novo = new Localidade[this.localidades.length + 1];    
       for(int i = 0; i < this.localidades.length ; i++)
         novo[i] = this.localidades[i];
       novo[novo.length - 1] = localidade; 
       this.localidades=novo;
    }      
    
  
}
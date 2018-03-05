public class Exercito{
    private ElementoCombateIF[] uc;
    
    public Exercito(){
        this.uc = new ElementoCombateIF[0];
    }    
    
    public void addElementoCombate(ElementoCombateIF unidade){
       ElementoCombateIF[] novo = new ElementoCombateIF[this.uc.length + 1];    
       for(int i = 0; i < this.uc.length ; i++)
         novo[i] = this.uc[i];
       novo[novo.length - 1] = unidade; 
       this.uc=novo;
    }  
    
    public double getPotenciaCombateRelativa(Localidade localidade){
        double potencia = 0;
        for(ElementoCombateIF unidade : uc)
          potencia += unidade.getPotenciaCombateRelativa(localidade);
        return potencia; 
    }     
}

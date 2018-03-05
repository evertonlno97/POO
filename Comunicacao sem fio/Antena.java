
import java.lang.Math;

public abstract  class Antena extends Host
{  
    protected Celular[] celulares = new Celular[0];
   
    public Antena(String id){ 
        super(id); 
    }
    
    public abstract boolean cobre(double x, double y);
    public abstract double getPotencia(double x, double y);
    
    public void desassociar(Celular celular){
        if(this.estaAssociado(celular))
            return;
        Celular[] novo = new Celular[this.celulares.length - 1];
        for(int i=0, j=0; i < this.celulares.length; i++)
            if(this.celulares[i].equals(celular))
            novo[j++] = this.celulares[i];
        this.celulares = novo;
        celular.desassociar();
    
    }
    
    public void associar(Celular celular){
        
        if(this.estaAssociado(celular))
            return;
    
        Celular[] novo = new Celular[this.celulares.length + 1];
        
        for(int i = 0; i < this.celulares.length; i++)
            novo[i] = this.celulares[i];
            
        novo[novo.length - 1] = celular;
        this.celulares = novo;
        celular.associar(this);
    
    }
    
    public boolean estaAssociado(Celular celular){
    
        for(Celular atual : this.celulares){
            if(atual.equals(celular)){
                return true;
            }
        } 
        return false;
    }
    
    
    
    
}

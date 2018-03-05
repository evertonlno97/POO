
public class Celular extends Host
{
    private Antena antena;
    
    public Celular(String id){ super(id);}
    
    public Antena getAntena(){ return this.antena;}
    
    public void setAntena(Antena atual){ this.antena = atual;}
    
    public void associar(Antena antena){
    
        this.setAntena(antena);
    
    }
    
    public void desassociar(){
    
        this.setAntena(null);
    
    }
    
    public void mover(double x, double y){
    
        this.setPosX(x);
        this.setPosY(y);
    
    
    }
    
    
}

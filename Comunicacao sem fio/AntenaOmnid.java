

public class AntenaOmnid extends Antena
{
    public AntenaOmnid(String id){ super(id);}
   
    
    public boolean cobre(double x, double y){
        return this.getDistancia(x, y) <= Math.sqrt(this.getPotencia());
    }    
    
    
    public double getPotencia(double x, double y){
        return 1.0 / Math.pow(this.getDistancia(x,y), 2);
    };    
    
    
}


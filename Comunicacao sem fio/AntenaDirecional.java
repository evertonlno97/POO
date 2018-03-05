
public class AntenaDirecional extends Antena
{
    private int quadrante;
    
    public AntenaDirecional(String id){ super(id);}
    
    public boolean cobre(double x, double y){
        return this.estaNoQuadrante(x, y) &&
               this.getDistancia(x, y) <= 2* Math.sqrt(this.getPotencia());
    }    
    
    
    public boolean estaNoQuadrante(double x, double y){
        return ((this.quadrante == 1 &&
                 x >= this.getPosX() &&
                 y >= this.getPosY())
              || (this.quadrante == 2 &&
                 x <= this.getPosX() &&
                 y >= this.getPosY()) 
              || (this.quadrante == 3 &&
                 x <= this.getPosX() &&
                 y <= this.getPosY()) 
              || (this.quadrante == 4 &&
                 x >= this.getPosX() &&
                 y <= this.getPosY())); 
    } 
    
    public double getPotencia(double x, double y){
        return 2.0 / Math.pow(this.getDistancia(x,y), 2);
    };
    
}

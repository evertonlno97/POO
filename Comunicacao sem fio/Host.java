
public class Host
{
    
    private String id;
    private double potencia;
    private double posX;
    private double posY;
    
    
    public Host(String id){ 
        this.setId(id); 
    }
    
    public double getDistancia(double x, double y){
        return Math.sqrt(Math.pow(this.posX - x, 2) + Math.pow(this.posY - y, 2));   
    }  
    
    public String getId(){ return this.id;}
    
    private void setId(String id){ this.id = id;}
    
    public double getPosX(){ return this.posX;}
    
    public void setPosX(double x){ this.posX = x;}
    
    public double getPosY(){ return this.posY;}
    
    public void setPosY(double y){ this.posY = y;}
    
    public double getPotencia(){ return this.potencia;}
    
    
    public boolean equals(Object host){
        if(!(host instanceof Host))
            return false;
        return this.getId().equals(((Host)host).getId()); 
        //((Host) host) -> Downcast - Força a conversão de host (do tipo Object) para uma instancia
        //tipo Host
    }
    
}



public class Replicado extends Servidor
{
    Servidor[] servidores;
    
    public Replicado(String id){ super(id);}
    
    public double getCapacidadeDisponivel(){
    
        double capacidade = servidores[0].getCapacidadeDisponivel();
        for(Servidor servidor : this.servidores)
            if(capacidade > servidor.getCapacidadeDisponivel())
                capacidade = servidor.getCapacidadeDisponivel();
                
        return capacidade;
        
    }
    
    public double getLatenciaEscrita(){ 
        
        double latenciaEscrita = servidores[0].getLatenciaEscrita();
        for(Servidor servidor : this.servidores)
            if(latenciaEscrita > servidor.getLatenciaEscrita())
                latenciaEscrita = servidor.getLatenciaEscrita();
                
        return latenciaEscrita;
    
    } 
    
    public void ocupar(double tamanho){
    
        for(Servidor servidor : this.servidores)
            servidor.ocupar(tamanho);
    
    
    }
   
}

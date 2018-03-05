

public class Basico extends Servidor
{
    double capacidadeTotal;
    double capacidadeOcupada;
    
    public Basico(String id){ super(id);}
    
    public double getCapacidadeTotal(){ return this.capacidadeTotal;}
    
    private void setCapacidadeTotal(double valor){this.capacidadeTotal = valor;}
    
    public double getCapacidadeOcupada(){ return this.capacidadeOcupada;}
    
    private void setCapacidadeOcupada(double valor){this.capacidadeOcupada = valor;}
    
    public double getCapacidadeDisponivel(){ return this.capacidadeTotal - this.capacidadeOcupada;}
    
    public double getLatenciaEscrita(){ return this.latenciaEscrita;} 
    
    public void ocupar(double tamanho){
    
        this.setCapacidadeOcupada(this.getCapacidadeOcupada() + tamanho);
    
    
    }
    
}

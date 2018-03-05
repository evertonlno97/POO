

public abstract class Servidor
{
    private String id;
    double latenciaLeitura;
    double latenciaEscrita;
    
    public Servidor(String id){ this.setId(id); }
    
    public String getId(){ return this.id;}
    
    private void setId(String id){this.id = id; }
    
    public abstract double getCapacidadeDisponivel();
    
    public abstract double getLatenciaEscrita();
    
    public double gravar(Fragmento fragmento){ 
        fragmento.setServidor(this);
        this.ocupar(fragmento.getTamanho());
        return fragmento.getTamanho() * this.getLatenciaEscrita();
    
    }
    
    public abstract void ocupar(double tamanho);
}

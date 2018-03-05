

public class Fragmento
{
    private String id;
    double tamanho;
    private Servidor servidor;
    
    public Fragmento(String id, double tamanho){
    
        this.setId(id);
        this.setTamanho(tamanho);
    
    }
    
    public String getId(){ return this.id;}
    
    private void setId(String id){this.id = id; }
    
    public double getTamanho(){ return this.tamanho;}
    
    private void setTamanho(double tamanho){this.tamanho = tamanho; }
    
    public Servidor getServidor(){ return this.servidor;}
    
    protected void setServidor(Servidor servidor){
        if(this.servidor == null) 
            this.servidor = servidor; }
}

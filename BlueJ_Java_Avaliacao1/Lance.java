import java.util.Date;

public class Lance
{
    int valor;
    String identificador;
    Date instante;
    
    public Lance(int lance, String nome){
    
        this.setValor(lance);
        this.setIdentificador(nome);
        this.instante = new Date();
        
    }
    
    public int getValor(){
    
        return this.valor;
    
    }
    
    public void setValor(int lance){
    
        this.valor = lance;
    
    }
    
     public String getIdentificador(){
    
        return this.identificador;
    
    }
    
    public void setIdentificador(String nome){
    
        this.identificador = nome;
    
    }
    
    public boolean maiorLance(Lance outro){
    
        if(this.getValor() > outro.getValor()){
            return true;
        }else{
            return false;
        }
    
    }
    
    public boolean buscarLance(Lance outro){
    
        return this.equals(outro);
    
    }
    
    public boolean buscarLance(String nome){
    
        if(this.identificador == nome){
        
            return true;
        
        }else{
        
            return false;
        
        }
    
    
    }
    
    public boolean equals(Lance outro){
     
        return (this.getIdentificador() == outro.getIdentificador());
        
    }
    
    
}

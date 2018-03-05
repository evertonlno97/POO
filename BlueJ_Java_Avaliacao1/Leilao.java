
public class Leilao
{
    
    String descricao;
    int menorLance;
    Lance []lances;
    
    public Leilao(String texto, int valor, int tamanho){
    
        this.setDescricao(texto);
        this.setMenorLance(valor);
        lances = new Lance[tamanho];
        
    
    }
    
    public String getDescricao(){
    
        return this.descricao;
    
    }
    
    public void setDescricao(String texto){
    
        this.descricao = texto;
    
    }
    
     public int getMenorLance(){
    
        return this.menorLance;
    
    }
    
    public void setMenorLance(int valor){
    
        this.menorLance = valor;
    
    }
    
    public Lance getLance(int pos){
    
        return this.lances[pos];
    
    }
    
    public void setLance(int pos, Lance lance){
    
        this.lances[pos] = lance;
    
    }
    
    public Lance maiorLanceL(){
        
        Lance maior = new Lance(0, "");
    
        for(int i = 0; i < this.getTamanho(); i++){
        
            if(this.getLance(i).maiorLance(maior)){
            
                maior = this.getLance(i);
            
            }
        
        }
        
        return maior;
    
    }
    
    public Lance maiorLanceL(String nome){
        
        Lance maior = new Lance(0, "");
    
        for(int i = 0; i < this.getTamanho(); i++){
        
            if(this.getLance(i).maiorLance(maior) && this.getLance(i).buscarLance(nome)){
            
                maior = this.getLance(i);
            
            }
        
        }
        
        return maior;
    
    }
    
    public int percMajoracao(){
        
            int percentual = 0;
    
        for(int i = 0; i < this.getTamanho(); i++){
        
           percentual += this.lances[i].getValor() - this.getMenorLance();  
        
        }
        
        return percentual /= this.getMenorLance();
    
    }
    
    public int getTamanho(){return this.lances.length;}
    
}

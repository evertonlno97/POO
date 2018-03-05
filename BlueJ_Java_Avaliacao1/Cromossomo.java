
public class Cromossomo
{
    Gene []cromo;
    
    public Cromossomo(int tamanho){
    
        cromo = new Gene[tamanho]; // Cria uma coleção de instancias da classe Gene (objeto)
    
    }
    
    public Gene getGene(int alelo){
        
        return this.cromo[alelo];
    
    }
    
    public void setGene(int alelo, Gene gene){
    
       this.cromo[alelo] = gene; 
    
    }
    
    public Cromossomo clonar(){
    
        Cromossomo clone = new Cromossomo(this.getTamanho());
        for(int icont = 0; icont < this.cromo.length; icont++){
        
            clone.setGene(icont, this.getGene(icont).clonar1());
        
        }
        
        return clone;
    
    }
    
    public int getTamanho(){
    
        return this.cromo.length;
    
    }
    
    public int similarCromo(Cromossomo outro){
        
        int similaridade = 0;
        int i;
    
        for(i = 0; i < this.cromo.length && i < outro.cromo.length; i++){
            if(this.getGene(i) == null || outro.getGene(i) == null){
                if(!(this.getGene(i) == null && outro.getGene(i) == null))
                
                    similaridade -= 2;    
            }else{
            
                if(this.getGene(i).equals(outro.getGene(i))){
                
                    similaridade += 1;
                
                }else{
                
                    similaridade -= 1;
                    
                }
            
            }
            
            Cromossomo maior = this.getTamanho() > outro.getTamanho() ? this : outro;
                
            for(; i < maior.getTamanho(); i++){
            
                if(maior.getGene(i) != null){
                
                    similaridade -= 2;
                
                }
            
            }    
           
           
        } 
    
        return similaridade;
    }
    
    public void cruzarCromo(int valor, Cromossomo outro){
        
        Cromossomo menor = this.getTamanho() < outro.getTamanho() ? this : outro;
        
        Cromossomo aux = new Cromossomo(menor.getTamanho());
    
        for(int i = 0; i < menor.cromo.length; i++){
        
            if( i >= valor){
            
                aux.setGene(i, this.getGene(i));
                this.setGene(i, outro.getGene(i));
                outro.setGene(i, aux.getGene(i));
            }
        }
    
    
    }
    
     
    
}

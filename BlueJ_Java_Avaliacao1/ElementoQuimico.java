

public class ElementoQuimico
{
   
    int numAtomico;
    double numMassa;
    String nomeElemento;
    int []numEletrons = new int[7];
    
    
    public ElementoQuimico(int atomico, double massa, String elemento){
    
      this.setNumAtomico(atomico);
      this.setNumMassa(massa);
      this.setNomeElemento(elemento); 
      
    }
    
    public int getNumAtomico(){
    
        return this.numAtomico;
    
    }
    
    public void setNumAtomico(int valor){
    
        this.numAtomico = valor;
    
    }
    
     public double getNumMassa(){
    
        return this.numMassa;
    
    }
    
    public void setNumMassa(double valor){
    
        this.numMassa = valor;
    
    }
    
     public String getNomeElemento(){
    
        return this.nomeElemento;
    
    }
    
    public void setNomeElemento(String elemento){
    
        this.nomeElemento = elemento;
    
    }
    
    public int getNumEletrons(int camada){
    
        return numEletrons[camada];
    
    }
    
    public void setNumEletrons(int camada, int valor){
    
        this.numEletrons[camada] = valor;
    
    }
    
    public boolean equals(ElementoQuimico outro){
    
        return (this.getNumAtomico() == outro.getNumAtomico());
    
    }
   
    
}

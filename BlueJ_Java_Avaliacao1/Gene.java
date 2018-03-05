
public class Gene
{
   int EstadoGene;
   
   public Gene(){ 
    
       //this.setEstadoGene(25);
       this(25); // This -> Referencia o metodo construtor principal
    
    }
   
   public Gene(Gene outro){
       
       //this.setEstadoGene(gene.getEstadoGene());
       this(outro.getEstadoGene());
    
    }
   
   public Gene(int valor){ // Metodo Construtor Principal (Central)
    
       this.setEstadoGene(valor);
    
    }
   
   public int getEstadoGene(){
    
       return this.EstadoGene;
    
    }
    
    public void setEstadoGene(int valor){
    
        this.EstadoGene = valor;
    
    }
    
    public boolean equals(Gene gene){
        
        return (this.getEstadoGene() == gene.getEstadoGene());
    
    }
    
    public Gene clonar1(){
    
        Gene gene = new Gene();
        gene.setEstadoGene(this.getEstadoGene());
        return gene;
    
    }
    
    public Gene clonar2(){
    
        return new Gene(this);  // This -> Referencia a instancia que acessou o metodo.
                                // Acessa o Metodo Construtor com Assinatura de Metodo
                               // Gene/(Gene outro).
    
    }
    
    public void printId(){
    
        System.out.println(this);
    
    }
    
    public String toString(){
    
        return "\'" + this.getEstadoGene() + "\'";
        
    }
    
}

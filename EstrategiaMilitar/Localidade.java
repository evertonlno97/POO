public class Localidade{
    private String nome;
    private RegiaoInfluencia[] regioes;

    public Localidade(String nome){
        this.setNome(nome);
        this.regioes = new RegiaoInfluencia[0];
    }    
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  
    
    public void addRegiaoInfluencia(RegiaoInfluencia regiao){
       RegiaoInfluencia[] novo = new RegiaoInfluencia[this.regioes.length + 1];    
       for(int i = 0; i < this.regioes.length ; i++)
         novo[i] = this.regioes[i];
       novo[novo.length - 1] = regiao; 
       this.regioes=novo;
    } 
    
    public double getValorInfluencia(Localidade localidade){
        for(RegiaoInfluencia regiao : regioes){
            if(regiao.referese(localidade))
              return regiao.getValor();
        }    
        return 0;
    }  
    
    public boolean equals(Localidade outra){
        return this.getNome().equals(outra.getNome());
    }    
    
}

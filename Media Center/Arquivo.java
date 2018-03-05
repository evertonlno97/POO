
public class Arquivo
{
    private String id;
    //double tamanho;
    private Fragmento[] fragmentos;
    
    public Arquivo(String id){ this.setId(id); fragmentos = new Fragmento[0]; }
    
    public String getId(){ return this.id;}
    
    private void setId(String id){this.id = id; }
    
    public void addFragmento(Fragmento fragmento){
    
        Fragmento[] novo = new Fragmento[fragmentos.length + 1];
        for(int icont = 0; icont < this.fragmentos.length; icont++)
            novo[icont] = this.fragmentos[icont];
        
        novo[novo.length - 1] = fragmento;
        this.fragmentos = novo;
    
    }
    
    public Fragmento[] ordenarFragmentos(){
        
    Fragmento atual; 
        
    for (int icont = 1, jcont ; icont < this.fragmentos.length; icont++){
        atual = this.fragmentos[icont];
        jcont = icont - 1;
        while ((jcont >= 0) && (atual.tamanho < this.fragmentos[jcont].tamanho)){
            this.fragmentos[jcont + 1] = this.fragmentos[jcont];
            jcont = jcont - 1;
        }
        this.fragmentos[jcont + 1] = atual;
    }
    
    return fragmentos;
    
    }
    
    public Fragmento maiorFragmento(){
    
        for(Fragmento fragmento : this.fragmentos)
            if(fragmento.getServidor() == null)
                return fragmento;
        return null;        
    }
    
}

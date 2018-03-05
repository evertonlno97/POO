
public class MediaCenter
{
    Servidor[] servidores;
    Arquivo[] arquivos;
    
    public void addArquivo(Arquivo arquivo){
    
        Arquivo[] novo = new Arquivo[arquivos.length + 1];
        for(int icont = 0; icont < this.arquivos.length; icont++)
            novo[icont] = this.arquivos[icont];
        
        novo[novo.length - 1] = arquivo;
        this.arquivos = novo;
    
    }
    
    public void addServidor(Servidor servidor){
    
        Servidor[] novo = new Servidor[servidores.length + 1];
        for(int icont = 0; icont < this.servidores.length; icont++)
            novo[icont] = this.servidores[icont];
        
        novo[novo.length - 1] = servidor;
        this.servidores = novo;
    
    }
    
    public double armazenarArquivo(Arquivo arquivo){
        
        double tempo = 0;
        Fragmento[] fragmentos = arquivo.ordenarFragmentos();
        for(Fragmento fragmento : fragmentos){
            //Fragmento fragmento = arquivo.maiorFragmento();
            Servidor servidor = this.selecionarServidor(fragmento);
            fragmento.setServidor(servidor);
            this.addArquivo(arquivo);
            tempo += servidor.gravar(fragmento);
        
    }
    
        return tempo;
    
    }
    
    public Servidor selecionarServidor(Fragmento fragmento){
        
        Servidor novoServidor = null;
        
        for(Servidor servidor : this.servidores){
            if((servidor.getCapacidadeDisponivel() >= fragmento.tamanho && novoServidor == null) || 
                servidor.getCapacidadeDisponivel() >= fragmento.tamanho && servidor.getLatenciaEscrita() < novoServidor.getLatenciaEscrita())
                novoServidor = servidor;
        }
        
        return novoServidor;
    
    }
}

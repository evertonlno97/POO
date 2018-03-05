

public class Area
{
    Celular[] celulares;
    Antena[] antenas;
    
    public void moverCelular(String id, double x, double y){
        Antena novaAntena = null;
        Celular celular = this.buscarCelular(id);
        for(Antena antena : this.antenas)
            if(antena.cobre(x,y) && novaAntena == null || 
            antena.cobre(x,y) && antena.getPotencia(x,y) > novaAntena.getPotencia(x,y))
                novaAntena = antena;
                
        if(!celular.getAntena().equals(novaAntena)){
            celular.getAntena().desassociar(celular);
            novaAntena.associar(celular);
        }
        
        celular.mover(x,y);
    }
    
    public Celular buscarCelular(String id){
        for(Celular celular : this.celulares)
            if(celular.getId().equals(id))
                return celular;           
        return null;
    }
    
}

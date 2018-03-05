public class RegiaoInfluencia{
    private Localidade localidade;
    private double valor;
    
    
    public RegiaoInfluencia(Localidade localidade, 
                            double valor){
        this.setLocalidade(localidade);
        this.setValor(valor);
    }    
    
    public Localidade getLocalidade() {
		return localidade;
	}
	
	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}    
    
    public boolean referese(Localidade localidade){
        return this.localidade.equals(localidade);
    }    
}

public abstract class UnidadeCombate implements ElementoCombateIF{
    private String id;
    private int qtdeMilitaresAlocados;
    private Localidade localidade;
    
	public UnidadeCombate(String id, int qtdeMilitaresAlocados, Localidade l) {
		this.setId(id);
		this.setQtdeMilitaresAlocados(qtdeMilitaresAlocados);
		this.setLocalidade(l);
	}
    
    public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getQtdeMilitaresAlocados() {
		return this.qtdeMilitaresAlocados;
	}
	
	public void setQtdeMilitaresAlocados(int qtdeMilitaresAlocados) {
		this.qtdeMilitaresAlocados = qtdeMilitaresAlocados;
	}    
	
    public Localidade getLocalidade() {
		return this.localidade;
	}
	
	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}	
    
	public abstract int getPotenciaCombateAbsoluta();
	

	
	public double getPotenciaCombateRelativa(Localidade localidade){
	    return this.getLocalidade().getValorInfluencia(localidade) *
	           this.getPotenciaCombateAbsoluta();
	}    
	
}

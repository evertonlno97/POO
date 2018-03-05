
public abstract class Produto
{
    public Estoque estoque;
    public String nome;
    public String formulaQuimica;
    public int grauToxidade;
    
    public Produto(String nome, String formula, int toxidade, double valorMin, double valorReg, double valorAtual){ 
        this.setNome(nome);
        this.setFormulaQuimica(formula);
        this.setGrauToxidade(toxidade);
        Estoque estoque = new Estoque(this, valorMin, valorReg, valorAtual);
    }
    
    public abstract void ajustar(double quantidadeProduzida);
    
    private void setNome(String nome){ this.nome = nome;}
    
    public String getNome(){ return this.nome;}
    
    private void setFormulaQuimica(String formula){ this.formulaQuimica = formula;}
    
    public String getFormulaQuimica(){ return this.formulaQuimica;}
    
    private void setGrauToxidade(int toxidade){
        if(toxidade >= 0 && toxidade <= 10)
            this.grauToxidade = toxidade;
    }
    
    public int getGrauToxidade(){ return this.grauToxidade;}
    
    public boolean equals(Object object){
        Produto produto = (Produto)object; //converte a object para a classe tipo conta 
        return produto.nome.equals(this.nome);
    }
}

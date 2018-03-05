public class AppSEM{
    
    public void run(){
        
        SistemaEstrategiaMilitar sem = new SistemaEstrategiaMilitar();
        
        Localidade brasil = new Localidade("Brasil");
        Localidade argentina = new Localidade("Argentina"); 
        Localidade chile = new Localidade("Chile");
        Localidade paraguai = new Localidade("Paraguai");
        Localidade uruguai = new Localidade("Uruguai");
        
        Exercito a = new Exercito();
        Exercito b = new Exercito();
        Exercito c = new Exercito();
        Exercito d = new Exercito();        
        
        uruguai.addRegiaoInfluencia(new RegiaoInfluencia(brasil, 0.8));
        uruguai.addRegiaoInfluencia(new RegiaoInfluencia(uruguai, 1));        
        uruguai.addRegiaoInfluencia(new RegiaoInfluencia(argentina, 0.75));
        uruguai.addRegiaoInfluencia(new RegiaoInfluencia(paraguai, 0.6));        
        uruguai.addRegiaoInfluencia(new RegiaoInfluencia(chile, 0.5));        
        
        
        argentina.addRegiaoInfluencia(new RegiaoInfluencia(brasil, 0.9));
        argentina.addRegiaoInfluencia(new RegiaoInfluencia(uruguai, 0.9));        
        argentina.addRegiaoInfluencia(new RegiaoInfluencia(argentina, 1));
        argentina.addRegiaoInfluencia(new RegiaoInfluencia(paraguai, 0.5));        
        argentina.addRegiaoInfluencia(new RegiaoInfluencia(chile, 0.3));        
        

        chile.addRegiaoInfluencia(new RegiaoInfluencia(brasil, 0.2));
        chile.addRegiaoInfluencia(new RegiaoInfluencia(uruguai, 0.1));        
        chile.addRegiaoInfluencia(new RegiaoInfluencia(argentina, 0.7));
        chile.addRegiaoInfluencia(new RegiaoInfluencia(paraguai, 1));        
        chile.addRegiaoInfluencia(new RegiaoInfluencia(chile, 1));        
        
        paraguai.addRegiaoInfluencia(new RegiaoInfluencia(brasil, 0.4));
        paraguai.addRegiaoInfluencia(new RegiaoInfluencia(uruguai, 0.2));        
        paraguai.addRegiaoInfluencia(new RegiaoInfluencia(argentina, 0.5));
        paraguai.addRegiaoInfluencia(new RegiaoInfluencia(paraguai, 1));        
        paraguai.addRegiaoInfluencia(new RegiaoInfluencia(chile, 0.6)); 
        
        brasil.addRegiaoInfluencia(new RegiaoInfluencia(brasil, 1));
        brasil.addRegiaoInfluencia(new RegiaoInfluencia(uruguai, 0.7));        
        brasil.addRegiaoInfluencia(new RegiaoInfluencia(argentina, 0.8));
        brasil.addRegiaoInfluencia(new RegiaoInfluencia(paraguai, 0.7));        
        brasil.addRegiaoInfluencia(new RegiaoInfluencia(chile, 0.2));        
        
        a.addElementoCombate(new UCAereo("aUCA1", 100, 3, brasil));
        a.addElementoCombate(new UCTerrestre("aUCT1", 100, 5, 2, brasil));        
        a.addElementoCombate(new UCNaval("aUCN1", 50, 3, 6, brasil));
        a.addElementoCombate(new UnidadeDrones(brasil));

        b.addElementoCombate(new UCTerrestre("bUCT1", 100, 6, 3, chile));
        b.addElementoCombate(new UCTerrestre("bUCT2", 100, 7, 8, chile));        

        c.addElementoCombate(new UCAereo("cUCA1", 50, 2, argentina));
        c.addElementoCombate(new UCAereo("cUCA2", 50, 2, argentina));        
        
        d.addElementoCombate(new UCAereo("dUCA1", 100, 2, uruguai));
        d.addElementoCombate(new UCTerrestre("dUCT1", 150, 2, 10, uruguai));      
        d.addElementoCombate(new UCNaval("dUCN1", 100, 2, 8, uruguai));                

        
        sem.addLocalidade(brasil);
        sem.addLocalidade(argentina);
        sem.addLocalidade(chile);
        sem.addLocalidade(uruguai);
        sem.addLocalidade(paraguai);
        
        sem.addExercitoAliado(a);
        sem.addExercitoAliado(b);        
        sem.addExercitoInimigo(c);
        sem.addExercitoInimigo(d);
        
        System.out.println("Valor (Paraguai) : " + sem.calcularForcaConflito("Paraguai"));
        System.out.println("Valor (Argentina ): " + sem.calcularForcaConflito("Argentina"));        
        System.out.println("Valor (Uruguai ): " + sem.calcularForcaConflito("Uruguai"));                
        
        
    }
    
    public static void main(String[] args){
        (new AppSEM()).run();
    }    
    
    
    
}

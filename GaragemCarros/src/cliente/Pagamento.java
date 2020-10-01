package cliente;

public abstract class Pagamento {
 
    public void info(){
    
    tempo();
    valor();
    pagamento();
    
    }
    
    protected abstract void pagamento();
    
    public void tempo(){
       System.out.println("Calculo do período de aluguel da garagem");
    }
    public void valor(){
    
    System.out.println("Calculo do valor de aluguel da garagem");
        
    }
}

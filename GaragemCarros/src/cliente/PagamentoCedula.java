package cliente;

public class PagamentoCedula extends Pagamento {
    
   @Override
   protected void pagamento(){
   
    System.out.println("O pagamento em cedula foi realizado");   
       
   }
    
}
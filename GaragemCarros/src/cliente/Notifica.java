package cliente;
public class Notifica implements Observador{
   
   @Override
   public void notifica(){
   
     System.out.println("Notificação de entrada e saida de veiculos");
   
   }

}

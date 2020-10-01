package cliente;

public class Cliente implements GaragemCarrosEstado {
    
   @Override
   public void lotado(){
    System.out.println("Está lotado");
   }
    
   @Override
   public void fechado(){
    System.out.println("Está fechado");
   }
    
   @Override
   public void vazio(){
     
    System.out.println("Está vazio");
   
   }
   @Override
   public void dias(){
     
    System.out.println("Cliente possui dias especificos");
   
   }  
}

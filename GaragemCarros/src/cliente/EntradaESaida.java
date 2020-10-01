package cliente;
import java.util.*;
public class EntradaESaida{
    
   private int veiculo;
 
   private List<Observador> observador = new ArrayList();
   
    private void notifica(){
   
      for(Observador observador: observador){
      
          observador.notifica();
      }
    }
      
    public void setVagas(int veiculo){
    
      this.veiculo = veiculo;
      
      notifica();
    }
    
    public void AdicionarObservador(Observador observadores){
    
        this.observador.add(observadores);
    }

}
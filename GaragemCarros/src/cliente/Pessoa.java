package cliente;

public class Pessoa {
    private GaragemCarrosEstado estado;
    
    public Pessoa(){
      this.estado = new Cliente();
    }
    
    public void Estado(GaragemCarrosEstado estado){
        this.estado = estado;
    }
    
    public void estadoFechado(){
        estado.fechado();
    }
  
    public void estadoLotado(){
        estado.lotado();
    }
    
    public void estadoVazio(){
        estado.vazio();
    }
    public void estadoDias(){
        estado.dias();
    }
}

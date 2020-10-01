package cliente;

public class Pessoa {
    private GaragemCarrosEstado estado;
    
    public Pessoa(){
      this.estado = new Cliente();
    }
    
    public void Estado(GaragemCarrosEstado estado){
        this.estado = estado;
    }
    
    public void EstadoFechado(){
        estado.fechado();
    }
  
    public void EstadoLotado(){
        estado.lotado();
    }
    
    public void EstadoVazio(){
        estado.vazio();
    }
    public void EstadoDias(){
        estado.dias();
    }
}

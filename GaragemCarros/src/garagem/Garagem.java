package garagem;

import cliente.*;

public class Garagem {

    public static void main(String[] args) {
    
    Pessoa p = new Pessoa();
    Pagamento pg = new PagamentoCedula();
    p.EstadoVazio();
    pg.info();
    EntradaESaida es = new EntradaESaida();
    es.AdicionarObservador(new Notifica());
    es.setVagas(1);
    
    }
}

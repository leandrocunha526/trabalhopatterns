package garagem;

import cliente.*;

public class Garagem {

    public static void main(String[] args) {
    
    Pessoa p = new Pessoa();
    Pagamento pg = new PagamentoCedula();
    p.estadoVazio();
    pg.info();
    EntradaESaida es = new EntradaESaida();
    es.adicionarObservador(new Notifica());
    es.setVaga(1);
    
    }
}

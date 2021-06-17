package notificacao;

import modelo.Cliente;

public interface Notificador {
    void notificador(Cliente cliente, String menssagem);
}

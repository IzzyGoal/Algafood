package notificacao;

import modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String menssagem);
}

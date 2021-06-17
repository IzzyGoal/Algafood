package service;

import modelo.Cliente;
import notificacao.NotificadorEmail;

public class AtivaçãoCliente {
    private NotificadorEmail notificador;

    public AtivaçãoCliente(NotificadorEmail notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificador(cliente, "Seu cadastro no sistema esta ativo");


    }
}
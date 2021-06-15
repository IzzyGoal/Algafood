package service;

import modelo.Cliente;
import notificacao.NotificadorEmail;

public class AtivaçãoCliente {
    private NotificadorEmail notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema esta ativo");


    }
}

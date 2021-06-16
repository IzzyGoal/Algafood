package service;

import modelo.Cliente;
import notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivaçãoCliente {
    private NotificadorEmail notificador;

    public AtivaçãoCliente(NotificadorEmail notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema esta ativo");


    }
}
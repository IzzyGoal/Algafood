package service;

import modelo.Cliente;
import notificacao.Notificador;
import notificacao.NotificadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivaçãoCliente {
    private NotificadorEmail notificador;

    //@Autowired
    // public AtivaçãoCliente(NotificadorEmail notificador) {
    //
    //     this.notificador = notificador;
    // }
    // public AtivaçãoCliente(String qualquer){
    //
    //   }

    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificador(cliente, "Seu cadastro no sistema esta ativo");
    }
    @Autowired
    public void setNotificador(NotificadorEmail notificador) {
        this.notificador = notificador;
    }
}
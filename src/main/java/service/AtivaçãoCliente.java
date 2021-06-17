package service;

import modelo.Cliente;
import notificacao.Notificador;
import notificacao.NotificadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivaçãoCliente {
    private NotificadorEmail notificador;
    public void ativar(Cliente cliente) {
        cliente.ativar();
        if (notificador != null){
            notificador.notificador(cliente,"Seu cadaswtro no sistema esta ativo");
        }
        else {
            System.out.println("Não existe notificador , mas cliente foi ativo ");
        }
    }
}

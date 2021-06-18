package service;

import modelo.Cliente;
import notificacao.NivelDeUrgencia;
import notificacao.NivelUrgencia;
import notificacao.NotificadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivaçãoCliente {

    @NivelDeUrgencia(NivelUrgencia.URGENTE)
    @Autowired
    private ApplicationEventPublisher eventPublisher;
    private NotificadorEmail notificador;
    public void ativar(Cliente cliente) {
        cliente.ativar();
            notificador.notificador(cliente,"Seu cadaswtro no sistema esta ativo");
        eventPublisher.publishEvent(new ClienteAtivadoEvento(cliente));
    }

}

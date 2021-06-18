package service;

import modelo.Cliente;
import notificacao.NivelDeUrgencia;
import notificacao.NivelUrgencia;
import notificacao.NotificadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivaçãoCliente {

    @NivelDeUrgencia(NivelUrgencia.URGENTE)
    @Autowired
    private NotificadorEmail notificador;

    @PostConstruct
    public void init(){
        System.out.println("INIT");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("DESTROY");
    }
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

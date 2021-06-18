package notificacao;

import modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@NivelDeUrgencia(value = NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador {

    @Override
    public void notificador(Cliente cliente, String menssagem) {
        System.out.printf("MOCK: Notificação seria enviado a %s atraves do email %s: %s\n",
                cliente.getNome(),
                cliente.getEmail(),
                menssagem);

    }
}

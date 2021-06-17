package notificacao;

import modelo.Cliente;
import org.springframework.stereotype.Component;

    @Component
    public class NotificadorSMS implements Notificador {

        @Override
        public void notificador(Cliente cliente, String menssagem) {
            System.out.printf("Notificando %s atraves do email %s: %s\n",
                    cliente.getNome(),
                    cliente.getEmail(),
                    menssagem);

        }
    }

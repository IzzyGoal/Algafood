package notificacao;

import modelo.Cliente;


public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp){
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("NotificaçãoEmail");
    }
    @Override
    public void notificador(Cliente cliente, String menssagem){

        if (this.caixaAlta){
            menssagem =  menssagem.toUpperCase();
        }
        System.out.printf("Notificando %s atraves do email %s: %s\n",
                cliente.getNome(),
                cliente.getEmail(),
                menssagem);

    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}

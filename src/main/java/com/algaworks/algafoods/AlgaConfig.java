package com.algaworks.algafoods;

import notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.AtivaçãoCliente;

//@Configuration
public class AlgaConfig {

    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);
        return notificador;
    }
    @Bean
    public AtivaçãoCliente ativaçãoCliente(){
        return new AtivaçãoCliente( notificadorEmail());
    }

}

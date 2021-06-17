package com.algaworks.algafoods;


import notificacao.Notificador;
import notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.AtivaçãoCliente;

@Configuration
public class ServiceConfig {
    @Bean
    public AtivaçãoCliente ativaçãoCliente(Notificador notificador) {
        return new AtivaçãoCliente((NotificadorEmail) notificador);


    }
}


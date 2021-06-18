package service;

import modelo.Cliente;
import org.springframework.stereotype.Component;

public class ClienteAtivadoEvento {
private Cliente cliente;

public ClienteAtivadoEvento(Cliente cliente){
    super();
    this.cliente = cliente;
}

    public Cliente getCliente() {
        return cliente;
    }
}

package io.github.danielncosta.service;


import io.github.danielncosta.model.Cliente;
import io.github.danielncosta.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public ClientesService(ClientesRepository repository){
        //método para injeção de dependências via método construtor
        this.repository = repository;
    }



    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente){
        //aplicar validações
    }
}

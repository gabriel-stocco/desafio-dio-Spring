package one.dio.gof.service.impl;

import one.dio.gof.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl {
    @Override
    public Iterable<Cliente> buscarTodos(){
        return null;
    }
    @Override
    public Cliente buscarPorId(Long id){
        return null;
    }
    @Override
    void inserir(Cliente cliente){
        return;
    }
    @Override
    void atualizar(Long id, Cliente cliente){};
    @Override
    void deletar(Long id){};
}

package com.dandy.msclientes.application;

import com.dandy.msclientes.domain.Cliente;
import com.dandy.msclientes.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente){
        return repository.save(cliente);
    }

    public Optional<Cliente> getByCpf(String cpf){
        return repository.findByCpf(cpf);
    }

}

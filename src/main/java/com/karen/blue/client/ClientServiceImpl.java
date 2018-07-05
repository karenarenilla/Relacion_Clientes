package com.karen.blue.client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> findAll(){
        return this.clientRepository.findAll();
    }

    @Override
    public Client save(Client client) {
        this.clientRepository.save(client);
        return client;
    }
}

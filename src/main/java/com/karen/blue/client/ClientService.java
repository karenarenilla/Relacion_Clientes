package com.karen.blue.client;

import java.util.List;

public interface ClientService {
    List<Client> findAll();
    Client save(Client client);
}

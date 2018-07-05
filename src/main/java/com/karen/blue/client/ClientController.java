package com.karen.blue.client;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private ClientServiceImpl clientService;

    public ClientController (ClientServiceImpl clientService){
        this.clientService = clientService;
    }

    @PostMapping
    public Client crete(@RequestBody Client client) {
        return this.clientService.save(client);
    }

    @GetMapping
    public List<Client> read(){
        return this.clientService.findAll();
    }
}

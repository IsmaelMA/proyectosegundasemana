package com.maldonadoismael.proyectosegundasemana.data.services.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maldonadoismael.proyectosegundasemana.data.model.Client;
import com.maldonadoismael.proyectosegundasemana.data.repositories.ClientRepository;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> listAllClients() {
        return clientRepository.findAll();
    }

    // @Override
    // public Client addNewClient(Client client) {
    // return clientRepository.save(client);
    // }

}

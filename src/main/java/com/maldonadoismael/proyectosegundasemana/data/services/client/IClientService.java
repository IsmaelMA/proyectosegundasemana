package com.maldonadoismael.proyectosegundasemana.data.services.client;

import java.util.List;

import com.maldonadoismael.proyectosegundasemana.data.model.Client;

public interface IClientService {

    public List<Client> listAllClients();

    public Client saveNewClient(Client client);

    public Client getClientByID(Long id);

    public Client updateClient(Client client);

    public void deleteClient(Long id);

}

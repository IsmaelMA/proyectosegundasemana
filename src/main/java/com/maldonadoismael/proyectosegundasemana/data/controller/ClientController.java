package com.maldonadoismael.proyectosegundasemana.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maldonadoismael.proyectosegundasemana.data.model.Client;
import com.maldonadoismael.proyectosegundasemana.data.services.client.ClientService;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping({ "/clients", "/" })
    public String listClients(Model model) {
        model.addAttribute("clients", clientService.listAllClients());
        return "clients";
    }

    @GetMapping("/clients/new")
    public String addNewClientForm(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "new_client";
    }
}

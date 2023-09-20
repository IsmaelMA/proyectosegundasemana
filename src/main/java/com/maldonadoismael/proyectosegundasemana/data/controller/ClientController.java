package com.maldonadoismael.proyectosegundasemana.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String showAddNewClientForm(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "new_client";
    }

    @PostMapping("/clients")
    public String saveNewClient(@ModelAttribute("client") Client client) {
        clientService.saveNewClient(client);
        return "redirect:clients";
    }

}

/**
 * This class is a controller for managing client-related operations in a web application.
 * Proyecto para la segunda semana de la formación Master en Java,
 */

package com.maldonadoismael.proyectosegundasemana.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.maldonadoismael.proyectosegundasemana.data.model.Client;
import com.maldonadoismael.proyectosegundasemana.data.services.client.ClientService;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    /**
     * Handles the GET request for listing all clients and displays them in a view.
     *
     * @param model The model to be used for rendering the view.
     * @return The clients view template.
     */

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
        return "redirect:/clients";
    }

    @GetMapping("/clients/edit/{id}")
    public String showEditClientForm(@PathVariable Long id, Model model) {
        model.addAttribute("client", clientService.getClientByID(id));
        return "edit_client";
    }

    @PostMapping("/clients/{id}")
    public String updateClient(@PathVariable Long id, @ModelAttribute("client") Client client, Model model) {
        Client existingClient = clientService.getClientByID(id);
        existingClient.setId(id);
        existingClient.setName(client.getName());
        existingClient.setSurname(client.getSurname());
        clientService.updateClient(existingClient);
        return "redirect:/clients";
    }

    @GetMapping("/clients/{id}")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return "redirect:/clients";
    }

}

package com.maldonadoismael.proyectosegundasemana;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.maldonadoismael.proyectosegundasemana.data.controller.ClientController;
import com.maldonadoismael.proyectosegundasemana.data.model.Client;
import com.maldonadoismael.proyectosegundasemana.data.services.client.ClientService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class ClientControllerTest {

    @InjectMocks
    private ClientController clientController;

    @Mock
    private ClientService clientService;

    @Mock
    private Model model;

    @Mock
    private RedirectAttributes redirectAttributes;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testListClients() {
        // Arrange

        // Act
        String viewName = clientController.listClients(model);

        // Assert
        verify(clientService, times(1)).listAllClients();
        verify(model, times(1)).addAttribute(eq("clients"), any());
        // You can add more assertions here based on your specific implementation and
        // requirements
    }

    @Test
    void testShowAddNewClientForm() {
        // Arrange

        // Act
        String viewName = clientController.showAddNewClientForm(model);

        // Assert
        verify(model, times(1)).addAttribute(eq("client"), any());
        // You can add more assertions here based on your specific implementation and
        // requirements
    }

    @Test
    void testSaveNewClient() {
        // Arrange
        Client client = new Client();

        // Act
        String viewName = clientController.saveNewClient(client);

        // Assert
        verify(clientService, times(1)).saveNewClient(client);
        // You can add more assertions here based on your specific implementation and
        // requirements
    }

    @Test
    void testShowEditClientForm() {
        // Arrange
        Long clientId = 1L;

        // Act
        String viewName = clientController.showEditClientForm(clientId, model);

        // Assert
        verify(clientService, times(1)).getClientByID(clientId);
        verify(model, times(1)).addAttribute(eq("client"), any());
        // You can add more assertions here based on your specific implementation and
        // requirements
    }

    @Test
    void testUpdateClient() {
        // Arrange
        Long clientId = 1L;
        Client client = new Client();
        // Set up the mock to return a valid Client object when getClientByID is called
        // with clientId
        when(clientService.getClientByID(clientId)).thenReturn(client);

        // Act
        String viewName = clientController.updateClient(clientId, client, model);

        // Assert
        verify(clientService, times(1)).getClientByID(clientId);
        verify(clientService, times(1)).updateClient(any());
        // You can add more assertions here based on your specific implementation and
        // requirements
    }

    @Test
    void testDeleteClient() {
        // Arrange
        Long clientId = 1L;

        // Act
        String viewName = clientController.deleteClient(clientId);

        // Assert
        verify(clientService, times(1)).deleteClient(clientId);
        // You can add more assertions here based on your specific implementation and
        // requirements
    }
}

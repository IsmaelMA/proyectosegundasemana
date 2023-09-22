package com.maldonadoismael.proyectosegundasemana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maldonadoismael.proyectosegundasemana.data.model.Client;
import com.maldonadoismael.proyectosegundasemana.data.services.client.ClientService;

@SpringBootApplication
public class ProyectoSegundaSemanaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSegundaSemanaApplication.class, args);
	}

	@Autowired
	private ClientService clientService;

	@Override
	public void run(String... args) throws Exception {
		Client carlos = new Client("Carlos", "Arranz");
		Client isabel = new Client("Isabel", "Sinensia");

		clientService.saveNewClient(carlos);
		clientService.saveNewClient(isabel);
	}

}

package com.maldonadoismael.proyectosegundasemana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maldonadoismael.proyectosegundasemana.data.model.Client;
import com.maldonadoismael.proyectosegundasemana.data.repositories.ClientRepository;

@SpringBootApplication
public class ProyectoSegundaSemanaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSegundaSemanaApplication.class, args);
	}

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {

		// Client antonio = new Client("Antonio", "Martín");
		// Client rodrigo = new Client("Darío", "Otomano");

		// clientRepository.save(antonio);
		// clientRepository.save(rodrigo);

	}

}

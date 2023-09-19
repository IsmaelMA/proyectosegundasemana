package com.maldonadoismael.proyectosegundasemana.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maldonadoismael.proyectosegundasemana.data.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}

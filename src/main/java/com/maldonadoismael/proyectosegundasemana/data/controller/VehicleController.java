package com.maldonadoismael.proyectosegundasemana.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.maldonadoismael.proyectosegundasemana.data.repositories.VehicleRepository;

@Controller
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

}

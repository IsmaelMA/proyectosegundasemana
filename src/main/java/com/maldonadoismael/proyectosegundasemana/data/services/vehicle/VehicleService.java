package com.maldonadoismael.proyectosegundasemana.data.services.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maldonadoismael.proyectosegundasemana.data.model.Vehicle;
import com.maldonadoismael.proyectosegundasemana.data.repositories.VehicleRepository;

@Service
public class VehicleService implements IVehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> listAllVehicles() {
        return vehicleRepository.findAll();
    }

}

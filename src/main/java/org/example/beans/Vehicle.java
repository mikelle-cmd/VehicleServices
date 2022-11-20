package org.example.beans;

import org.example.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public String getName() {
        return "Honda";
    }


}

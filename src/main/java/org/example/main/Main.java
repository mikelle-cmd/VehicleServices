package org.example.main;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.configuration.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        vehicle.getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();
    }
}
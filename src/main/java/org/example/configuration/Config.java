package org.example.configuration;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.implementation",
        "org.example.services"})
@ComponentScan(basePackageClasses = {Person.class, Vehicle.class})
public class Config {
}



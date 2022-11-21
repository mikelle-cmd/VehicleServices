package org.example.configuration;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.implementation",
        "org.example.services", "org.example.aspects"})
@ComponentScan(basePackageClasses = {Person.class, Vehicle.class})
@EnableAspectJAutoProxy
public class Config {
}



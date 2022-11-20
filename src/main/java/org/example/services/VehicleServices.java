package org.example.services;

import org.example.interfaces.Speakers;
import org.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic() {
        System.out.println(speakers.makeSound());
    }

    public void moveVehicle() {
        System.out.println(tyres.rotate());
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}

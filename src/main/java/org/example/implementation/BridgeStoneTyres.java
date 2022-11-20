package org.example.implementation;

import org.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "Rotating with Bridgestone tyres";
    }
}

package org.vaadin.example;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class GreetService implements Serializable {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hallo unbekannter Nutzer.";
        } else {
            return "Hallo " + name + ".";
        }
    }

}

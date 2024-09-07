package org.vaadin.example;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Diese Klasse ist der Einstiegspunkt der Spring-Boot-Anwendung.
 *
 * Die Annoation @PWA macht die Anwendung auf Smartphones, Tablets und einigen Browsern installierbar.
 */
@SpringBootApplication
@PWA(name = "Einstiegspunkt für Vaadin mit Spring", shortName = "Einstiegspunkt")
@Theme("my-theme")
public class Application implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

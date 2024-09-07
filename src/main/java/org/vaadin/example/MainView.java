package org.vaadin.example;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.router.PageTitle;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
@PageTitle("Vaadin Demo")
public class MainView extends VerticalLayout {

    public MainView(@Autowired GreetService service) {
        TextField textField = new TextField("Dein Name");
        textField.addClassName("bordered");

        Button button = new Button("Sage hallo!", new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> buttonClickEvent) {
                add(new Paragraph(service.greet(textField.getValue())));
            }
        });

        // Statt die Schaltfläche zu betätigen, kann auch die Enter-Taste gedrückt werden.
        button.addClickShortcut(Key.ENTER);

        // Verwende benutzerdefiniertes CSS. Dies ist in der Datei styles.css definiert.
        addClassName("centered-content");

        add(textField, button);
    }

}

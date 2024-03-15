package com.example.KaiTicket.major;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route("")

public class MainView extends VerticalLayout {
    public MainView (){
        add(new H1 ("hello my first java web1"));
    }

    
}

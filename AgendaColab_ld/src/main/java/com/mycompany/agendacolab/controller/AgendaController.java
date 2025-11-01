/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendacolab.controller;

import com.mycompany.agendacolab.model.Evenement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kawterbekka
 */
public class AgendaController {

  
    public List<Evenement> evenements;

    public AgendaController() {
        evenements = new ArrayList<>();
    }

    public void ajouterEvenement(Evenement evt) {
        evenements.add(evt);
        System.out.println("Événement ajouté : " + evt.getTitle());
    }

    public List<Evenement> getEvenements(){
        return evenements;
    }
    
     public String getEventInfoForDate(Date date) {
    if (date == null) {
        System.out.println("⚠️ getEventInfoForDate called with null date!");
        return null;
    }

    // Convert the incoming java.util.Date to LocalDate
    LocalDate selectedLocalDate = date.toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDate();

    for (Evenement ev : evenements) {
        LocalDate evDate = ev.getDate();

        if (evDate == null) {
            System.out.println("⚠️ Event " + ev.getTitle() + " has null date!");
            continue;
        }

        // Compare LocalDate values directly
        if (evDate.equals(selectedLocalDate)) {
            return ev.getTitle() + " : " + ev.getDescription();
        }
    }

    return null;
}


    
}

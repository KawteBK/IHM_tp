/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendacolab.controller;

import com.mycompany.agendacolab.model.Evenement;
import java.util.List;
import java.util.ArrayList;

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
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendacolab.model;
import java.time.LocalDate;

/**
 *
 * @author kawterbekka
 */
public class Evenement {
    
     public String title;
     public String resp;
    public String description;
    public LocalDate date;
    public String heur;

    public Evenement(String title, String description, LocalDate date, String resp) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.resp=resp;
    }
     public Evenement(String title, String description, LocalDate date, String resp, String heur) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.resp=resp;
        this.heur=heur;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Evenement{" + "title=" + title + ", resp=" + resp + ", description=" + description + ", date=" + date + ", heur=" + heur + '}';
    }

    public void setHeur(String heur) {
        this.heur = heur;
    }

    public String getHeur() {
        return heur;
    }

    
    
   

    
    
    
    
}

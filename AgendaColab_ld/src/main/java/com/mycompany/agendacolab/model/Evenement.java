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

    public Evenement(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.date = date;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public String title;
    public String description;
    public LocalDate date;

    @Override
    public String toString() {
        return "Evenement{" + "title=" + title + ", description=" + description + ", date=" + date + '}';
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendacolab.controller;

import com.mycompany.agendacolab.view.MainFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author kawterbekka
 */
public class AgendaColab {

    
    public static void main(String[] args) {
        // Swing apps must be started on the Event Dispatch Thread
        
        try {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace();
}
        SwingUtilities.invokeLater(() -> {
            // Create and show your main window
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
        

    }
}

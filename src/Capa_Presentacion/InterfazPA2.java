/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capa_Presentacion;

import capa_presentacion.frmMenu;
import java.awt.EventQueue;

/**
 *
 * @author User
 */
public class InterfazPA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Componentes.EstiloApp.aplicarTema();

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                frmMenu menuPrincipal = new frmMenu();
                menuPrincipal.setLocationRelativeTo(null);
                menuPrincipal.setVisible(true);
            }
        });
    }
    
}

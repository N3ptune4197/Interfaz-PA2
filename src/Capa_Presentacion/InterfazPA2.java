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
        // 1. Aplicar el tema gráfico de FlatLaf primero antes de mostrar cualquier ventana
        Componentes.EstiloApp.aplicarTema();

        // 2. Lanzar la aplicación de manera segura y única mediante EventQueue
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Al instanciar frmMenu, su constructor abrirá automáticamente el Login (jdInicioASesion).
                // Cuando el login termine, se mostrará el frmMenu limpio y sin duplicados.
                frmMenu menuPrincipal = new frmMenu();
                menuPrincipal.setLocationRelativeTo(null);
                menuPrincipal.setVisible(true);
            }
        });
    }
    
}

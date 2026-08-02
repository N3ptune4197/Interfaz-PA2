/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author JIMMYSIN
 */
public class EstiloApp {

    public static void aplicarTema() {
        try {
            // Puedes usar FlatDarkLaf (oscuro) o FlatLightLaf (claro)
            FlatLightLaf.setup();

            // Opcional: Ajustes globales de fuentes o colores si lo deseas
            UIManager.put("Button.arc", 10);
            UIManager.put("Component.arc", 10);
        } catch (Exception ex) {
            System.err.println("No se pudo cargar FlatLaf");
        }
    }
}

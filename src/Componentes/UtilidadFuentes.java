/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.InputStream;
import java.io.IOException;

/**
 *
 * @author JIMMYSIN
 */
public class UtilidadFuentes {

    public static Font cargarFuenteVarsity(float tamaño) {
        Font customFont = null;
        try {
            // Actualizamos con el nombre exacto del archivo con guion bajo
            InputStream is = UtilidadFuentes.class.getResourceAsStream("/Recursos/varsity_regular.ttf");

            if (is == null) {
                System.out.println("¡ADVERTENCIA: No se encontró el archivo varsity_regular.ttf en /Recursos/!");
                customFont = new Font("Arial", Font.PLAIN, (int) tamaño);
            } else {
                customFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(tamaño);
            }
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            customFont = new Font("Arial", Font.PLAIN, (int) tamaño);
        }
        return customFont;
    }
}

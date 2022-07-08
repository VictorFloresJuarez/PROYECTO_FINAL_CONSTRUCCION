/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import controller.ControlObrasTeatrales;
import model.ObrasTeatrales;
import view.ViewObrasTeatrales;

/**
 *
 * @author victo
 */
public class TestControlObrasTeatrales {

    public static void main(String[] args) {
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        ViewObrasTeatrales viewObrasTeatrales = new ViewObrasTeatrales();
        
        ControlObrasTeatrales controladorObrasTeatrales = new ControlObrasTeatrales(obrasTeatrales, viewObrasTeatrales);
        viewObrasTeatrales.setVisible(true);
    }
}

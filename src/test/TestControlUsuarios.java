/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import controller.ControlUsuarios;
import model.Usuarios;
import view.ViewRegistroUsuario;

/**
 *
 * @author victo
 */
public class TestControlUsuarios {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        ViewRegistroUsuario vistaUsuarios = new ViewRegistroUsuario();
        ControlUsuarios controlador = new ControlUsuarios(usuarios, vistaUsuarios);
        
        vistaUsuarios.setVisible(true);
    }
}

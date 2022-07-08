/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import controller.ControlObrasTeatrales;
import model.ObrasTeatrales;
import model.Usuario;
import model.Usuarios;
import view.ViewObrasTeatrales;

/**
 *
 * @author victo
 */
public class TestControlObrasTeatrales {

    public static void main(String[] args) {
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        ViewObrasTeatrales viewObrasTeatrales = new ViewObrasTeatrales();
        //dummy objects
        Usuarios usuarios = new Usuarios();
        System.out.println("--------------------- USUARIO AGREGADO -----------------------");
        usuarios.agregarUsuario("Victor", "Flores Juarez", "curpDeVictor", "Pachas", "contraseniaVictor");
        usuarios.agregarUsuario("Juan", "Ramirez", "curpDeJuan", "PepeEl", "contraseniaJuan");
        usuarios.agregarUsuario("Emmanuel", "FJuarez", "curpEmmanuel", "emmaUser", "contraseniaEmmanuel");
        System.out.println("------------------------- USUARIO MODIFICADO --------------------------");
        usuarios.modificarUsuario("Pachas", "VictorM", "FloresM", "curpDeVictorModif", "PachasModificado", "contraseniaVictorM");
        usuarios.modificarUsuario("emmaUser", "EmmanuelM", "FJuarezM", "curpEmmanuelM", "emmaUserM", "contraseniaEmmanuelM");
        usuarios.imprimirUsuarios();

        Usuario pachas = usuarios.getUsuario("PachasModificado");
        Usuario emmaUser = usuarios.getUsuario("emmaUserM");
        
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, pachas, emmaUser, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, emmaUser, pachas, (float) 30.4);
        
        //fin dummy objects

        ControlObrasTeatrales controladorObrasTeatrales = new ControlObrasTeatrales(obrasTeatrales, viewObrasTeatrales);
        viewObrasTeatrales.setVisible(true);
    }
}

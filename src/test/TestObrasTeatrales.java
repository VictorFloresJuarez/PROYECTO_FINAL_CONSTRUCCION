/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.ObrasTeatrales;
import model.Usuario;
import model.Usuarios;

/**
  *Clase para testear la clase ObrasTeatrales. Para ver si muestra los datos correctos en consola.
 * @author Víctor Flores Juárez
 */
public class TestObrasTeatrales {

    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        System.out.println("--------------------- USUARIO AGREGADO -----------------------");
        usuarios.agregarUsuario("Victor", "Flores Juarez", "curpDeVictor", "Pachas", "contraseniaVictor");
        usuarios.agregarUsuario("Juan", "Ramirez", "curpDeJuan", "PepeEl", "contraseniaJuan");
        usuarios.agregarUsuario("Emmanuel", "FJuarez", "curpEmmanuel", "emmaUser", "contraseniaEmmanuel");
        usuarios.imprimirUsuarios();

        System.out.println("------------------------- USUARIO MODIFICADO --------------------------");
        usuarios.modificarUsuario("Pachas", "VictorM", "FloresM", "curpDeVictorModif", "PachasModificado", "contraseniaVictorM");
        usuarios.modificarUsuario("emmaUser", "EmmanuelM", "FJuarezM", "curpEmmanuelM", "emmaUserM", "contraseniaEmmanuelM");
        usuarios.imprimirUsuarios();

        Usuario pachas = usuarios.getUsuario("PachasModificado");
        Usuario emmaUser = usuarios.getUsuario("emmaUserM");

        usuarios.imprimirUsuarios();

        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        
        System.out.println("---------------------------------- AGREGAR DOS OBRAS ---------------------------------");

        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, pachas, emmaUser, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, emmaUser, pachas, (float) 30.4);
        obrasTeatrales.imprimirObrasTeatrales();

        System.out.println("--------------------------------- MODIFICAR OBRA ------------------------------------------");
        obrasTeatrales.modificarObra("Dark Souls", "Dark Souls Modificado", "RPG", "Resumen de la obra", 46512, pachas, pachas, (float) 7454512);
        obrasTeatrales.imprimirObrasTeatrales();

        System.out.println("---------------------------------- ELIMINAR OBRA --------------------------------------------");
        obrasTeatrales.eliminarObra("Dark Souls Modificado");
        obrasTeatrales.imprimirObrasTeatrales();
    }
}

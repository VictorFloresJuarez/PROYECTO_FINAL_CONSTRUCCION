/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.Usuario;
import model.Usuarios;

/**
 *
 * @author victo
 */
public class TestUsuarios {

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

        System.out.println("----------------------------- USUARIO ELIMINADO ----------------------------------------");
        usuarios.eliminarUsuario("PachasModificado");
        usuarios.imprimirUsuarios();

        System.out.println("------------------------------------    ENCONTRAR USUARIO -----------------------------------");
        Usuario juan = usuarios.getUsuario("PepeEl");
        System.out.println(juan.toString());
    }
}

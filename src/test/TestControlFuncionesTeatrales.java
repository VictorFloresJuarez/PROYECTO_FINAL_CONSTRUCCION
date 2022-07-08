/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import controller.ControlFuncionesTeatrales;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import model.FuncionesTeatrales;
import model.ObraTeatral;
import model.ObrasTeatrales;
import model.Usuario;
import model.Usuarios;
import view.VistaFuncionesTeatrales;

/**
 *
 * @author victo
 */
public class TestControlFuncionesTeatrales {

    public static void main(String[] args) {
        FuncionesTeatrales funcionesTeatrales = new FuncionesTeatrales();
        VistaFuncionesTeatrales vistaFuncionesTeatrales = new VistaFuncionesTeatrales();
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();

        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores Juarez", "curpDeVictor", "Pachas", "contraseniaVictor");
        usuarios.agregarUsuario("Emmanuel", "Flores Juarez", "curpDeJuan", "PepeEl", "contraseniaJuan");
        usuarios.agregarUsuario("Emmanuel", "FJuarez", "curpEmmanuel", "emmaUser", "contraseniaEmmanuel");
        usuarios.modificarUsuario("Pachas", "VictorM", "FloresM", "curpDeVictorModif", "PachasModificado", "contraseniaVictorM");
        usuarios.modificarUsuario("emmaUser", "EmmanuelM", "FJuarezM", "curpEmmanuelM", "emmaUserM", "contraseniaEmmanuelM");
        Usuario pachas = usuarios.getUsuario("PachasModificado");
        Usuario emmaUser = usuarios.getUsuario("emmaUserM");
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, pachas, emmaUser, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, emmaUser, pachas, (float) 30.4);
        LocalDate fechaParaLaPrimera = LocalDate.of(2022, 7, 7);
        LocalDate fechaParaLaSegunda = LocalDate.of(2022, 7, 7);
        LocalTime horaParaLaPrimera = LocalTime.of(18, 45);
        LocalTime horaParaLaSegunda = LocalTime.of(20, 35);
        ObraTeatral obra1 = obrasTeatrales.getObraTeatral("Dark Souls");
        ObraTeatral obra2 = obrasTeatrales.getObraTeatral("Dark Souls 2");

        funcionesTeatrales.agregarFuncion(obra1, fechaParaLaPrimera, horaParaLaPrimera);
        funcionesTeatrales.agregarFuncion(obra2, fechaParaLaSegunda, horaParaLaSegunda);

        ControlFuncionesTeatrales controlFuncionesTeatrales = new ControlFuncionesTeatrales(funcionesTeatrales, vistaFuncionesTeatrales, obrasTeatrales);
        vistaFuncionesTeatrales.setVisible(true);



    }
}

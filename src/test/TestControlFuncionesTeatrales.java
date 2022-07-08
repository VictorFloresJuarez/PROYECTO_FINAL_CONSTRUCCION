package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import controller.ControlFuncionesTeatrales;
import controller.ControlObrasTeatrales;
import model.FuncionesTeatrales;
import model.ObraTeatral;
import model.ObrasTeatrales;
import model.Usuario;
import model.Usuarios;
import view.ViewObrasTeatrales;
import view.VistaFuncionesTeatrales;

public class TestControlFuncionesTeatrales {
    public static void main(String[] args) {
    	ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        FuncionesTeatrales funcionesTeatrales = new FuncionesTeatrales();
        VistaFuncionesTeatrales viewObrasTeatrales = new VistaFuncionesTeatrales();
        //dummy items
        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores", "FOJSDBNW2", "Pachas", "YJ74851293ve74");
        usuarios.agregarUsuario("Juan", "Ramirez", "FOJSDBNW2", "PepeEl", "YJ74851293ve");
        Usuario victor = usuarios.getUsuario("Pachas");
        Usuario pepe = usuarios.getUsuario("PepeEl");
        usuarios.imprimirUsuarios();
        System.out.println("---------------------------------- AGREGAR DOS OBRAS ---------------------------------");

        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, victor, pepe, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, victor, pepe, (float) 30.4);
        obrasTeatrales.imprimirObrasTeatrales();
        ObraTeatral obra1 = obrasTeatrales.getObraTeatral("Dark Souls");
        ObraTeatral obra2 = obrasTeatrales.getObraTeatral("Dark Souls 2 ");
        
        
        System.out.println("----------------------------------- AGREGAR DOS FUNCIONES -----------------------------------------");
        LocalDate fechaParaLaPrimera = LocalDate.of(2002, Month.OCTOBER, 22);
        LocalDate fechaParaLaSegunda = LocalDate.of(2002, Month.OCTOBER, 16);
        
        LocalTime horaParaLaPrimera =  LocalTime.of(18, 45);
        LocalTime horaParaLaSegunda = LocalTime.of(20, 35);
        
        funcionesTeatrales.agregarFuncion(obra1, fechaParaLaPrimera, horaParaLaPrimera);
        funcionesTeatrales.agregarFuncion(obra2, fechaParaLaSegunda, horaParaLaSegunda);
        //fin dummy items

        ControlFuncionesTeatrales controladorObrasTeatrales = new ControlFuncionesTeatrales( funcionesTeatrales, viewObrasTeatrales, obrasTeatrales);
        viewObrasTeatrales.setVisible(true);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import model.FuncionesTeatrales;
import model.ObraTeatral;
import model.ObrasTeatrales;
import model.Usuario;
import model.Usuarios;

/**
 *
 * @author victo
 */
public class TestFuncionesTeatrales {

    public static void main(String[] args) {
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();

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
        FuncionesTeatrales funcionesTeatrales = new FuncionesTeatrales();
        LocalDate fechaParaLaPrimera = LocalDate.of(2002, Month.OCTOBER, 22);
        LocalDate fechaParaLaSegunda = LocalDate.of(2002, Month.OCTOBER, 16);
        
        LocalTime horaParaLaPrimera =  LocalTime.of(18, 45);
        LocalTime horaParaLaSegunda = LocalTime.of(20, 35);
        
        funcionesTeatrales.agregarFuncion(obra1, fechaParaLaPrimera, horaParaLaPrimera);
        funcionesTeatrales.agregarFuncion(obra2, fechaParaLaSegunda, horaParaLaSegunda);
        
        funcionesTeatrales.imprimirFunciones();
        
        
        System.out.println("-----------------------------------------MODIFICAR UNA FUNCION --------------------------------------------");
        LocalDate fechaNueva =  LocalDate.now();
        LocalTime horaNueva = LocalTime.now();
        funcionesTeatrales.modificarFuncion("Dark Souls", fechaParaLaPrimera, horaParaLaPrimera, obra1, fechaNueva, horaNueva);
        funcionesTeatrales.imprimirFunciones();
        
        
        System.out.println("-------------------------------------------ELIMINAR UNA FUNCION ----------------------------------------------");
        funcionesTeatrales.eliminarFuncion("Dark Souls");
        funcionesTeatrales.imprimirFunciones();
    }
}

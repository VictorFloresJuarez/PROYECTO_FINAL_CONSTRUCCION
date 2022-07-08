/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victo
 */
public class FuncionesTeatralesTest {

    public FuncionesTeatralesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getFuncionesTeatrales method, of class FuncionesTeatrales.
     */
    @Test
    public void testGetFuncionesTeatrales() {
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores", "FOJSDBNW2", "Pachas", "YJ74851293ve74");
        usuarios.agregarUsuario("Juan", "Ramirez", "FOJSDBNW2", "PepeEl", "YJ74851293ve");
        Usuario victor = usuarios.getUsuario("Pachas");
        Usuario pepe = usuarios.getUsuario("PepeEl");
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, victor, pepe, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, victor, pepe, (float) 30.4);
        ObraTeatral obra1 = obrasTeatrales.getObraTeatral("Dark Souls");
        ObraTeatral obra2 = obrasTeatrales.getObraTeatral("Dark Souls 2 ");
        FuncionesTeatrales funcionesTeatrales = new FuncionesTeatrales();
        LocalDate fechaParaLaPrimera = LocalDate.of(2002, Month.OCTOBER, 22);
        LocalDate fechaParaLaSegunda = LocalDate.of(2002, Month.OCTOBER, 16);
        LocalTime horaParaLaPrimera = LocalTime.of(18, 45);
        LocalTime horaParaLaSegunda = LocalTime.of(20, 35);
        funcionesTeatrales.agregarFuncion(obra1, fechaParaLaPrimera, horaParaLaPrimera);
        funcionesTeatrales.agregarFuncion(obra2, fechaParaLaSegunda, horaParaLaSegunda);

        Boolean obtuveLasFunciones = !funcionesTeatrales.getFuncionesTeatrales().isEmpty();
        assertTrue(obtuveLasFunciones);
    }

    /**
     * Test of getFuncionEspecifica method, of class FuncionesTeatrales.
     */
    @Test
    public void testGetFuncionEspecifica() {
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores", "FOJSDBNW2", "Pachas", "YJ74851293ve74");
        usuarios.agregarUsuario("Juan", "Ramirez", "FOJSDBNW2", "PepeEl", "YJ74851293ve");
        Usuario victor = usuarios.getUsuario("Pachas");
        Usuario pepe = usuarios.getUsuario("PepeEl");
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, victor, pepe, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, victor, pepe, (float) 30.4);
        ObraTeatral obra1 = obrasTeatrales.getObraTeatral("Dark Souls");
        ObraTeatral obra2 = obrasTeatrales.getObraTeatral("Dark Souls 2 ");
        FuncionesTeatrales funcionesTeatrales = new FuncionesTeatrales();
        LocalDate fechaParaLaPrimera = LocalDate.of(2002, Month.OCTOBER, 22);
        LocalDate fechaParaLaSegunda = LocalDate.of(2002, Month.OCTOBER, 16);
        LocalTime horaParaLaPrimera = LocalTime.of(18, 45);
        LocalTime horaParaLaSegunda = LocalTime.of(20, 35);
        funcionesTeatrales.agregarFuncion(obra1, fechaParaLaPrimera, horaParaLaPrimera);
        funcionesTeatrales.agregarFuncion(obra2, fechaParaLaSegunda, horaParaLaSegunda);

        Boolean obtuveLaFuncion = funcionesTeatrales.getFuncionEspecifica("Dark Souls", fechaParaLaPrimera) != null;
        assertTrue(obtuveLaFuncion);
    }

    /**
     * Test of agregarFuncion method, of class FuncionesTeatrales.
     */
    @Test
    public void testAgregarFuncion() {
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores", "FOJSDBNW2", "Pachas", "YJ74851293ve74");
        usuarios.agregarUsuario("Juan", "Ramirez", "FOJSDBNW2", "PepeEl", "YJ74851293ve");
        Usuario victor = usuarios.getUsuario("Pachas");
        Usuario pepe = usuarios.getUsuario("PepeEl");
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, victor, pepe, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, victor, pepe, (float) 30.4);
        ObraTeatral obra1 = obrasTeatrales.getObraTeatral("Dark Souls");
        ObraTeatral obra2 = obrasTeatrales.getObraTeatral("Dark Souls 2 ");
        FuncionesTeatrales funcionesTeatrales = new FuncionesTeatrales();
        LocalDate fechaParaLaPrimera = LocalDate.of(2002, Month.OCTOBER, 22);
        LocalDate fechaParaLaSegunda = LocalDate.of(2002, Month.OCTOBER, 16);
        LocalTime horaParaLaPrimera = LocalTime.of(18, 45);
        LocalTime horaParaLaSegunda = LocalTime.of(20, 35);
        funcionesTeatrales.agregarFuncion(obra1, fechaParaLaPrimera, horaParaLaPrimera);
        funcionesTeatrales.agregarFuncion(obra2, fechaParaLaSegunda, horaParaLaSegunda);

        Boolean agregueLaFuncion = !funcionesTeatrales.getFuncionesTeatrales().isEmpty();
        assertTrue(agregueLaFuncion);
    }

    /**
     * Test of modificarFuncion method, of class FuncionesTeatrales.
     */
    @Test
    public void testModificarFuncion() {
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores", "FOJSDBNW2", "Pachas", "YJ74851293ve74");
        usuarios.agregarUsuario("Juan", "Ramirez", "FOJSDBNW2", "PepeEl", "YJ74851293ve");
        Usuario victor = usuarios.getUsuario("Pachas");
        Usuario pepe = usuarios.getUsuario("PepeEl");
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, victor, pepe, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, victor, pepe, (float) 30.4);
        ObraTeatral obra1 = obrasTeatrales.getObraTeatral("Dark Souls");
        ObraTeatral obra2 = obrasTeatrales.getObraTeatral("Dark Souls 2 ");
        FuncionesTeatrales funcionesTeatrales = new FuncionesTeatrales();
        LocalDate fechaParaLaPrimera = LocalDate.of(2002, Month.OCTOBER, 22);
        LocalDate fechaParaLaSegunda = LocalDate.of(2002, Month.OCTOBER, 16);
        LocalTime horaParaLaPrimera = LocalTime.of(18, 45);
        LocalTime horaParaLaSegunda = LocalTime.of(20, 35);
        funcionesTeatrales.agregarFuncion(obra1, fechaParaLaPrimera, horaParaLaPrimera);
        funcionesTeatrales.agregarFuncion(obra2, fechaParaLaSegunda, horaParaLaSegunda);
        LocalDate fechaNueva = LocalDate.now();
        LocalTime horaNueva = LocalTime.now();
        funcionesTeatrales.modificarFuncion("Dark Souls", fechaParaLaPrimera, horaParaLaPrimera, obra1, fechaNueva, horaNueva);
        Boolean modifiqueLaFuncion = funcionesTeatrales.getFuncionEspecifica("Dark Souls", fechaNueva) != null;
        assertTrue(modifiqueLaFuncion);
    }

    /**
     * Test of eliminarFuncion method, of class FuncionesTeatrales.
     */
    @Test
    public void testEliminarFuncion() {
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores", "FOJSDBNW2", "Pachas", "YJ74851293ve74");
        usuarios.agregarUsuario("Juan", "Ramirez", "FOJSDBNW2", "PepeEl", "YJ74851293ve");
        Usuario victor = usuarios.getUsuario("Pachas");
        Usuario pepe = usuarios.getUsuario("PepeEl");
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, victor, pepe, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, victor, pepe, (float) 30.4);
        ObraTeatral obra1 = obrasTeatrales.getObraTeatral("Dark Souls");
        ObraTeatral obra2 = obrasTeatrales.getObraTeatral("Dark Souls 2 ");
        FuncionesTeatrales funcionesTeatrales = new FuncionesTeatrales();
        LocalDate fechaParaLaPrimera = LocalDate.of(2002, Month.OCTOBER, 22);
        LocalDate fechaParaLaSegunda = LocalDate.of(2002, Month.OCTOBER, 16);
        LocalTime horaParaLaPrimera = LocalTime.of(18, 45);
        LocalTime horaParaLaSegunda = LocalTime.of(20, 35);
        funcionesTeatrales.agregarFuncion(obra1, fechaParaLaPrimera, horaParaLaPrimera);
        funcionesTeatrales.agregarFuncion(obra2, fechaParaLaSegunda, horaParaLaSegunda);
        funcionesTeatrales.eliminarFuncion("Dark Souls");
        Boolean elimineLaFuncion = funcionesTeatrales.getFuncionEspecifica("Dark Souls", fechaParaLaPrimera) == null;
        assertTrue(elimineLaFuncion);
    }

}

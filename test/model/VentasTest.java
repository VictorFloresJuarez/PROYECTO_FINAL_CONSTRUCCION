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
public class VentasTest {

    public VentasTest() {
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
     * Test of agregarVenta method, of class Ventas.
     */
    @Test
    public void testAgregarVenta() {
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
        FuncionTeatral funcionTeatral = funcionesTeatrales.getFuncionEspecifica("Dark Souls", fechaParaLaPrimera);
        FuncionTeatral segundaFuncionTeatral = funcionesTeatrales.getFuncionEspecifica("Dark Souls 2 ", fechaParaLaSegunda);

        Ventas ventas = new Ventas();
        ventas.agregarVenta(new Venta(0, funcionTeatral, 4, 400));
        ventas.agregarVenta(new Venta(1, segundaFuncionTeatral, 5, 800));

        Boolean agregueVenta = !ventas.getVentas().isEmpty();
        assertTrue(agregueVenta);
    }

    /**
     * Test of obtenerVentasEspecificas method, of class Ventas.
     */
    @Test
    public void testObtenerVentasEspecificas() {
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
        FuncionTeatral funcionTeatral = funcionesTeatrales.getFuncionEspecifica("Dark Souls", fechaParaLaPrimera);
        FuncionTeatral segundaFuncionTeatral = funcionesTeatrales.getFuncionEspecifica("Dark Souls 2 ", fechaParaLaSegunda);

        Ventas ventas = new Ventas();
        ventas.agregarVenta(new Venta(0, funcionTeatral, 4, 400));
        ventas.agregarVenta(new Venta(1, segundaFuncionTeatral, 5, 800));
        LocalDate fechaDesde = LocalDate.of(2001, Month.OCTOBER, 22);
        LocalDate fechaHasta = LocalDate.of(2003, Month.OCTOBER, 16);

        Boolean obtuveVentasEspecificas = ventas.obtenerVentasEspecificas(fechaDesde, fechaHasta).getVentas().isEmpty();
        assertTrue(obtuveVentasEspecificas);
    }

    /**
     * Test of getVentas method, of class Ventas.
     */
    @Test
    public void testGetVentas() {
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
        FuncionTeatral funcionTeatral = funcionesTeatrales.getFuncionEspecifica("Dark Souls", fechaParaLaPrimera);
        FuncionTeatral segundaFuncionTeatral = funcionesTeatrales.getFuncionEspecifica("Dark Souls 2 ", fechaParaLaSegunda);

        Ventas ventas = new Ventas();
        ventas.agregarVenta(new Venta(0, funcionTeatral, 4, 400));
        ventas.agregarVenta(new Venta(1, segundaFuncionTeatral, 5, 800));

        Boolean obtuveVentas = !ventas.getVentas().isEmpty();
        assertTrue(obtuveVentas);
    }

    /**
     * Test of setVentas method, of class Ventas.
     */
    @Test
    public void testSetVentas() {
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
        FuncionTeatral funcionTeatral = funcionesTeatrales.getFuncionEspecifica("Dark Souls", fechaParaLaPrimera);
        FuncionTeatral segundaFuncionTeatral = funcionesTeatrales.getFuncionEspecifica("Dark Souls 2 ", fechaParaLaSegunda);

        Ventas ventas = new Ventas();
        ventas.agregarVenta(new Venta(0, funcionTeatral, 4, 400));
        ventas.agregarVenta(new Venta(1, segundaFuncionTeatral, 5, 800));
        
        ArrayList<Venta> ventasClonadas = ventas.getVentas();
        ventas.setVentas(ventasClonadas);
        
        Boolean fueronSeteadas = ventas.getVentas() != null;
        assertTrue(fueronSeteadas);
    }

}

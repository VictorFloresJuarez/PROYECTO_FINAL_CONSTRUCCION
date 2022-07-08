/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

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
public class ObrasTeatralesTest {

    public ObrasTeatralesTest() {
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
     * Test of getObraTeatral method, of class ObrasTeatrales.
     */
    @Test
    public void testGetObraTeatral() {
        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores Juarez", "curpDeVictor", "Pachas", "contraseniaVictor");
        usuarios.agregarUsuario("Juan", "Ramirez", "curpDeJuan", "PepeEl", "contraseniaJuan");
        usuarios.agregarUsuario("Emmanuel", "FJuarez", "curpEmmanuel", "emmaUser", "contraseniaEmmanuel");
        usuarios.modificarUsuario("Pachas", "VictorM", "FloresM", "curpDeVictorModif", "PachasModificado", "contraseniaVictorM");
        usuarios.modificarUsuario("emmaUser", "EmmanuelM", "FJuarezM", "curpEmmanuelM", "emmaUserM", "contraseniaEmmanuelM");
        Usuario pachas = usuarios.getUsuario("PachasModificado");
        Usuario emmaUser = usuarios.getUsuario("emmaUserM");
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, pachas, emmaUser, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, emmaUser, pachas, (float) 30.4);
        Boolean seObtuvo = obrasTeatrales.getObraTeatral("Dark Souls") != null;
        assertTrue(seObtuvo);
    }

    /**
     * Test of agregarObra method, of class ObrasTeatrales.
     */
    @Test
    public void testAgregarObra() {
        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores Juarez", "curpDeVictor", "Pachas", "contraseniaVictor");
        usuarios.agregarUsuario("Juan", "Ramirez", "curpDeJuan", "PepeEl", "contraseniaJuan");
        usuarios.agregarUsuario("Emmanuel", "FJuarez", "curpEmmanuel", "emmaUser", "contraseniaEmmanuel");
        usuarios.modificarUsuario("Pachas", "VictorM", "FloresM", "curpDeVictorModif", "PachasModificado", "contraseniaVictorM");
        usuarios.modificarUsuario("emmaUser", "EmmanuelM", "FJuarezM", "curpEmmanuelM", "emmaUserM", "contraseniaEmmanuelM");
        Usuario pachas = usuarios.getUsuario("PachasModificado");
        Usuario emmaUser = usuarios.getUsuario("emmaUserM");
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, pachas, emmaUser, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, emmaUser, pachas, (float) 30.4);
        Boolean seCrearon = (!(obrasTeatrales.getObraTeatral("Dark Souls").getNombre().isEmpty()) && !(obrasTeatrales.getObraTeatral("Dark Souls 2 ").getNombre().isEmpty()));
        assertTrue(seCrearon);
    }

    /**
     * Test of modificarObra method, of class ObrasTeatrales.
     */
    @Test
    public void testModificarObra() {
        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores Juarez", "curpDeVictor", "Pachas", "contraseniaVictor");
        usuarios.agregarUsuario("Juan", "Ramirez", "curpDeJuan", "PepeEl", "contraseniaJuan");
        usuarios.agregarUsuario("Emmanuel", "FJuarez", "curpEmmanuel", "emmaUser", "contraseniaEmmanuel");
        usuarios.modificarUsuario("Pachas", "VictorM", "FloresM", "curpDeVictorModif", "PachasModificado", "contraseniaVictorM");
        usuarios.modificarUsuario("emmaUser", "EmmanuelM", "FJuarezM", "curpEmmanuelM", "emmaUserM", "contraseniaEmmanuelM");
        Usuario pachas = usuarios.getUsuario("PachasModificado");
        Usuario emmaUser = usuarios.getUsuario("emmaUserM");
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, pachas, emmaUser, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, emmaUser, pachas, (float) 30.4);
        obrasTeatrales.modificarObra("Dark Souls", "Dark Souls Modificado", "RPG", "Resumen de la obra", 46512, pachas, emmaUser, (float) 45.34);

        Boolean seModifico = (obrasTeatrales.getObraTeatral("Dark Souls Modificado") != null);
        assertTrue(seModifico);
    }

    /**
     * Test of eliminarObra method, of class ObrasTeatrales.
     */
    @Test
    public void testEliminarObra() {
        Usuarios usuarios = new Usuarios();
        usuarios.agregarUsuario("Victor", "Flores Juarez", "curpDeVictor", "Pachas", "contraseniaVictor");
        usuarios.agregarUsuario("Juan", "Ramirez", "curpDeJuan", "PepeEl", "contraseniaJuan");
        usuarios.agregarUsuario("Emmanuel", "FJuarez", "curpEmmanuel", "emmaUser", "contraseniaEmmanuel");
        usuarios.modificarUsuario("Pachas", "VictorM", "FloresM", "curpDeVictorModif", "PachasModificado", "contraseniaVictorM");
        usuarios.modificarUsuario("emmaUser", "EmmanuelM", "FJuarezM", "curpEmmanuelM", "emmaUserM", "contraseniaEmmanuelM");
        Usuario pachas = usuarios.getUsuario("PachasModificado");
        Usuario emmaUser = usuarios.getUsuario("emmaUserM");
        ObrasTeatrales obrasTeatrales = new ObrasTeatrales();
        obrasTeatrales.agregarObra("Dark Souls", "RPG", "Resumen de la obra", 46512, pachas, emmaUser, (float) 45.34);
        obrasTeatrales.agregarObra("Dark Souls 2 ", "RPG 2 ", "Resumen de la obra 2", 46512, emmaUser, pachas, (float) 30.4);
        obrasTeatrales.eliminarObra("Dark Souls");

        Boolean seElimino = obrasTeatrales.getObraTeatral("Dark Souls") == null;
        assertTrue(seElimino);
    }
}

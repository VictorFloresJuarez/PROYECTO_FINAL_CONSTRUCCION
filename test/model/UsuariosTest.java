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
public class UsuariosTest {
    public UsuariosTest() {
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
     * Test of getUsuarios method, of class Usuarios.
     */
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        Usuarios instance = new Usuarios();
        instance.agregarUsuario("Victor", "Flores Juárez", "FOJV221002", "Pachas", "221002");
        ArrayList<Usuario> result = instance.getUsuarios();
        Usuario victor = result.get(0);
        Boolean esUsuarios = victor.getNombre().equals("Víctor");
        assertFalse(esUsuarios);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getUsuario method, of class Usuarios.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Usuarios instance = new Usuarios();
        instance.agregarUsuario("Victor", "Flores Juárez", "FOJV221002", "Pachas", "221002");
        String expResult = "Pachas";
        String result = instance.getUsuario("Pachas").getNombreDeUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregarUsuario method, of class Usuarios.
     */
    @Test
    public void testAgregarUsuario() {
        System.out.println("agregarUsuario");
        String nombre = "Victor";
        String apellido = "Flores Juarez";
        String CURP = "FOJ2210";
        String nombreDeUsuario = "Pachas";
        String contrasenia = "221002";
        Usuarios instance = new Usuarios();
        instance.agregarUsuario(nombre, apellido, CURP, nombreDeUsuario, contrasenia);
        Boolean fueAgregado = (instance.getUsuario(nombreDeUsuario) != null);
        assertTrue(fueAgregado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificarUsuario method, of class Usuarios.
     */
    @Test
    public void testModificarUsuario() {
        System.out.println("modificarUsuario");
        String usuarioAModificar = "Pachas";
        String nombre = "VictorModificado";
        String apellido = "FloresModificado";
        String CURP = "CURPModificada";
        String nombreDeUsuario = "PachasModificado";
        String contrasenia = "221002";
        Usuarios instance = new Usuarios();
        instance.agregarUsuario(nombre, apellido, CURP, nombreDeUsuario, contrasenia);
        instance.modificarUsuario(usuarioAModificar, nombre, apellido, CURP, nombreDeUsuario, contrasenia);
        Boolean esElModificado = instance.getUsuario(nombreDeUsuario).getApellido().isEmpty();
        assertFalse(esElModificado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminarUsuario method, of class Usuarios.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        Usuarios instance = new Usuarios();
        instance.agregarUsuario("Victor", "Flores Juárez", "FOJV221002", "Pachas", "221002");
        instance.eliminarUsuario("Pachas");
        Boolean seElimino = instance.getUsuario("Pachas") != null;
        assertFalse(seElimino);
        // TODO review the generated test code and remove the default call to fail.
    }
}

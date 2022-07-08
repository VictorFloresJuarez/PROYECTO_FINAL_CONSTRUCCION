/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *Clase Usuarios que representa la entidad de TODOS los usuarios que existen.
 * @author Víctor Flores Juárez
 */
public class Usuarios {

    private ArrayList<Usuario> usuarios;

    /**
     * Constructor de la clase. Instancia un objeto que contiene una lista con todos los usuarios del teatro.
     */
    public Usuarios() {
        this.usuarios = new ArrayList<Usuario>();
    }

    /**
     * Función que retorna un objeto de tipo Lista con todos los usuarios.
     * @return 
     */
    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }


    /**
     * Función que retorna un objeto de tipo Usuario que representa un usuario específico del teatro que fue buscado
     * @param nombreDeUsuario
     * @return 
     */
    public Usuario getUsuario(String nombreDeUsuario) {
        Boolean esElUsuario;
        for (Usuario usuario : this.usuarios) {
            esElUsuario = usuario.getNombreDeUsuario().equals(nombreDeUsuario);
            if (esElUsuario) {
                return (Usuario)usuario;
            }
        }
        return null;
    }

    /**
     * Método para agregar un nuevo usuario a la lista de usuarios del teatro, recibiendo todos los parámetros que son requeridos para realizar una instanciación de la clase Usuario
     * @param nombre
     * @param apellido
     * @param CURP
     * @param nombreDeUsuario
     * @param contrasenia 
     */
    public void agregarUsuario(String nombre, String apellido, String CURP, String nombreDeUsuario, String contrasenia) {
        Usuario nuevoUsuario = new Usuario(nombre, apellido, CURP, nombreDeUsuario, contrasenia);
        this.usuarios.add(nuevoUsuario);
    }

    /**
     * Método para modificar a un usuario existente de la lista de usuarios del teatro, recibiendo como parámetros todos los nuevos datos así como el nombre del usuario que se desea modificar
     * @param usuarioAModificar
     * @param nombre
     * @param apellido
     * @param CURP
     * @param nombreDeUsuario
     * @param contrasenia 
     */
    public void modificarUsuario(String usuarioAModificar, String nombre, String apellido, String CURP, String nombreDeUsuario, String contrasenia) {
        Boolean esElUsuario;
        for (Usuario usuario : this.usuarios) {
            esElUsuario = usuario.getNombreDeUsuario().equals(usuarioAModificar);
            if (esElUsuario) {
                usuario.modificarParametros(nombre, apellido, CURP, nombreDeUsuario, contrasenia);
            }
        }
    }

    /**
     * Método para eliminar un usuario existente de la lista de usuarios, recibiendo como parámetro el usuario que se desea eliminar.
     * @param usuarioAEliminar 
     */
    public void eliminarUsuario(String usuarioAEliminar) {
        Boolean esElUsuario;
        for (Usuario usuario : this.usuarios) {
            esElUsuario = usuario.getNombreDeUsuario().equals(usuarioAEliminar);
            if (esElUsuario) {
                this.usuarios.remove(usuario);
                break;
            }
        }
    }

    /**
     * Método para imprimir todos los usuarios de una instancia de la clase en consola.
     */
    public void imprimirUsuarios() {
        for (Usuario usuario : this.usuarios) {
            System.out.println(usuario.toString());
        }
    }
}

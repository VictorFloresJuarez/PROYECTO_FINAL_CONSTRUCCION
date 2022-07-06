/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class Usuarios {

    private ArrayList<Usuario> usuarios;

    public Usuarios() {
        this.usuarios = new ArrayList<Usuario>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(ArrayList usuarios) {
        this.usuarios = usuarios;
    }

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

    public void agregarUsuario(String nombre, String apellido, String CURP, String nombreDeUsuario, String contrasenia) {
        Usuario nuevoUsuario = new Usuario(nombre, apellido, CURP, nombreDeUsuario, contrasenia);
        this.usuarios.add(nuevoUsuario);
    }

    public void modificarUsuario(String usuarioAModificar, String nombre, String apellido, String CURP, String nombreDeUsuario, String contrasenia) {
        Boolean esElUsuario;
        for (Usuario usuario : this.usuarios) {
            esElUsuario = usuario.getNombreDeUsuario().equals(usuarioAModificar);
            if (esElUsuario) {
                usuario.modificarParametros(nombre, apellido, CURP, nombreDeUsuario, contrasenia);
            }
        }
    }

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

    public void imprimirUsuarios() {
        for (Usuario usuario : this.usuarios) {
            System.out.println(usuario.toString());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Usuario;
import model.Usuarios;
import view.ViewRegistroUsuario;

/**
 *
 * @author victo
 */
public class ControlUsuarios implements ActionListener {

    DefaultListModel model = new DefaultListModel();
    private Usuarios usuarios;
    private ViewRegistroUsuario vistaUsuarios;

    public ControlUsuarios(Usuarios usuarios, ViewRegistroUsuario vistaUsuarios) {
        this.usuarios = usuarios;
        this.vistaUsuarios = vistaUsuarios;
        this.vistaUsuarios.buttonActualizar.addActionListener(this);
        this.vistaUsuarios.buttonEliminar.addActionListener(this);
        this.vistaUsuarios.buttonGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent botonPresionado) {
        if (botonPresionado.getSource() == this.vistaUsuarios.buttonActualizar) {
            String usuarioPorActualizar = this.vistaUsuarios.txtUsuarioModificarEliminar.getText();
            String nombre = this.vistaUsuarios.txtNombre.getText();
            String apellido = this.vistaUsuarios.txtApellido.getText();
            String CURP = this.vistaUsuarios.txtCURP.getText();
            String nombreDeUsuario = this.vistaUsuarios.txtNombreDeUsuario.getText();
            String contrasenia = this.vistaUsuarios.txtContrasenia.getText();
            Boolean nuevosParametrosValidos = (!nombre.isEmpty()) && (!apellido.isEmpty()) && (!CURP.isEmpty()) && (!nombreDeUsuario.isEmpty()) && (!contrasenia.isEmpty());
            if (nuevosParametrosValidos) {
                Usuario usuarioPorModificar = usuarios.getUsuario(usuarioPorActualizar);
                if (usuarioPorModificar != null) {
                    if (usuarioPorModificar.getContrasena().equals(contrasenia)) {
                        this.usuarios.modificarUsuario(usuarioPorActualizar, nombre, apellido, CURP, nombreDeUsuario, contrasenia);
                        JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario inexistente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Necesita ingresar TODOS los campos");
            }
        }

        if (botonPresionado.getSource() == this.vistaUsuarios.buttonEliminar) {
            String usuarioPorEliminar = this.vistaUsuarios.txtUsuarioModificarEliminar.getText();
            String contrasenia = this.vistaUsuarios.txtContrasenia.getText();
            Usuario usuarioAEliminar = this.usuarios.getUsuario(usuarioPorEliminar);
            if (usuarioAEliminar != null) {
                if (usuarioAEliminar.getContrasena().equals(contrasenia) && usuarioAEliminar != null) {
                    this.usuarios.eliminarUsuario(usuarioPorEliminar);
                    JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta o el usuario no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario inexistente");
            }
        }

        if (botonPresionado.getSource() == this.vistaUsuarios.buttonGuardar) {
            String nombre = this.vistaUsuarios.txtNombre.getText();
            String apellido = this.vistaUsuarios.txtApellido.getText();
            String CURP = this.vistaUsuarios.txtCURP.getText();
            String nombreDeUsuario = this.vistaUsuarios.txtNombreDeUsuario.getText();
            String contrasenia = this.vistaUsuarios.txtContrasenia.getText();
            Boolean nuevoUsuarioValido = (!nombre.isEmpty()) && (!apellido.isEmpty()) && (!CURP.isEmpty()) && (!nombreDeUsuario.isEmpty()) && (!contrasenia.isEmpty());
            if (nuevoUsuarioValido) {
                this.usuarios.agregarUsuario(nombre, apellido, CURP, nombreDeUsuario, contrasenia);
                JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Necesita ingresar TODOS los campos");
            }
        }

        /*if (botonPresionado.getSource() == this.vistaUsuarios.buttonListarUsuarios) {
            Boolean listaEstaVacia = this.usuarios.getUsuarios().isEmpty();
            if (!listaEstaVacia) {
                this.model.removeAllElements();
                for (Usuario usuarioActual : this.usuarios.getUsuarios()) {
                    this.model.addElement(usuarioActual.getNombre());
                }
                this.vistaUsuarios.listaUsuarios.setModel(model);
            }
        }*/

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Usuario;
import model.Usuarios;
import view.ViewRegistroUsuario;

/**
 *
 * @author victo
 */
public class ControlUsuarios implements ActionListener {

    DefaultTableModel model = new DefaultTableModel();
    private Usuarios usuarios;
    private ViewRegistroUsuario vistaUsuarios;

    public ControlUsuarios(Usuarios usuarios, ViewRegistroUsuario vistaUsuarios) {
        this.usuarios = usuarios;
        this.vistaUsuarios = vistaUsuarios;
        this.vistaUsuarios.buttonActualizar.addActionListener(this);
        this.vistaUsuarios.buttonEliminar.addActionListener(this);
        this.vistaUsuarios.buttonGuardar.addActionListener(this);
        this.model = new DefaultTableModel();
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
                        Usuario usuarioActualizado = this.usuarios.getUsuario(usuarioPorActualizar);
                        String textoUsuario = usuarioActualizado.getTexto();
                        JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente, NUEVOS DATOS:        " + textoUsuario);
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
                    String textoDelUsuario = usuarioAEliminar.getTexto();
                    JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente:    " + textoDelUsuario);
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
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
                Usuario usuarioAAgregar = this.usuarios.getUsuario(nombreDeUsuario);
                String textoDelUsuario = usuarioAAgregar.getTexto();
                JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente. " + textoDelUsuario);
                listar(this.vistaUsuarios.tablaUsuarios);
            } else {
                JOptionPane.showMessageDialog(null, "Necesita ingresar TODOS los campos");
            }
        }
    }
    
    public void listar(JTable tabla) {
        Object[] object = new Object[2];
        ArrayList<Usuario> lista = this.usuarios.getUsuarios();
        Usuario usuarioActual = null;
        for (int i = 0; i < lista.size(); i++) {
            usuarioActual = lista.get(i);
            object[0] = usuarioActual.getNombreDeUsuario();
            object[1] = usuarioActual.getNombre();
            model.addRow(object);
        }
        this.vistaUsuarios.tablaUsuarios.setModel(model);
    }
}

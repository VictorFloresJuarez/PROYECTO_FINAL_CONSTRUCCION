/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.ObraTeatral;
import model.ObrasTeatrales;
import model.Usuario;
import view.ViewObrasTeatrales;

/**
 *
 * @author victo
 */
public class ControlObrasTeatrales implements ActionListener {

    private ObrasTeatrales obrasTeatrales;
    private ViewObrasTeatrales vistaObrasTeatrales;

    public ControlObrasTeatrales(ObrasTeatrales obrasTeatrales, ViewObrasTeatrales vistaObrasTeatrales) {
        this.obrasTeatrales = obrasTeatrales;
        this.vistaObrasTeatrales = vistaObrasTeatrales;
        this.vistaObrasTeatrales.buttonActualizarObra.addActionListener(this);
        this.vistaObrasTeatrales.buttonAgregarObra.addActionListener(this);
        this.vistaObrasTeatrales.buttonEliminar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent botonPresionado) {
        if (botonPresionado.getSource() == this.vistaObrasTeatrales.buttonActualizarObra) {
            String obraAModificar = this.vistaObrasTeatrales.txtObraAModificarEliminar.getText();
            String nuevoNombreObra = this.vistaObrasTeatrales.txtNombreDeLaObra.getText();
            String nuevoGenero = this.vistaObrasTeatrales.txtGenero.getText();
            String nuevoResumen = this.vistaObrasTeatrales.txtResumen.getText();
            int nuevaDuracionEnMin = Integer.parseInt(this.vistaObrasTeatrales.txtDuracionEnMin.getText());
            float precioDelBoleto = Float.parseFloat(this.vistaObrasTeatrales.txtPrecioDelBoleto.getText());

            String nuevoNombrePrimerActor = this.vistaObrasTeatrales.txtNombrePrimerActor.getText();
            String nuevoNombreSegundoActor = this.vistaObrasTeatrales.txtNombreSegundoActor.getText();
            String nuevoApellidoPrimerActor = this.vistaObrasTeatrales.txtApellidoPrimerActor.getText();
            String nuevoApellidoSegundoActor = this.vistaObrasTeatrales.txtApellidoSegundoActor.getText();
            String nuevaCURPPrimerActor = this.vistaObrasTeatrales.txtCURPPrimerActor.getText();
            String nuevaCURPSegundoActor = this.vistaObrasTeatrales.txtCURPSegundoActor.getText();
            String nuevoNombreDeUsuarioPrimerActor = this.vistaObrasTeatrales.txtNombreDeUsuarioPrimerActor.getText();
            String nuevoNombreDeUsuarioSegundoActor = this.vistaObrasTeatrales.txtNombreDeUsuarioSegundoActor.getText();
            String nuevaContraseniaPrimerActor = this.vistaObrasTeatrales.txtContraseniaPrimerActor.getText();
            String nuevaContraseniaSegundoActor = this.vistaObrasTeatrales.txtContraseniaSegundoActor.getText();

            Usuario primerActor = new Usuario(nuevoNombrePrimerActor, nuevoApellidoPrimerActor, nuevaCURPPrimerActor, nuevoNombreDeUsuarioPrimerActor, nuevaContraseniaPrimerActor);
            Usuario segundoActor = new Usuario(nuevoNombreSegundoActor, nuevoApellidoSegundoActor, nuevaCURPSegundoActor, nuevoNombreDeUsuarioSegundoActor, nuevaContraseniaSegundoActor);

            Boolean nuevosParametrosValidos = (!nuevoNombreObra.isEmpty()) && (!nuevoGenero.isEmpty()) && (!nuevoResumen.isEmpty()) && (!this.vistaObrasTeatrales.txtDuracionEnMin.getText().isEmpty()) && (this.vistaObrasTeatrales.txtPrecioDelBoleto.getText().isEmpty())
                    && (!nuevoNombrePrimerActor.isEmpty()) && (!nuevoNombreDeUsuarioSegundoActor.isEmpty()) && (!nuevoApellidoPrimerActor.isEmpty()) && (!nuevoApellidoSegundoActor.isEmpty()) && (!nuevaCURPPrimerActor.isEmpty()) && (!nuevaCURPSegundoActor.isEmpty());
            if (nuevosParametrosValidos) {
                ObraTeatral obraPorCambiar = this.obrasTeatrales.getObraTeatral(nuevoNombreObra);
                Boolean obraExiste = obraPorCambiar != null;
                if (obraExiste) {
                    this.obrasTeatrales.modificarObra(obraAModificar, nuevoNombreObra, nuevoGenero, nuevoResumen, nuevaDuracionEnMin, primerActor, segundoActor, precioDelBoleto);
                    JOptionPane.showMessageDialog(null, "Obra modificada exitosamente!");
                } else {
                    JOptionPane.showMessageDialog(null, "La obra no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar TODOS los datos");
            }
        }

        if (botonPresionado.getSource() == this.vistaObrasTeatrales.buttonEliminar) {
            String obraAEliminar = this.vistaObrasTeatrales.txtObraAModificarEliminar.getText();
            ObraTeatral obraTeatral = this.obrasTeatrales.getObraTeatral(obraAEliminar);
            Boolean obraExiste = obraTeatral != null;
            if (obraExiste) {
                this.obrasTeatrales.eliminarObra(obraAEliminar);
            } else {
                JOptionPane.showMessageDialog(null, "La obra no existe");
            }
        }

        if (botonPresionado.getSource() == this.vistaObrasTeatrales.buttonAgregarObra) {
            String nuevoNombreObra = this.vistaObrasTeatrales.txtNombreDeLaObra.getText();
            String nuevoGenero = this.vistaObrasTeatrales.txtGenero.getText();
            String nuevoResumen = this.vistaObrasTeatrales.txtResumen.getText();
            int nuevaDuracionEnMin = Integer.parseInt(this.vistaObrasTeatrales.txtDuracionEnMin.getText());
            float precioDelBoleto = Float.parseFloat(this.vistaObrasTeatrales.txtPrecioDelBoleto.getText());

            String nuevoNombrePrimerActor = this.vistaObrasTeatrales.txtNombrePrimerActor.getText();
            String nuevoNombreSegundoActor = this.vistaObrasTeatrales.txtNombreSegundoActor.getText();
            String nuevoApellidoPrimerActor = this.vistaObrasTeatrales.txtApellidoPrimerActor.getText();
            String nuevoApellidoSegundoActor = this.vistaObrasTeatrales.txtApellidoSegundoActor.getText();
            String nuevaCURPPrimerActor = this.vistaObrasTeatrales.txtCURPPrimerActor.getText();
            String nuevaCURPSegundoActor = this.vistaObrasTeatrales.txtCURPSegundoActor.getText();
            String nuevoNombreDeUsuarioPrimerActor = this.vistaObrasTeatrales.txtNombreDeUsuarioPrimerActor.getText();
            String nuevoNombreDeUsuarioSegundoActor = this.vistaObrasTeatrales.txtNombreDeUsuarioSegundoActor.getText();
            String nuevaContraseniaPrimerActor = this.vistaObrasTeatrales.txtContraseniaPrimerActor.getText();
            String nuevaContraseniaSegundoActor = this.vistaObrasTeatrales.txtContraseniaSegundoActor.getText();

            Usuario primerActor = new Usuario(nuevoNombrePrimerActor, nuevoApellidoPrimerActor, nuevaCURPPrimerActor, nuevoNombreDeUsuarioPrimerActor, nuevaContraseniaPrimerActor);
            Usuario segundoActor = new Usuario(nuevoNombreSegundoActor, nuevoApellidoSegundoActor, nuevaCURPSegundoActor, nuevoNombreDeUsuarioSegundoActor, nuevaContraseniaSegundoActor);

            Boolean nuevosParametrosValidos = (!nuevoNombreObra.isEmpty()) && (!nuevoGenero.isEmpty()) && (!nuevoResumen.isEmpty()) && (!this.vistaObrasTeatrales.txtDuracionEnMin.getText().isEmpty()) && (this.vistaObrasTeatrales.txtPrecioDelBoleto.getText().isEmpty())
                    && (!nuevoNombrePrimerActor.isEmpty()) && (!nuevoNombreDeUsuarioSegundoActor.isEmpty()) && (!nuevoApellidoPrimerActor.isEmpty()) && (!nuevoApellidoSegundoActor.isEmpty()) && (!nuevaCURPPrimerActor.isEmpty()) && (!nuevaCURPSegundoActor.isEmpty());
            if (nuevosParametrosValidos) {
                this.obrasTeatrales.agregarObra(nuevoNombreObra, nuevoGenero, nuevoResumen, nuevaDuracionEnMin, primerActor, segundoActor, precioDelBoleto);
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar TODOS los datos");
            }
        }
        
        if (botonPresionado.getSource() == this.vistaObrasTeatrales.buttonListarObras) {

        }
    }
}
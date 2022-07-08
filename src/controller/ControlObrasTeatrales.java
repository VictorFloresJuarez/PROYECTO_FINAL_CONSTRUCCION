/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ObraTeatral;
import model.ObrasTeatrales;
import model.Usuario;
import view.ViewObrasTeatrales;

/**
 *Clase ControlObrasTeatrales, que sirve para ser el controlador entre el JFrame ViewObrasTeatrales y la clase ObrasTeatrales.
 * @author Víctor Flores Juárez
 */
public class ControlObrasTeatrales implements ActionListener {

    DefaultTableModel model = new DefaultTableModel();
    private ObrasTeatrales obrasTeatrales;
    private ViewObrasTeatrales vistaObrasTeatrales;
    
    /**
     * Constructor de la clase ControlObrasTeatrales, como todo controlador recibe como parámetro la vista que va a controlar y la clase que representa esa vista.
     * @param obrasTeatrales
     * @param vistaObrasTeatrales 
     */
    public ControlObrasTeatrales(ObrasTeatrales obrasTeatrales, ViewObrasTeatrales vistaObrasTeatrales) {
        this.obrasTeatrales = obrasTeatrales;
        this.vistaObrasTeatrales = vistaObrasTeatrales;
        this.vistaObrasTeatrales.buttonActualizarObra.addActionListener(this);
        this.vistaObrasTeatrales.buttonAgregarObra.addActionListener(this);
        this.vistaObrasTeatrales.buttonEliminar.addActionListener(this);
        this.model = new DefaultTableModel();
    }
    
    /**
     * Método que controla la acción realizada por el usuario. Detectando cuando se presiona alguno de los botones.
     * @param botonPresionado 
     */
    @Override
    public void actionPerformed(ActionEvent botonPresionado) {
        if (botonPresionado.getSource() == this.vistaObrasTeatrales.buttonActualizarObra) {
            String obraAModificar = this.vistaObrasTeatrales.txtObraAModificarEliminar.getText();
            String nuevoNombreObra = this.vistaObrasTeatrales.txtNombreDeLaObra.getText();
            String nuevoGenero = this.vistaObrasTeatrales.txtGenero.getText();
            String nuevoResumen = this.vistaObrasTeatrales.txtResumen.getText();
            int nuevaDuracionEnMin = 0;
            float precioDelBoleto = 0;
            try {
                nuevaDuracionEnMin = Integer.parseInt(this.vistaObrasTeatrales.txtDuracionEnMin.getText());
                precioDelBoleto = Float.parseFloat(this.vistaObrasTeatrales.txtPrecioDelBoleto.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese valores válidos para el precio del boleto y la duración");
            }

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

            Boolean nuevosParametrosValidos = (!nuevoNombreObra.isEmpty()) && (!nuevoGenero.isEmpty()) && (!nuevoResumen.isEmpty()) && (!this.vistaObrasTeatrales.txtDuracionEnMin.getText().isEmpty()) && (!this.vistaObrasTeatrales.txtPrecioDelBoleto.getText().isEmpty())
                    && (!nuevoNombrePrimerActor.isEmpty()) && (!nuevoNombreDeUsuarioSegundoActor.isEmpty()) && (!nuevoApellidoPrimerActor.isEmpty()) && (!nuevoApellidoSegundoActor.isEmpty()) && (!nuevaCURPPrimerActor.isEmpty()) && (!nuevaCURPSegundoActor.isEmpty());
            if (nuevosParametrosValidos) {
                ObraTeatral obraPorCambiar = this.obrasTeatrales.getObraTeatral(obraAModificar);
                Boolean obraExiste = obraPorCambiar != null;
                if (obraExiste) {
                    this.obrasTeatrales.modificarObra(obraAModificar, nuevoNombreObra, nuevoGenero, nuevoResumen, nuevaDuracionEnMin, primerActor, segundoActor, precioDelBoleto);
                    ObraTeatral obraModificada = this.obrasTeatrales.getObraTeatral(nuevoNombreObra);
                    String textoObra = obraModificada.getTextoObraTeatral();
                    JOptionPane.showMessageDialog(null, "Obra modificada exitosamente!          " + textoObra);
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
                ObraTeatral obraTeatralAEliminar = this.obrasTeatrales.getObraTeatral(obraAEliminar);
                String textoObraAEliminar = obraTeatralAEliminar.getTextoObraTeatral();
                this.obrasTeatrales.eliminarObra(obraAEliminar);
                JOptionPane.showMessageDialog(null, "Obra eliminada correctamente:              " + textoObraAEliminar);
            } else {
                JOptionPane.showMessageDialog(null, "La obra no existe");
            }
        }

        if (botonPresionado.getSource() == this.vistaObrasTeatrales.buttonAgregarObra) {
            String nuevoNombreObra = this.vistaObrasTeatrales.txtNombreDeLaObra.getText();
            String nuevoGenero = this.vistaObrasTeatrales.txtGenero.getText();
            String nuevoResumen = this.vistaObrasTeatrales.txtResumen.getText();
            int nuevaDuracionEnMin = 0;
            float precioDelBoleto = 0;
            try {
                nuevaDuracionEnMin = Integer.parseInt(this.vistaObrasTeatrales.txtDuracionEnMin.getText());
                precioDelBoleto = Float.parseFloat(this.vistaObrasTeatrales.txtPrecioDelBoleto.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese valores válidos para el precio del boleto y la duración");
            }

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

            Boolean nuevosParametrosValidos = (!nuevoNombreObra.isEmpty()) && (!nuevoGenero.isEmpty()) && (!nuevoResumen.isEmpty()) && (!this.vistaObrasTeatrales.txtDuracionEnMin.getText().isEmpty()) && (!this.vistaObrasTeatrales.txtPrecioDelBoleto.getText().isEmpty())
                    && (!nuevoNombrePrimerActor.isEmpty()) && (!nuevoNombreDeUsuarioSegundoActor.isEmpty()) && (!nuevoApellidoPrimerActor.isEmpty()) && (!nuevoApellidoSegundoActor.isEmpty()) && (!nuevaCURPPrimerActor.isEmpty()) && (!nuevaCURPSegundoActor.isEmpty());
            if (nuevosParametrosValidos) {
                this.obrasTeatrales.agregarObra(nuevoNombreObra, nuevoGenero, nuevoResumen, nuevaDuracionEnMin, primerActor, segundoActor, precioDelBoleto);
                ObraTeatral obraTeatralAgregar = this.obrasTeatrales.getObraTeatral(nuevoNombreObra);
                String textoObraAgregada = obraTeatralAgregar.getTextoObraTeatral();
                JOptionPane.showMessageDialog(null, "Obra creada exitosamente                   " + textoObraAgregada);
                listar(this.vistaObrasTeatrales.tablaObras);
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar TODOS los datos");
            }
        }

    }

    /**
     * Método que lista todas las obras teatrales en una JTable. Recibe como parámetro la JTable creada en el JFrame, osea la tabla que pertenece al objeto vistaObrasTeatrales.
     * @param tabla 
     */
    public void listar(JTable tabla) {
        Object[] object = new Object[4];
        ArrayList<ObraTeatral> lista = this.obrasTeatrales.getObrasTeatrales();
        ObraTeatral obraActual = null;
        for (int i = 0; i < lista.size(); i++) {
            obraActual = lista.get(i);
            object[0] = obraActual.getNombre();
            object[1] = obraActual.getGenero();
            object[2] = obraActual.getResumen();
            object[3] = "2";
            this.model.addRow(object);
        }
        this.vistaObrasTeatrales.tablaObras.setModel(this.model);
    }
}

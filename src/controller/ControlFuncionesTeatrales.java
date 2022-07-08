/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.FuncionesTeatrales;
import model.ModeloTablasVistasFuncionesTeatrales;
import model.ModeloTablasVistasObrasTeatrales;
import model.ObraTeatral;
import model.ObrasTeatrales;
import view.VistaFuncionesTeatrales;

/**
 *
 * @author victo
 */
public class ControlFuncionesTeatrales implements ActionListener {

    DefaultTableModel model;
    private FuncionesTeatrales funcionesTeatrales;
    private ObrasTeatrales obrasTeatrales;
    private VistaFuncionesTeatrales vistaFuncionesTeatrales;

    public ControlFuncionesTeatrales(FuncionesTeatrales funcionesTeatrales, VistaFuncionesTeatrales vistaFuncionesTeatrales, ObrasTeatrales obrasTeatrales) {
        this.obrasTeatrales = obrasTeatrales;
        this.funcionesTeatrales = funcionesTeatrales;
        this.vistaFuncionesTeatrales = vistaFuncionesTeatrales;
        this.model = new DefaultTableModel();
        this.vistaFuncionesTeatrales.buttonActualizar.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent botonPresionado) {
        if (botonPresionado.getSource() == this.vistaFuncionesTeatrales.buttonActualizar) {
        	System.out.println("---------Mostrando tabla------");
            ModeloTablasVistasFuncionesTeatrales tableModel= new ModeloTablasVistasFuncionesTeatrales(funcionesTeatrales.getFuncionesTeatrales());
            vistaFuncionesTeatrales.tablaFunciones.setModel(tableModel);
            String nombreDeLaObra = this.vistaFuncionesTeatrales.txtNombreDeLaObra.getText();
            //tuve que comentarlo para hacerlo funcionar
//            int diaDeLaObra = Integer.parseInt(this.vistaFuncionesTeatrales.txtDia.getText());
//            int mesDeLaObra = Integer.parseInt(this.vistaFuncionesTeatrales.txtMes.getText());
//            int anioDeLaObra = Integer.parseInt(this.vistaFuncionesTeatrales.txtAnio.getText());
//            int horaDeLaObra = Integer.parseInt(this.vistaFuncionesTeatrales.txtHora.getText());
//            int minutoDeLaObra = Integer.parseInt(this.vistaFuncionesTeatrales.txtMinuto.getText());
//
//            int diaDeLaObraAntiguo = Integer.parseInt(this.vistaFuncionesTeatrales.txtDiaAntiguo.getText());
//            int mesDeLaObraAntiguo = Integer.parseInt(this.vistaFuncionesTeatrales.txtMesAntiguo.getText());
//            int anioDeLaObraAntiguo = Integer.parseInt(this.vistaFuncionesTeatrales.txtAnioAntiguo.getText());
//            int horaDeLaObraAntiguo = Integer.parseInt(this.vistaFuncionesTeatrales.txtHoraAntiguo.getText());
//            int minutoDeLaObraAntiguo = Integer.parseInt(this.vistaFuncionesTeatrales.txtMinutoAntiguo.getText());
//
//            LocalDate fechaPresentacion = LocalDate.of(anioDeLaObra, mesDeLaObra, diaDeLaObra);
//            LocalTime horaPresentacion = LocalTime.of(horaDeLaObra, minutoDeLaObra);
//
//            LocalDate fechaAntigua = LocalDate.of(anioDeLaObraAntiguo, mesDeLaObraAntiguo, diaDeLaObraAntiguo);
//            LocalTime horaAntigua = LocalTime.of(horaDeLaObraAntiguo, minutoDeLaObraAntiguo);
//
//            ObraTeatral obraTeatral = this.obrasTeatrales.getObraTeatral(nombreDeLaObra);
//            this.funcionesTeatrales.modificarFuncion(nombreDeLaObra, fechaAntigua, horaAntigua, obraTeatral, fechaPresentacion, horaPresentacion);
//            JOptionPane.showMessageDialog(null, "Función modificada con éxito");
            

        }
    }
}

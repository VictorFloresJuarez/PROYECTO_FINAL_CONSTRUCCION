/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author victo
 */
public class ReporteVenta {

    private LocalDate diaInicio;
    private LocalDate diaFinal;
    private Ventas ventasTotales;

    public ReporteVenta() {

    }

    public ReporteVenta(LocalDate diaInicio, LocalDate diaFinal, Ventas todasLasVentas) {
        this.diaInicio = diaInicio;
        this.diaFinal = diaFinal;
        this.ventasTotales = todasLasVentas.obtenerVentasEspecificas(this.diaInicio, this.diaFinal);
    }

    /**
     * @return the diaInicio
     */
    public LocalDate getDiaInicio() {
        return diaInicio;
    }

    /**
     * @param diaInicio the diaInicio to set
     */
    public void setDiaInicio(LocalDate diaInicio) {
        this.diaInicio = diaInicio;
    }

    /**
     * @return the diaFinal
     */
    public LocalDate getDiaFinal() {
        return diaFinal;
    }

    /**
     * @param diaFinal the diaFinal to set
     */
    public void setDiaFinal(LocalDate diaFinal) {
        this.diaFinal = diaFinal;
    }

    /**
     * @return the ventasTotales
     */
    public Ventas getVentasTotales() {
        return ventasTotales;
    }

    /**
     * @param ventasTotales the ventasTotales to set
     */
    public void setVentasTotales(Ventas ventasTotales) {
        this.ventasTotales = ventasTotales;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReporteVenta{");
        sb.append("diaInicio=").append(diaInicio);
        sb.append(", diaFinal=").append(diaFinal);
        sb.append(", ventasTotales=").append(ventasTotales);
        sb.append('}');
        return sb.toString();
    }

}

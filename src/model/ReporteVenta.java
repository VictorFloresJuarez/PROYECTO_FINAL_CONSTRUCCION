/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *Clase ReporteVenta, que representa la entidad de un reporte de venta en un rango de tiempo.
 * @author Victor Flores Juarez
 */
public class ReporteVenta {

    private LocalDate diaInicio;
    private LocalDate diaFinal;
    private Ventas ventasTotales;

    public ReporteVenta() {

    }

    /**
     * Constructor de las instancias ReporteVenta, recibe como parámetro el rango de días para lo que se requiere el reporte y un objeto Ventas que contiene todas las ventas del teatro
     * @param diaInicio
     * @param diaFinal
     * @param todasLasVentas 
     */
    public ReporteVenta(LocalDate diaInicio, LocalDate diaFinal, Ventas todasLasVentas) {
        this.diaInicio = diaInicio;
        this.diaFinal = diaFinal;
        this.ventasTotales = todasLasVentas.obtenerVentasEspecificas(this.diaInicio, this.diaFinal);
    }

    /**
     * Función que retorna un objeto de tipo LocalDate que contiene el día del inicio del rango de días.
     * @return the diaInicio
     */
    public LocalDate getDiaInicio() {
        return diaInicio;
    }

    /**
     * Función que retorna un objeto de tipo LocalDate que contiene el día del final del rango de días.
     * @return the diaFinal
     */
    public LocalDate getDiaFinal() {
        return diaFinal;
    }

    /**
     * Función que retorna todas las ventas de un determinado período de tiempo
     * @return the ventasTotales
     */
    public Ventas getVentasTotales() {
        return ventasTotales;
    }



    /**
     * Función que imprime los valores de un reporte de venta en consola
     * @return 
     */
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

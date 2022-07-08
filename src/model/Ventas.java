/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *Clase Ventas, que representa la entidad de TODAS las ventas del teatro.
 * @author Víctor Flores Juárez
 */
public class Ventas {
    protected ArrayList<Venta> ventas;
    
    /**
     *Constructor de un objeto que contendrá todas las ventas.
     */
    public Ventas(){
        this.ventas = new ArrayList<Venta>();
    }
    
    
    public Ventas(ArrayList<Venta> ventas){
        this.ventas = ventas;
    }
    
    /**
     * Función que agrega una venta nueva a la lista de ventas.
     * @param venta 
     */
    public void agregarVenta(Venta venta){
        this.ventas.add(venta);
    }
    
    
    /**
     * Función que devuelve un objeto de tipo Ventas con todas las ventas de un derminado espacio de tiempo
     * @param fechaVentaDesde
     * @param fechaVentaHasta
     * @return 
     */
    public Ventas obtenerVentasEspecificas(LocalDate fechaVentaDesde, LocalDate fechaVentaHasta){
        Ventas ventasEspecificas = new Ventas();
        Boolean estaEnRango;
        for (Venta venta : this.ventas){
            estaEnRango = (venta.getFechaVenta().isAfter(fechaVentaDesde) && venta.getFechaVenta().isBefore(fechaVentaHasta) );
            if (estaEnRango){
                ventasEspecificas.agregarVenta(venta);
            }
        }
        return ventasEspecificas;
    }
    
    /**
     * Función que devuelve todas las ventas contenidas en la instancia.
     * @return the ventas
     */
    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    
    

    /**
     * Función que imprime todas las ventas que contiene la instancia en consola.
     */
    public void imprimirVentas(){
        for (Venta ventaActual : this.ventas){
            System.out.println(ventaActual.toString());
        }
    }

    /**
     * Función que establece las ventas de un objeto de tipo Ventas
     * @param ventas the ventas to set
     */
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    
}

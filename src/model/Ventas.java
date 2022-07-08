/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class Ventas {
    private ArrayList<Venta> ventas;
    
    public Ventas(){
        this.ventas = new ArrayList<Venta>();
    }
    
    public Ventas(ArrayList<Venta> ventas){
        this.ventas = ventas;
    }
    
    public void agregarVenta(Venta venta){
        this.ventas.add(venta);
    }
    
    
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
     * @return the ventas
     */
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    public void imprimirVentas(){
        for (Venta ventaActual : this.ventas){
            System.out.println(ventaActual.toString());
        }
    }
    
    
}

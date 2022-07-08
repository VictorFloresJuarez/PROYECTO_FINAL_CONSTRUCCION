/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *Clase FuncionesTeatrales, que representa la entidad de TODAS las funciones que se registran en el teatro.
 * @author Víctor Flores Juárez
 */
public class FuncionesTeatrales {

    private ArrayList<FuncionTeatral> funcionesTeatrales;

    public FuncionesTeatrales() {
        this.funcionesTeatrales = new ArrayList<FuncionTeatral>();
    }

    /**
     * @return the funcionesTeatrales
     */
    public ArrayList<FuncionTeatral> getFuncionesTeatrales() {
        return funcionesTeatrales;
    }

    /**
     * @param funcionesTeatrales the funcionesTeatrales to set
     */
    public void setFuncionesTeatrales(ArrayList<FuncionTeatral> funcionesTeatrales) {
        this.funcionesTeatrales = funcionesTeatrales;
    }
    
    /**
     * Función para obtener todas las funciones registradas en un período de tiempo.
     * @param nombreDeLaObra
     * @param fechaDeLaObra
     * @return funcionTeatralActual
     */
    public FuncionTeatral getFuncionEspecifica(String nombreDeLaObra, LocalDate fechaDeLaObra) {
        Boolean esLaFuncionEspecifica;
        for (FuncionTeatral funcionTeatralActual : this.funcionesTeatrales) {
            esLaFuncionEspecifica = funcionTeatralActual.getObraTeatral().getNombre().equals(nombreDeLaObra) && funcionTeatralActual.getFechaPresentacion().equals(fechaDeLaObra);
            if (esLaFuncionEspecifica){
                return funcionTeatralActual;
            }
        }
        
        return null;
    }
    
    /**
     * Función que no retorna ningún valor que agrega una nueva función al ArrayList de funciones de la clase.
     * @param obraTeatral
     * @param fechaPresentacion
     * @param horaPresentacion 
     */
    public void agregarFuncion(ObraTeatral obraTeatral, LocalDate fechaPresentacion, LocalTime horaPresentacion) {
        FuncionTeatral nuevaFuncionTeatral = new FuncionTeatral(obraTeatral, fechaPresentacion, horaPresentacion);
        this.funcionesTeatrales.add(nuevaFuncionTeatral);
    }

    /**
     * Lo que modifica esta funcion es la fecha o la hora de la función, no la obra teatral.
     * @param funcionAModificar
     * @param obraTeatral
     * @param fechaPresentacion
     * @param horaPresentacion
     * @param nuevaFechaPresentacion
     * @param nuevaHoraPresentacion
     */
    public void modificarFuncion(String funcionAModificar, LocalDate fechaPresentacion, LocalTime horaPresentacion, ObraTeatral obraTeatral, LocalDate nuevaFechaPresentacion, LocalTime nuevaHoraPresentacion) {
        Boolean esLaObra;
        for (FuncionTeatral funcionTeatral : this.funcionesTeatrales) {
            esLaObra = funcionTeatral.getObraTeatral().getNombre().equals(funcionAModificar) && funcionTeatral.getFechaPresentacion().equals(fechaPresentacion) && funcionTeatral.getHoraPresentacion().equals(horaPresentacion);
            if (esLaObra) {
                funcionTeatral.modificarFuncion(obraTeatral, nuevaFechaPresentacion, nuevaHoraPresentacion);
            }
        }
    }
    
    /**
     * Función que elimina una función existente dado el nombre de una función a eliminar.
     * @param funcionAEliminar 
     */
    public void eliminarFuncion(String funcionAEliminar) {
        Boolean esLaObra;
        for (FuncionTeatral funcionTeatral : this.funcionesTeatrales) {
            esLaObra = funcionTeatral.getObraTeatral().getNombre().equals(funcionAEliminar);
            if (esLaObra) {
                this.funcionesTeatrales.remove(funcionTeatral);
            }
        }
    }

    /**
     * Función que no retorna ningú valor, sirve para imprimir todas las funciones existentes, hasta el momento de su llamada, en consola.
     */
    public void imprimirFunciones() {
        for (FuncionTeatral funcionTeatral : this.funcionesTeatrales) {
            System.out.println(funcionTeatral.toString());
        }
    }

}

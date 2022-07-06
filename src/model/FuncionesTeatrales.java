/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author victo
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

    public void agregarFuncion(ObraTeatral obraTeatral, LocalDate fechaPresentacion, LocalTime horaPresentacion) {
        FuncionTeatral nuevaFuncionTeatral = new FuncionTeatral(obraTeatral, fechaPresentacion, horaPresentacion);
        this.funcionesTeatrales.add(nuevaFuncionTeatral);
    }

    /**
     * Lo que modifica esta funcion es la fecha o la hora de la función,
     * asegurándose que sea la función correcta
     *
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

    public void eliminarFuncion(String funcionAEliminar) {
        Boolean esLaObra;
        for (FuncionTeatral funcionTeatral : this.funcionesTeatrales) {
            esLaObra = funcionTeatral.getObraTeatral().getNombre().equals(funcionAEliminar);
            if (esLaObra) {
                this.funcionesTeatrales.remove(funcionTeatral);
            }
        }
    }

    public void imprimirFunciones() {
        for (FuncionTeatral funcionTeatral : this.funcionesTeatrales) {
            System.out.println(funcionTeatral.toString());
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.*;

/**
 *Clase FuncionTeatral, que representa cada función individual registrada en el teatro.
 * @author Víctor Flores Juárez
 */
public class FuncionTeatral {

    private ObraTeatral obraTeatral;
    private LocalDate fechaPresentacion;
    private LocalTime horaPresentacion;

    public FuncionTeatral() {

    }
    
    /**
     * Constructor de la clase FuncionTeatral, dicho constructor será llamado siempre a través de la clase FuncionesTeatrales
     * @param obraTeatral
     * @param fechaPresentacion
     * @param horaPresentacion 
     */
    public FuncionTeatral(ObraTeatral obraTeatral, LocalDate fechaPresentacion, LocalTime horaPresentacion) {
        this.obraTeatral = obraTeatral;
        this.fechaPresentacion = fechaPresentacion;
        this.horaPresentacion = horaPresentacion;
    }

    /**
     * Proceso para modificar una función específica, recibe como parámetro los nuevos datos que tendrá dicha función teatral. 
     * @param obraTeatral
     * @param fechaPresentacion
     * @param horaPresentacion 
     */
    public void modificarFuncion(ObraTeatral obraTeatral, LocalDate fechaPresentacion, LocalTime horaPresentacion) {
        this.obraTeatral = obraTeatral;
        this.fechaPresentacion = fechaPresentacion;
        this.horaPresentacion = horaPresentacion;
    }

    /**
     * Función que retorna un objeto de tipo ObraTeatral.
     * @return the obraTeatral
     */
    public ObraTeatral getObraTeatral() {
        return obraTeatral;
    }

    /**
     * Función que retorna un objeto de tipo LocalDate que contiene la fecha en la que dicha función fue registada/actualizada.
     * @return the fechaPresentacion
     */
    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }


    /**
     * Función que retorna un objeto de tipo LocalTime que contiene la hora en la que dicha función fue registada/actualizada.
     * @return the horaPresentacion
     */
    public LocalTime getHoraPresentacion() {
        return horaPresentacion;
    }

    
    /**
     * Función que imprime una función teatral específica.
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FuncionTeatral{");
        sb.append("obraTeatral=").append(obraTeatral);
        sb.append(", fechaPresentacion=").append(fechaPresentacion);
        sb.append(", horaPresentacion=").append(horaPresentacion);
        sb.append('}');
        return sb.toString();
    }

    

}

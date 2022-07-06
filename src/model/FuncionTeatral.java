/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.*;

/**
 *
 * @author victo
 */
public class FuncionTeatral {

    private ObraTeatral obraTeatral;
    private LocalDate fechaPresentacion;
    private LocalTime horaPresentacion;

    public FuncionTeatral() {

    }

    public FuncionTeatral(ObraTeatral obraTeatral, LocalDate fechaPresentacion, LocalTime horaPresentacion) {
        this.obraTeatral = obraTeatral;
        this.fechaPresentacion = fechaPresentacion;
        this.horaPresentacion = horaPresentacion;
    }

    public void modificarFuncion(ObraTeatral obraTeatral, LocalDate fechaPresentacion, LocalTime horaPresentacion) {
        this.obraTeatral = obraTeatral;
        this.fechaPresentacion = fechaPresentacion;
        this.horaPresentacion = horaPresentacion;
    }

    /**
     * @return the obraTeatral
     */
    public ObraTeatral getObraTeatral() {
        return obraTeatral;
    }

    /**
     * @param obraTeatral the obraTeatral to set
     */
    public void setObraTeatral(ObraTeatral obraTeatral) {
        this.obraTeatral = obraTeatral;
    }

    /**
     * @return the fechaPresentacion
     */
    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    /**
     * @param fechaPresentacion the fechaPresentacion to set
     */
    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    /**
     * @return the horaPresentacion
     */
    public LocalTime getHoraPresentacion() {
        return horaPresentacion;
    }

    /**
     * @param horaPresentacion the horaPresentacion to set
     */
    public void setHoraPresentacion(LocalTime horaPresentacion) {
        this.horaPresentacion = horaPresentacion;
    }

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

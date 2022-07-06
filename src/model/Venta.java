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
public class Venta {

    private String nombreDelTeatro = "Chachita";
    private int numVenta;
    private FuncionTeatral funcionTeatral;
    private LocalDate fechaVenta;
    private LocalTime horaVenta;
    private int numBoletosVendidos;
    private float totalDeVenta;
    private float montoEntregado;
    private float cambio;
    private ArrayList<Boleto> boletos;

    public Venta() {

    }

    public Venta(int numVenta, FuncionTeatral funcionTeatral, int numBoletosVendidos, float montoEntregado) {
        this.numVenta = numVenta;
        this.funcionTeatral = funcionTeatral;
        this.fechaVenta = LocalDate.now();
        this.horaVenta = LocalTime.now();
        this.numBoletosVendidos = numBoletosVendidos;
        this.montoEntregado = montoEntregado;
        this.boletos = inicializarBoletos(funcionTeatral, numBoletosVendidos);
        this.totalDeVenta = calcularTotalVenta(funcionTeatral, numBoletosVendidos);
        this.cambio = this.montoEntregado - this.totalDeVenta;
    }

    public float calcularTotalVenta(FuncionTeatral funcionTeatral, int numBoletosVendidos) {
        ObraTeatral obraTeatral = funcionTeatral.getObraTeatral();
        float precioDelBoleto = obraTeatral.getPrecioDelBoleto();
        return precioDelBoleto * numBoletosVendidos;
    }

    public ArrayList<Boleto> inicializarBoletos(FuncionTeatral funcionTeatral, int numBoletosVendidos) {
        ArrayList<Boleto> boletos = new ArrayList<Boleto>();
        for (int i = 0; i < numBoletosVendidos; i++) {
            boletos.add(i, new Boleto(funcionTeatral, i + 1));
        }
        return boletos;
    }

    /**
     * @return the nombreDelTeatro
     */
    public String getNombreDelTeatro() {
        return nombreDelTeatro;
    }

    /**
     * @param nombreDelTeatro the nombreDelTeatro to set
     */
    public void setNombreDelTeatro(String nombreDelTeatro) {
        this.nombreDelTeatro = nombreDelTeatro;
    }

    /**
     * @return the numVenta
     */
    public int getNumVenta() {
        return numVenta;
    }

    /**
     * @param numVenta the numVenta to set
     */
    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    /**
     * @return the funcionTeatral
     */
    public FuncionTeatral getFuncionTeatral() {
        return funcionTeatral;
    }

    /**
     * @param funcionTeatral the funcionTeatral to set
     */
    public void setFuncionTeatral(FuncionTeatral funcionTeatral) {
        this.funcionTeatral = funcionTeatral;
    }

    /**
     * @return the fechaVenta
     */
    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    /**
     * @param fechaVenta the fechaVenta to set
     */
    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     * @return the horaVenta
     */
    public LocalTime getHoraVenta() {
        return horaVenta;
    }

    /**
     * @param horaVenta the horaVenta to set
     */
    public void setHoraVenta(LocalTime horaVenta) {
        this.horaVenta = horaVenta;
    }

    /**
     * @return the numBoletosVendidos
     */
    public int getNumBoletosVendidos() {
        return numBoletosVendidos;
    }

    /**
     * @param numBoletosVendidos the numBoletosVendidos to set
     */
    public void setNumBoletosVendidos(int numBoletosVendidos) {
        this.numBoletosVendidos = numBoletosVendidos;
    }

    /**
     * @return the totalDeVenta
     */
    public float getTotalDeVenta() {
        return totalDeVenta;
    }

    /**
     * @param totalDeVenta the totalDeVenta to set
     */
    public void setTotalDeVenta(float totalDeVenta) {
        this.totalDeVenta = totalDeVenta;
    }

    /**
     * @return the montoEntregado
     */
    public float getMontoEntregado() {
        return montoEntregado;
    }

    /**
     * @param montoEntregado the montoEntregado to set
     */
    public void setMontoEntregado(float montoEntregado) {
        this.montoEntregado = montoEntregado;
    }

    /**
     * @return the cambio
     */
    public float getCambio() {
        return cambio;
    }

    /**
     * @param cambio the cambio to set
     */
    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    /**
     * @return the boletos
     */
    public ArrayList<Boleto> getBoletos() {
        return boletos;
    }

    /**
     * @param boletos the boletos to set
     */
    public void setBoletos(ArrayList<Boleto> boletos) {
        this.boletos = boletos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta{");
        sb.append("nombreDelTeatro=").append(nombreDelTeatro);
        sb.append(", numVenta=").append(numVenta);
        sb.append(", funcionTeatral=").append(funcionTeatral);
        sb.append(", fechaVenta=").append(fechaVenta);
        sb.append(", horaVenta=").append(horaVenta);
        sb.append(", numBoletosVendidos=").append(numBoletosVendidos);
        sb.append(", totalDeVenta=").append(totalDeVenta);
        sb.append(", montoEntregado=").append(montoEntregado);
        sb.append(", cambio=").append(cambio);
        sb.append(", boletos=").append(boletos);
        sb.append('}');
        return sb.toString();
    }

}

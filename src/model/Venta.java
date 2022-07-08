/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *Clase Venta, que representa la entidad de cada venta única del teatro.
 * @author Víctor Flores Juárez
 */
public class Venta {

    private final String nombreDelTeatro = "Chachita";
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

    /**
     * Constructor para la clase Venta que instancia una venta realizada.
     * @param numVenta
     * @param funcionTeatral
     * @param numBoletosVendidos
     * @param montoEntregado 
     */
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

    /**
     * Método que calcula el total de la venta.
     * @param funcionTeatral
     * @param numBoletosVendidos
     * @return 
     */
    public float calcularTotalVenta(FuncionTeatral funcionTeatral, int numBoletosVendidos) {
        ObraTeatral obraTeatral = funcionTeatral.getObraTeatral();
        float precioDelBoleto = obraTeatral.getPrecioDelBoleto();
        return precioDelBoleto * numBoletosVendidos;
    }

    /**
     * Método que inicializa los boletos específicos de una venta, para asignarles numDeBoleto y la función teatral a la que hacen referencia
     * @param funcionTeatral
     * @param numBoletosVendidos
     * @return 
     */
    public ArrayList<Boleto> inicializarBoletos(FuncionTeatral funcionTeatral, int numBoletosVendidos) {
        ArrayList<Boleto> boletos = new ArrayList<Boleto>();
        for (int i = 0; i < numBoletosVendidos; i++) {
            boletos.add(i, new Boleto(funcionTeatral, i + 1));
        }
        return boletos;
    }

    /**
     * Función que retorna un objeto String con el nombre del teatro.
     * @return the nombreDelTeatro
     */
    public String getNombreDelTeatro() {
        return nombreDelTeatro;
    }


    /**
     * Función que retorna un entero que representa el número de la venta de todo el teatro
     * @return the numVenta
     */
    public int getNumVenta() {
        return numVenta;
    }


    /**
     * Función que retorna un objeto de tipo FuncionTeatral que representa la obra para la que se hizo la compra
     * @return the funcionTeatral
     */
    public FuncionTeatral getFuncionTeatral() {
        return funcionTeatral;
    }


    /**
     * Función que retorna un objeto de tipo LocalDate que representa la fecha en la que se realizó la compra.
     * @return the fechaVenta
     */
    public LocalDate getFechaVenta() {
        return fechaVenta;
    }


    /**
     * Función que retorna un objeto de tipo LocalTime que representa la hora a la que se realizó la compra.
     * @return the horaVenta
     */
    public LocalTime getHoraVenta() {
        return horaVenta;
    }


    /**
     * Función que retorna un entero que representa la cantidad de boletos que se vendieron en una sola venta
     * @return the numBoletosVendidos
     */
    public int getNumBoletosVendidos() {
        return numBoletosVendidos;
    }


    /**
     * Función que retorna un flotante que representa el total de la venta.
     * @return the totalDeVenta
     */
    public float getTotalDeVenta() {
        return totalDeVenta;
    }


    /**
     * Función que retorna un flotante que representa el monto entregado en una venta.
     * @return the montoEntregado
     */
    public float getMontoEntregado() {
        return montoEntregado;
    }


    /**
     * Función que retornar un flotante que representa el cambio de la venta.
     * @return the cambio
     */
    public float getCambio() {
        return cambio;
    }


    /**
     * Función que retorna una lista de boletos con todos los boletos contenidos en una sola venta
     * @return the boletos
     */
    public ArrayList<Boleto> getBoletos() {
        return boletos;
    }


    /**
     * Función que escribe en consola todos los datos de una venta.
     * @return 
     */
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

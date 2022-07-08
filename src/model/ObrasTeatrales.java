/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *Clase ObrasTeatrales, que representa la entidad de TODAS las obras teatrales registradas en el teatro
 * @author Víctor Flores Juárez
 */
public class ObrasTeatrales {

    private ArrayList<ObraTeatral> obrasTeatrales;

    /**
     * Constructor de la clase que crea la instancia de la misma.
     */
    public ObrasTeatrales() {
        this.obrasTeatrales = new ArrayList<ObraTeatral>();
    }

    /**
     * Función que retorna todas las obras teatreales contenidas en la instancia
     * @return obrasTeatrales
     */
    public ArrayList<ObraTeatral> getObrasTeatrales() {
        return this.obrasTeatrales;
    }

    /**
     * Función que retorna un objeto de tipo ObraTeatral que representa una obra específica que está siendo búscada
     * @param nombreDeLaObra
     * @return 
     */
    public ObraTeatral getObraTeatral(String nombreDeLaObra) {
        Boolean esLaObra;
        for (ObraTeatral obraTeatral : this.obrasTeatrales) {
            esLaObra = obraTeatral.getNombre().equals(nombreDeLaObra);
            if (esLaObra) {
                return (ObraTeatral) obraTeatral;
            }
        }
        return null;
    }

    /**
     * Método que agrega una nueva obra a la lista de obras. Recibe como parámetros todos los parámetros necesarios para instanciar un objeto de tipo ObraTeatral
     * @param nombre
     * @param genero
     * @param resumen
     * @param duracionEnMin
     * @param primerActorPrincipal
     * @param segundoActorPrincipal
     * @param precioDelBoleto 
     */
    public void agregarObra(String nombre, String genero, String resumen, int duracionEnMin, Usuario primerActorPrincipal, Usuario segundoActorPrincipal, float precioDelBoleto) {
        ObraTeatral nuevaObraTeatral = new ObraTeatral(nombre, genero, resumen, duracionEnMin, primerActorPrincipal, segundoActorPrincipal, precioDelBoleto);
        this.obrasTeatrales.add(nuevaObraTeatral);
    }

    /**
     * Función que modifica una obra teatral existente recibiendo como parámetros los nuevos valores para los atributos de la obra teatral así como el nombre de la obra de la cual se desea modificar sus valores.
     * @param obraAModificar
     * @param nombre
     * @param genero
     * @param resumen
     * @param duracionEnMin
     * @param primerActorPrincipal
     * @param segundoActorPrincipal
     * @param precioDelBoleto 
     */
    public void modificarObra(String obraAModificar, String nombre, String genero, String resumen, int duracionEnMin, Usuario primerActorPrincipal, Usuario segundoActorPrincipal, float precioDelBoleto) {
        Boolean esLaObra;
        for (ObraTeatral obraTeatral : this.obrasTeatrales) {
            esLaObra = obraTeatral.getNombre().equals(obraAModificar);
            if (esLaObra) {
                obraTeatral.modificarObra(nombre, genero, resumen, duracionEnMin, primerActorPrincipal, segundoActorPrincipal, precioDelBoleto);
            }
        }
    }

    /**
     * Función que elimina una obra teatral existente en la lista de obras teatrales recibiendo como parámetro la obra que se desea eliminar
     * @param obraAEliminar 
     */
    public void eliminarObra(String obraAEliminar) {
        Boolean esLaObra;
        for (ObraTeatral obraTeatral : this.obrasTeatrales) {
            esLaObra = obraTeatral.getNombre().equals(obraAEliminar);
            if (esLaObra) {
                this.obrasTeatrales.remove(obraTeatral);
            }
        }
    }

    /**
     * Función para imprimir todas las obras teatrales.
     */
    public void imprimirObrasTeatrales() {
        for (ObraTeatral obraTeatral : this.obrasTeatrales) {
            System.out.println(obraTeatral.toString());
        }
    }

}

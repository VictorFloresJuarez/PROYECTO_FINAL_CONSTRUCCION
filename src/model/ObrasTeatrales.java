/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class ObrasTeatrales {

    private ArrayList<ObraTeatral> obrasTeatrales;

    public ObrasTeatrales() {
        this.obrasTeatrales = new ArrayList<ObraTeatral>();
    }

    public ArrayList<ObraTeatral> getObrasTeatrales() {
        return this.obrasTeatrales;
    }

    public void setObrasTeatrales(ArrayList<ObraTeatral> obrasTeatrales) {
        this.obrasTeatrales = obrasTeatrales;
    }

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

    public void agregarObra(String nombre, String genero, String resumen, int duracionEnMin, Usuario primerActorPrincipal, Usuario segundoActorPrincipal, float precioDelBoleto) {
        ObraTeatral nuevaObraTeatral = new ObraTeatral(nombre, genero, resumen, duracionEnMin, primerActorPrincipal, segundoActorPrincipal, precioDelBoleto);
        this.obrasTeatrales.add(nuevaObraTeatral);
    }

    public void modificarObra(String obraAModificar, String nombre, String genero, String resumen, int duracionEnMin, Usuario primerActorPrincipal, Usuario segundoActorPrincipal, float precioDelBoleto) {
        Boolean esLaObra;
        for (ObraTeatral obraTeatral : this.obrasTeatrales) {
            esLaObra = obraTeatral.getNombre().equals(obraAModificar);
            if (esLaObra) {
                obraTeatral.modificarObra(nombre, genero, resumen, duracionEnMin, primerActorPrincipal, segundoActorPrincipal, precioDelBoleto);
            }
        }
    }

    public void eliminarObra(String obraAEliminar) {
        Boolean esLaObra;
        for (ObraTeatral obraTeatral : this.obrasTeatrales) {
            esLaObra = obraTeatral.getNombre().equals(obraAEliminar);
            if (esLaObra) {
                this.obrasTeatrales.remove(obraTeatral);
            }
        }
    }

    public void imprimirObrasTeatrales() {
        for (ObraTeatral obraTeatral : this.obrasTeatrales) {
            System.out.println(obraTeatral.toString());
        }
    }

}

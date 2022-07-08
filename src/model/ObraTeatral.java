/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Clase ObraTeatral, que representa la entidad de cada obra teatral registrada en el teatro.
 * @author Víctor Flores Juárez
 */
public class ObraTeatral {
    
    private String nombre;
    private String genero;
    private String resumen;
    private int duracionEnMin;
    private Usuario primerActorPrincipal;
    private Usuario segundoActorPrincipal;
    private float precioDelBoleto;
    
    public ObraTeatral() {
        
    }
    
    /**
     * Constructor de la clase ObraTeatral. Instancia un objeto de dicha clase recibiendo como parámetro TODOS los argumentos de la clase.
     * @param nombre
     * @param genero
     * @param resumen
     * @param duracionEnMin
     * @param primerActorPrincipal
     * @param segundoActorPrincipal
     * @param precioDelBoleto 
     */
    public ObraTeatral(String nombre, String genero, String resumen, int duracionEnMin, Usuario primerActorPrincipal, Usuario segundoActorPrincipal, float precioDelBoleto) {
        this.nombre = nombre;
        this.genero = genero;
        this.resumen = resumen;
        this.duracionEnMin = duracionEnMin;
        this.primerActorPrincipal = primerActorPrincipal;
        this.segundoActorPrincipal = segundoActorPrincipal;
        this.precioDelBoleto = precioDelBoleto;
    }
    
    /**
     * Función que modifica los atributos de una instancia de la clase ObraTeatral. Es el método que debe utilizarse para modificar algún parámetro de la clase.
     * @param nuevoNombre
     * @param nuevoGenero
     * @param nuevoResumen
     * @param nuevaDuracionEnMin
     * @param nuevoPrimerActorPrincipal
     * @param nuevoSegundoActorPrincipal
     * @param nuevoPrecioDelBoleto 
     */
    public void modificarObra(String nuevoNombre, String nuevoGenero, String nuevoResumen, int nuevaDuracionEnMin, Usuario nuevoPrimerActorPrincipal, Usuario nuevoSegundoActorPrincipal, float nuevoPrecioDelBoleto) {
        this.nombre = nuevoNombre;
        this.genero = nuevoGenero;
        this.resumen = nuevoResumen;
        this.duracionEnMin = nuevaDuracionEnMin;
        this.primerActorPrincipal = nuevoPrimerActorPrincipal;
        this.segundoActorPrincipal = nuevoSegundoActorPrincipal;
        this.precioDelBoleto = nuevoPrecioDelBoleto;
    }

    /**
     * Función que retorna un objeto de tipo String que contiene el nombre de la obra.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Función que devuelve un objeto String que contiene el género de la obra teatral
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }


    /**
     * Función que devuelve un objeto String que contiene el resumen de la obra teatral.
     * @return the resumen
     */
    public String getResumen() {
        return resumen;
    }


    /**
     * Función que devuelve un entero que representa la duración de la obra en minutos.
     * @return the duracionEnMin
     */
    public int getDuracionEnMin() {
        return duracionEnMin;
    }


    /**
     * Función que devuelve un objeto de tipo Usuario que representa al primer actor principal.
     * @return the primerActorPrincipal
     */
    public Usuario getPrimerActorPrincipal() {
        return primerActorPrincipal;
    }



    /**
     * Función que devuelve un objeto de tipo Usuario que representa un al segundo actor principal.
     * @return the segundoActorPrincipal
     */
    public Usuario getSegundoActorPrincipal() {
        return segundoActorPrincipal;
    }


    /**
     * Función que devuelve un flotante que representa el precio del boleto.
     * @return the precioDelBoleto
     */
    public float getPrecioDelBoleto() {
        return precioDelBoleto;
    }

    /**
     * Función que imprime los atributos de una ObraTeatral en consola.
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObraTeatral{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", resumen=").append(resumen);
        sb.append(", duracionEnMin=").append(duracionEnMin);
        sb.append(", primerActorPrincipal=").append(primerActorPrincipal);
        sb.append(", segundoActorPrincipal=").append(segundoActorPrincipal);
        sb.append(", precioDelBoleto=").append(precioDelBoleto);
        sb.append('}');
        return sb.toString();
    }
    
    /**
     * Función que devuelve un String que contiene los atributos más importantes de la obra.
     * @return 
     */
    public String getTextoObraTeatral() {
        String textoObraTeatral = "Nombre:      " + this.nombre + ",        genero:     " + this.genero + ",   duracion en min     " + String.valueOf(this.duracionEnMin) + ",     precio del boleto:      " + String.valueOf(this.precioDelBoleto);
        return textoObraTeatral;
    }
    
}

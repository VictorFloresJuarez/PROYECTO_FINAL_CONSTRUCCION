/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author victo
 */
public class ObraTeatral {

    private String nombre;
    private String genero;
    private String resumen;
    private int duracionEnMin;
    private Usuario primerActorPrincipal;
    private Usuario segundoActorPrincipal;
    private float precioDelBoleto;
    
    public ObraTeatral(){
        
    }
    
    public ObraTeatral(String nombre, String genero, String resumen, int duracionEnMin, Usuario primerActorPrincipal, Usuario segundoActorPrincipal, float precioDelBoleto){
        this.nombre = nombre;
        this.genero = genero;
        this.resumen = resumen;
        this.duracionEnMin = duracionEnMin;
        this.primerActorPrincipal = primerActorPrincipal;
        this.segundoActorPrincipal = segundoActorPrincipal;
        this.precioDelBoleto = precioDelBoleto;
    }
    
    public void modificarObra(String nuevoNombre, String nuevoGenero, String nuevoResumen, int nuevaDuracionEnMin, Usuario nuevoPrimerActorPrincipal, Usuario nuevoSegundoActorPrincipal, float nuevoPrecioDelBoleto){
        this.nombre = nuevoNombre;
        this.genero = nuevoGenero;
        this.resumen = nuevoResumen;
        this.duracionEnMin = nuevaDuracionEnMin;
        this.primerActorPrincipal = nuevoPrimerActorPrincipal;
        this.segundoActorPrincipal = nuevoSegundoActorPrincipal;
        this.precioDelBoleto = nuevoPrecioDelBoleto;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the resumen
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * @param resumen the resumen to set
     */
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    /**
     * @return the duracionEnMin
     */
    public int getDuracionEnMin() {
        return duracionEnMin;
    }

    /**
     * @param duracionEnMin the duracionEnMin to set
     */
    public void setDuracionEnMin(int duracionEnMin) {
        this.duracionEnMin = duracionEnMin;
    }

    /**
     * @return the primerActorPrincipal
     */
    public Usuario getPrimerActorPrincipal() {
        return primerActorPrincipal;
    }

    /**
     * @param primerActorPrincipal the primerActorPrincipal to set
     */
    public void setPrimerActorPrincipal(Usuario primerActorPrincipal) {
        this.primerActorPrincipal = primerActorPrincipal;
    }

    /**
     * @return the segundoActorPrincipal
     */
    public Usuario getSegundoActorPrincipal() {
        return segundoActorPrincipal;
    }

    /**
     * @param segundoActorPrincipal the segundoActorPrincipal to set
     */
    public void setSegundoActorPrincipal(Usuario segundoActorPrincipal) {
        this.segundoActorPrincipal = segundoActorPrincipal;
    }

    /**
     * @return the precioDelBoleto
     */
    public float getPrecioDelBoleto() {
        return precioDelBoleto;
    }

    /**
     * @param precioDelBoleto the precioDelBoleto to set
     */
    public void setPrecioDelBoleto(float precioDelBoleto) {
        this.precioDelBoleto = precioDelBoleto;
    }

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

    

}

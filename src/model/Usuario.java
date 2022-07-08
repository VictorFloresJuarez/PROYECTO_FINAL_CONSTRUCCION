/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author victo
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String CURP;
    private String nombreDeUsuario;
    private String contrasena;

    public Usuario() {

    }

    public Usuario(String nombre, String apellido, String CURP, String nombreDeUsuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CURP = CURP;
        this.nombreDeUsuario = nombreDeUsuario;
        this.contrasena = contrasena;
    }

    public void modificarParametros(String nombre, String apellido, String CURP, String nombreDeUsuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CURP = CURP;
        this.nombreDeUsuario = nombreDeUsuario;
        this.contrasena = contrasena;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the CURP
     */
    public String getCURP() {
        return CURP;
    }

    /**
     * @param CURP the CURP to set
     */
    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    /**
     * @return the nombreDeUsuario
     */
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    /**
     * @param nombreDeUsuario the nombreDeUsuario to set
     */
    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", CURP=").append(CURP);
        sb.append(", nombreDeUsuario=").append(nombreDeUsuario);
        sb.append(", contrasena=").append(contrasena);
        sb.append('}');
        return sb.toString();
    }
    
    public String getTexto(){
        String textoDevolver = "Nombre de usuario:       " + this.nombreDeUsuario + ",      nombre:         " + this.nombre + ",        apellido        " + this.apellido + ",          CURP:           " + this.CURP ;
        return textoDevolver;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Clase usuario, que representa a la entidad usuario.
 * @author Victor Flores Juarez
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String CURP;
    private String nombreDeUsuario;
    private String contrasena;

    public Usuario() {

    }

    /**
     * Constructor de las instancias de la clase Usuario, recibe como parámetros todos valores para inicialziar todos los atributos de la clase
     * @param nombre
     * @param apellido
     * @param CURP
     * @param nombreDeUsuario
     * @param contrasena 
     */
    public Usuario(String nombre, String apellido, String CURP, String nombreDeUsuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CURP = CURP;
        this.nombreDeUsuario = nombreDeUsuario;
        this.contrasena = contrasena;
    }

    /**
     * Método para modificar los parámetros de un objeto Usuario, recibiendo como parámetro los nuevos valores
     * @param nombre
     * @param apellido
     * @param CURP
     * @param nombreDeUsuario
     * @param contrasena 
     */
    public void modificarParametros(String nombre, String apellido, String CURP, String nombreDeUsuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CURP = CURP;
        this.nombreDeUsuario = nombreDeUsuario;
        this.contrasena = contrasena;
    }

    /**
     * Función que retorna un String que representa el nombre del usuario.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     *  Función que retorna un String que representa el apellido del usuario.
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }


    /**
     *  Función que retorna un String que representa la CURP del usuario.
     * @return the CURP
     */
    public String getCURP() {
        return CURP;
    }


    /**
     *  Función que retorna un String que representa el nombre de usuario del usuario.
     * @return the nombreDeUsuario
     */
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }


    /**
     *  Función que retorna un String que representa la contraseña del usuario.
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }
    
    /**
     * Método que imprime los atributos del usuario en consola.
     * @return 
     */
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
    
    /**
     * Función que retorna un objeto de tipo String que contiene un los atributos más importantes de la instancia.
     * @return textoDevolver
     */
    public String getTexto(){
        String textoDevolver = "Nombre de usuario:       " + this.nombreDeUsuario + ",      nombre:         " + this.nombre + ",        apellido        " + this.apellido + ",          CURP:           " + this.CURP ;
        return textoDevolver;
    }

}

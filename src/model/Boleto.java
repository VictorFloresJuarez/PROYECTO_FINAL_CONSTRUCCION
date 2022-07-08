/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Clase Boleto, que representa la entidad de un boleto, el cual únicamente es creado durante el proceso de compra.
 * @author Víctor Flores Juárez
 */
public class Boleto {

    private FuncionTeatral funcionTeatral;
    private int numBoleto;

    /**
     * Constructor de la clase Boleto, instancia un nuevo boleto.
     * @param funcionTeatral
     * @param numBoleto 
     */
    public Boleto(FuncionTeatral funcionTeatral, int numBoleto) {
        this.funcionTeatral = funcionTeatral;
        this.numBoleto = numBoleto;
    }

    /**
     * Función que devuelve un objeto de tipo FuncionTeatral. Básicamente es la función para la que ese boleto se comprón
     * @return the funcionTeatral
     */
    public FuncionTeatral getFuncionTeatral() {
        return funcionTeatral;
    }

    /**
     * Función que devuelve un objeto de tipo entero. Es el número del boleto de la compra total. Ejemplo: si se compran 3 boletos entonces los 3 objetos boleto tendrán estos valores para este atributo: [1, 2, 3].
     * @return the numBoleto
     */
    public int getNumBoleto() {
        return numBoleto;
    }


    /**
     * Función para imprimir un boleto específico de una compra de boletos.
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Boleto{");
        sb.append("funcionTeatral=").append(funcionTeatral);
        sb.append(", numBoleto=").append(numBoleto);
        sb.append('}');
        return sb.toString();
    }

    

}

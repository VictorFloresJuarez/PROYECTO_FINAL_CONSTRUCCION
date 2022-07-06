/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author victo
 */
public class Boleto {

    private FuncionTeatral funcionTeatral;
    private int numBoleto;

    public Boleto(FuncionTeatral funcionTeatral, int numBoleto) {
        this.funcionTeatral = funcionTeatral;
        this.numBoleto = numBoleto;
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
     * @return the numBoleto
     */
    public int getNumBoleto() {
        return numBoleto;
    }

    /**
     * @param numBoleto the numBoleto to set
     */
    public void setNumBoleto(int numBoleto) {
        this.numBoleto = numBoleto;
    }

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

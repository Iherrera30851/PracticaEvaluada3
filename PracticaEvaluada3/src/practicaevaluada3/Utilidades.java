/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author isaacherrera
 */
public class Utilidades {
//se crean las variables
    private int precioBruto;
    private int gananciaEsperada;
//constructor
    public Utilidades(int precioBruto, int gananciaEsperada) {
        this.precioBruto = precioBruto;
        this.gananciaEsperada = gananciaEsperada;
    }
//setter y getter 
    public int getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(int precioBruto) {
        this.precioBruto = precioBruto;
    }

    public int getGananciaEsperada() {
        return gananciaEsperada;
    }

    public void setGananciaEsperada(int gananciaEsperada) {
        this.gananciaEsperada = gananciaEsperada;
    }

    @Override
    public String toString() {
        return "Utilidades{" + "precioBruto=" + precioBruto + ", gananciaEsperada=" + gananciaEsperada + '}';
    }
    
  }

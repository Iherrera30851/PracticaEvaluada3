/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author isaacherrera
 */
public class Inventario {
    //Se crean las variab;es
    private String nombreSuper;
    private String codigoSuper;
    
//Constructor 
    
    public Inventario(String nombreSuper, String codigoSuper) {
        this.nombreSuper = nombreSuper;
        this.codigoSuper = codigoSuper;
    }
//setter y getter
    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public String getCodigoSuper() {
        return codigoSuper;
    }

    public void setCodigoSuper(String codigoSuper) {
        this.codigoSuper = codigoSuper;
    }

    @Override
    public String toString() {
        return "Inventario{" + "nombreSuper=" + nombreSuper + ", codigoSuper=" + codigoSuper + '}';
    }
    
}

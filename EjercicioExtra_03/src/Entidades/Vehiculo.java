/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
//modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).

public class Vehiculo {
        private String marcaV;
        private String modeloV;
        private int anioV;
        private int numMotorV;
        private int chasisV;
        private String colorV;
        private String tipoV;

    public Vehiculo() {
    }

    public Vehiculo(String marcaV, String modeloV, int anioV, int numMotorV, int chasisV, String colorV, String tipoV) {
        this.marcaV = marcaV;
        this.modeloV = modeloV;
        this.anioV = anioV;
        this.numMotorV = numMotorV;
        this.chasisV = chasisV;
        this.colorV = colorV;
        this.tipoV = tipoV;
    }

    public String getMarcaV() {
        return marcaV;
    }

    public void setMarcaV(String marcaV) {
        this.marcaV = marcaV;
    }

    public String getModeloV() {
        return modeloV;
    }

    public void setModeloV(String modeloV) {
        this.modeloV = modeloV;
    }

    public int getAnioV() {
        return anioV;
    }

    public void setAnioV(int anioV) {
        this.anioV = anioV;
    }

    public int getNumMotorV() {
        return numMotorV;
    }

    public void setNumMotorV(int numMotorV) {
        this.numMotorV = numMotorV;
    }

    public int getChasisV() {
        return chasisV;
    }

    public void setChasisV(int chasisV) {
        this.chasisV = chasisV;
    }

    public String getColorV() {
        return colorV;
    }

    public void setColorV(String colorV) {
        this.colorV = colorV;
    }

    public String getTipoV() {
        return tipoV;
    }

    public void setTipoV(String tipoV) {
        this.tipoV = tipoV;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marcaV=" + marcaV + 
                ", modeloV=" + modeloV + 
                ", anioV=" + anioV + 
                ", numMotorV=" + numMotorV + 
                ", chasisV=" + chasisV + 
                ", colorV=" + colorV + 
                ", tipoV=" + tipoV + '}'+'\n';
    }
        
        
    
}

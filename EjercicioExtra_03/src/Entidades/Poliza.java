/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
//vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
//póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
//asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
//terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
//relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
//muchos a uno o de muchos a muchos.
public class Poliza {

    private Vehiculo vehiculoPoliza;
    private Cliente clientePoliza;
    private int numPoliza;
    private String fechaIni;
    private String fechaFin;
    private int cantCuotasPoliza;
    private String formaPagoPoliza;
    private int montoAsegPoliza;
    private boolean granizoPoliza;
    private int montoGranizoPoliza;
    private String coberturaPoliza;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculoPoliza, Cliente clientePoliza, int numPoliza, String fechaIni, String fechaFin, int cantCuotasPoliza, String formaPagoPoliza, int montoAsegPoliza, boolean granizoPoliza, int montoGranizoPoliza, String coberturaPoliza) {
        this.vehiculoPoliza = vehiculoPoliza;
        this.clientePoliza = clientePoliza;
        this.numPoliza = numPoliza;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cantCuotasPoliza = cantCuotasPoliza;
        this.formaPagoPoliza = formaPagoPoliza;
        this.montoAsegPoliza = montoAsegPoliza;
        this.granizoPoliza = granizoPoliza;
        this.montoGranizoPoliza = montoGranizoPoliza;
        this.coberturaPoliza = coberturaPoliza;
    }

    public Vehiculo getVehiculoPoliza() {
        return vehiculoPoliza;
    }

    public void setVehiculoPoliza(Vehiculo vehiculoPoliza) {
        this.vehiculoPoliza = vehiculoPoliza;
    }

    public Cliente getClientePoliza() {
        return clientePoliza;
    }

    public void setClientePoliza(Cliente clientePoliza) {
        this.clientePoliza = clientePoliza;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantCuotasPoliza() {
        return cantCuotasPoliza;
    }

    public void setCantCuotasPoliza(int cantCuotasPoliza) {
        this.cantCuotasPoliza = cantCuotasPoliza;
    }

    public String getFormaPagoPoliza() {
        return formaPagoPoliza;
    }

    public void setFormaPagoPoliza(String formaPagoPoliza) {
        this.formaPagoPoliza = formaPagoPoliza;
    }

    public int getMontoAsegPoliza() {
        return montoAsegPoliza;
    }

    public void setMontoAsegPoliza(int montoAsegPoliza) {
        this.montoAsegPoliza = montoAsegPoliza;
    }

    public boolean isGranizoPoliza() {
        return granizoPoliza;
    }

    public void setGranizoPoliza(boolean granizoPoliza) {
        this.granizoPoliza = granizoPoliza;
    }

    public int getMontoGranizoPoliza() {
        return montoGranizoPoliza;
    }

    public void setMontoGranizoPoliza(int montoGranizoPoliza) {
        this.montoGranizoPoliza = montoGranizoPoliza;
    }

    public String getCoberturaPoliza() {
        return coberturaPoliza;
    }

    public void setCoberturaPoliza(String coberturaPoliza) {
        this.coberturaPoliza = coberturaPoliza;
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculoPoliza=" + vehiculoPoliza + 
                ", clientePoliza=" + clientePoliza + 
                ", numPoliza=" + numPoliza + 
                ", fechaIni=" + fechaIni + 
                ", fechaFin=" + fechaFin + 
                ", cantCuotasPoliza=" + cantCuotasPoliza + 
                ", formaPagoPoliza=" + formaPagoPoliza + 
                ", montoAsegPoliza=" + montoAsegPoliza + 
                ", granizoPoliza=" + granizoPoliza + 
                ", montoGranizoPoliza=" + montoGranizoPoliza + 
                ", coberturaPoliza=" + coberturaPoliza + '}'+'\n';
    }
    
    

}

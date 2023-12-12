/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
//Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
//cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
//etc.).

public class Cuotas {
    private int numCuota;
    private int montoTotalCuota;
    private boolean cuotaPagada;
    private String fechaVenCuota;
    private String formaPagoCuota;

    public Cuotas() {
    }

    public Cuotas(int numCuota, int montoTotalCuota, boolean cuotaPagada, String fechaVenCuota, String formaPagoCuota) {
        this.numCuota = numCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.cuotaPagada = cuotaPagada;
        this.fechaVenCuota = fechaVenCuota;
        this.formaPagoCuota = formaPagoCuota;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public int getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(int montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isCuotaPagada() {
        return cuotaPagada;
    }

    public void setCuotaPagada(boolean cuotaPagada) {
        this.cuotaPagada = cuotaPagada;
    }

    public String getFechaVenCuota() {
        return fechaVenCuota;
    }

    public void setFechaVenCuota(String fechaVenCuota) {
        this.fechaVenCuota = fechaVenCuota;
    }

    public String getFormaPagoCuota() {
        return formaPagoCuota;
    }

    public void setFormaPagoCuota(String formaPagoCuota) {
        this.formaPagoCuota = formaPagoCuota;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "numCuota=" + numCuota + 
                ", montoTotalCuota=" + montoTotalCuota + 
                ", cuotaPagada=" + cuotaPagada + 
                ", fechaVenCuota=" + fechaVenCuota + 
                ", formaPagoCuota=" + formaPagoCuota + '}'+'\n';
    }
    
    
}

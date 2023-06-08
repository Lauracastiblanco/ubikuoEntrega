/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author diego
 */
public class consultcotizacionVO {
    
    int Ncotizacion,Dcumentocli;
    double Ctotal;
    String cliente,usuario,estado ,fecha;

    public consultcotizacionVO() {
    }

    public consultcotizacionVO(int Ncotizacion, int Dcumentocli, double Ctotal, String cliente, String usuario, String estado, String fecha) {
        this.Ncotizacion = Ncotizacion;
        this.Dcumentocli = Dcumentocli;
        this.Ctotal = Ctotal;
        this.cliente = cliente;
        this.usuario = usuario;
        this.estado = estado;
        this.fecha = fecha;
    }

    public int getNcotizacion() {
        return Ncotizacion;
    }

    public void setNcotizacion(int Ncotizacion) {
        this.Ncotizacion = Ncotizacion;
    }

    public int getDcumentocli() {
        return Dcumentocli;
    }

    public void setDcumentocli(int Dcumentocli) {
        this.Dcumentocli = Dcumentocli;
    }

    public double getCtotal() {
        return Ctotal;
    }

    public void setCtotal(double Ctotal) {
        this.Ctotal = Ctotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class factura_tipo_pago {
    
    private int id_factura;
    private int id_tipo_pago;

    public factura_tipo_pago(int id_factura, int id_tipo_pago) {
        this.id_factura = id_factura;
        this.id_tipo_pago = id_tipo_pago;
    }

    public factura_tipo_pago() {
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(int id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }
   
    
}

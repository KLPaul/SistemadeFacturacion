/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class factura {
    
    private int id_factura;
    private String ruc;
    private int id_persona;
    private String fecha;
    private int id_tipo_pago;
    private double descuento;
    private double total;
    
    private ArrayList<factura_tipo_pago> listafacTipoPago;
    private ArrayList<factura_persona> listafacturapersonas;
    private ArrayList<factura_itemfactura> listafacturaitemf;
    
    public factura() {
    }

     public factura(int id_factura, String ruc, int id_persona, String fecha, int id_tipo_pago, double descuento, double total) {
        this.id_factura = id_factura;
        this.ruc = ruc;
        this.id_persona = id_persona;
        this.fecha = fecha;
        this.id_tipo_pago = id_tipo_pago;
        this.descuento = descuento;
        this.total = total;
    }
    
    
    public factura(int id_factura, String ruc, int id_persona, String fecha, int id_tipo_pago, double descuento, double total, ArrayList<factura_tipo_pago> listafacTipoPago, ArrayList<factura_persona> listafacturapersonas, ArrayList<factura_itemfactura> listafacturaitemf) {
        this.id_factura = id_factura;
        this.ruc = ruc;
        this.id_persona = id_persona;
        this.fecha = fecha;
        this.id_tipo_pago = id_tipo_pago;
        this.descuento = descuento;
        this.total = total;
        this.listafacTipoPago = listafacTipoPago;
        this.listafacturapersonas = listafacturapersonas;
        this.listafacturaitemf = listafacturaitemf;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(int id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<factura_tipo_pago> getListafacTipoPago() {
        return listafacTipoPago;
    }

    public void setListafacTipoPago(ArrayList<factura_tipo_pago> listafacTipoPago) {
        this.listafacTipoPago = listafacTipoPago;
    }
    
       public ArrayList<factura_persona> getListafacturapersonas() {
        return listafacturapersonas;
    }

    public void setListalistafacturapersonas(ArrayList<factura_persona> listafacturapersonas) {
        this.listafacturapersonas = listafacturapersonas;
    }
    
     public ArrayList<factura_itemfactura> getListafacturaitem() {
        return listafacturaitemf;
    }

    public void setListalistafacturaItem(ArrayList<factura_itemfactura> listafacturaitemf) {
        this.listafacturaitemf = listafacturaitemf;
    }
    
    
}

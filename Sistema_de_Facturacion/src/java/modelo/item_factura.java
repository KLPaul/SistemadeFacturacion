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
public class item_factura {
 
    private int id_item_factura;
    private int id_factura;
    private int id_producto;
    private int cantidad; 
    private Double precio;
    private Double subtotal;

    private ArrayList<factura_itemfactura>listaitemfactura;
    private ArrayList<producto_itemfactura>listaitemproducto;
    
    public item_factura() {
        listaitemfactura = new ArrayList<>();
        listaitemproducto = new ArrayList<>();
    }
    
    
    public item_factura(int id_item_factura, int id_factura, int id_producto, int cantidad, Double precio, Double subtotal) {
        this.id_item_factura = id_item_factura;
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }


    public item_factura(int id_item_factura, int id_factura, int id_producto, int cantidad, Double precio, Double subtotal, ArrayList<factura_itemfactura>listaitemfactura, ArrayList<producto_itemfactura>listaitemproducto) {
        this.id_item_factura = id_item_factura;
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.listaitemfactura=listaitemfactura;
        this.listaitemproducto=listaitemproducto;
    }

    public int getId_item_factura() {
        return id_item_factura;
    }

    public void setId_item_factura(int id_item_factura) {
        this.id_item_factura = id_item_factura;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    
      public ArrayList<factura_itemfactura> getListaFacturaItem() {
        return listaitemfactura;
    }

    public void setListafacturaItem(ArrayList<factura_itemfactura> listaitemfactura) {
        this.listaitemfactura = listaitemfactura;
    }
    
    public ArrayList<producto_itemfactura> getListaitemproducto() {
        return listaitemproducto;
    }

    public void setListaitemproducto(ArrayList<producto_itemfactura> listaitemproducto) {
        this.listaitemproducto = listaitemproducto;
    }
    
    
    
}

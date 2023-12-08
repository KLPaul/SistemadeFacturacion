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
public class producto {
    private int id_producto;
    private int stock;
    private Double precio_unitario;
    private String unidad;
    private int id_clasificación;
    private int id_proveedor;
    private Boolean iva;
    
    private ArrayList<producto_clasificacion>listapclasificacion;
    private ArrayList<producto_proveedor>listaprodproveedor;
    private ArrayList<producto_itemfactura>listaproductoItem;

    public producto() {
        listapclasificacion = new ArrayList<>();
        listaprodproveedor = new ArrayList<>();
        listaproductoItem = new ArrayList<>();
    }
      
    
    public producto(int id_producto, int stock, Double precio_unitario, String unidad, int id_clasificación, int id_proveedor, Boolean iva) {
        this.id_producto = id_producto;
        this.stock = stock;
        this.precio_unitario = precio_unitario;
        this.unidad = unidad;
        this.id_clasificación = id_clasificación;
        this.id_proveedor = id_proveedor;
        this.iva = iva;
   }
    
    public producto(int id_producto, int stock, Double precio_unitario, String unidad, int id_clasificación, int id_proveedor, Boolean iva, ArrayList<producto_clasificacion>listapclasificacion, ArrayList<producto_proveedor>listaprodproveedor, ArrayList<producto_itemfactura>listaproductoItem) {
        this.id_producto = id_producto;
        this.stock = stock;
        this.precio_unitario = precio_unitario;
        this.unidad = unidad;
        this.id_clasificación = id_clasificación;
        this.id_proveedor = id_proveedor;
        this.iva = iva;
        this.listapclasificacion=listapclasificacion;
        this.listaprodproveedor=listaprodproveedor;
        this.listaproductoItem=listaproductoItem;
   }
     
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getId_clasificación() {
        return id_clasificación;
    }

    public void setId_clasificación(int id_clasificación) {
        this.id_clasificación = id_clasificación;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public Boolean getIva() {
        return iva;
    }

    public void setIva(Boolean iva) {
        this.iva = iva;
    }
    
      public ArrayList<producto_clasificacion> getListaproclasificacion() {
        return listapclasificacion;
    }

    public void setListaproclasificacion(ArrayList<producto_clasificacion> listapclasificacion) {
        this.listapclasificacion = listapclasificacion;
    }
    
    public ArrayList<producto_proveedor> getListaprodproveedor() {
        return listaprodproveedor;
    }

    public void setListaprodproveedor(ArrayList<producto_proveedor> listaprodproveedor) {
        this.listaprodproveedor = listaprodproveedor;
    }
    
    public ArrayList<producto_itemfactura> getListaproditem() {
        return listaproductoItem;
    }

    public void setListaproditem(ArrayList<producto_itemfactura> listaproductoItem) {
        this.listaproductoItem = listaproductoItem;
    }
   
}

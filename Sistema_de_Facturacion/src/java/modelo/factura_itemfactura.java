/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class factura_itemfactura {
    
    private int id_item_factura;
    private int id_factura;

    public factura_itemfactura() {
    }

    public factura_itemfactura(int id_item_factura, int id_factura) {
        this.id_item_factura = id_item_factura;
        this.id_factura = id_factura;
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
    
    
}

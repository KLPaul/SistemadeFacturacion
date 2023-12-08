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
public class persona {
    
    
    private int id_persona;
    private String nombre;
    private String apellido;
    private String dni;
    private String celular;
    private String correo;
    private ArrayList<usuario_persona>listausuariop;
    private ArrayList<factura_persona>listafpersona;

    public persona() {
        listafpersona = new ArrayList<>();
    }

    public persona(int id_persona, String nombre, String apellido, String dni, String celular, String correo, ArrayList<usuario_persona>listausuariop, ArrayList<factura_persona>listafpersona) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.celular = celular;
        this.correo = correo;
        this.listausuariop=listausuariop;
        this.listafpersona=listafpersona;
        
    }

    public persona(int id_persona, String nombre, String apellido, String dni, String celular, String correo) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.celular = celular;
        this.correo = correo;
    }
    
    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
     
       public ArrayList<usuario_persona> getListausuariop() {
        return listausuariop;
    }
    
      public void setListausuariop(ArrayList<usuario_persona> listausuariop) {
        this.listausuariop = listausuariop;
    }
      
      public ArrayList<factura_persona> getListafpersona() {
        return listafpersona;
    }
    
      public void setListafpersona(ArrayList<factura_persona> listafpersona) {
        this.listafpersona = listafpersona;
    }
    
        public static String buscarPorDNI(ArrayList<persona> personas, String dniBuscado) {
        for (persona pers : personas) {
            if (pers.getDni().equals(dniBuscado)) {
                return pers.getNombre();
            }
        }
        
        return null;
    }
}

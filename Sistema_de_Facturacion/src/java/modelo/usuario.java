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
public class usuario {
 private int id_usuario;
 private int id_persona;
 private String user;
 private String password;

  private ArrayList<usuario_persona>listaupersona;
 
    public usuario() {
        listaupersona = new ArrayList<>();
    }
 
    public usuario(int id_usuario, int id_persona, String user, String password) {
        this.id_usuario = id_usuario;
        this.id_persona = id_persona;
        this.user = user;
        this.password = password;
    }
    
    public usuario(int id_usuario, int id_persona, String user, String password, ArrayList<usuario_persona>listaupersona) {
        this.id_usuario = id_usuario;
        this.id_persona = id_persona;
        this.user = user;
        this.password = password;
        this.listaupersona=listaupersona;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
      public ArrayList<usuario_persona> getListaupersona() {
        return listaupersona;
    }
    
      public void setListaupersona(ArrayList<usuario_persona> listaupersona) {
        this.listaupersona = listaupersona;
    }
    
    
 public static boolean verificarExistencia(ArrayList<usuario> usuarios, String user, String password) {
        for (usuario usuario : usuarios) {
            if (usuario.getUser().equals(user) && usuario.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
 
}

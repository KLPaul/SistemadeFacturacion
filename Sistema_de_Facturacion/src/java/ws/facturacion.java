/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.clasificacion;
import modelo.factura;
import modelo.item_factura;
import modelo.persona;
import modelo.producto;
import modelo.proveedores;
import modelo.tipo_pago;
import modelo.usuario;
import java.util.Date;
import modelo.competencia;
import modelo.factura_itemfactura;
import modelo.factura_persona;
import modelo.factura_tipo_pago;
import modelo.producto_clasificacion;
import modelo.producto_itemfactura;
import modelo.producto_proveedor;
import modelo.rol;
import modelo.usuario_persona;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "facturacion")
public class facturacion {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
        
    }
    
 @WebMethod
public factura ObtenerFactura(int idFactura) {

    // Obtiene la factura de la base de datos
    factura factura = new factura();
    factura.setId_factura(idFactura);

    // Devuelve la factura
    return factura;
}
         
     private ArrayList<tipo_pago> bd_tabla_TipoPago= new ArrayList<>();
     private ArrayList<persona> bd_tabla_persona = new ArrayList<>();
     private ArrayList<clasificacion> bd_tabla_clasificacion= new ArrayList<>();
     private ArrayList<proveedores> bd_tabla_proveedores= new ArrayList<>();
     private ArrayList<competencia> bd_tabla_competencia= new ArrayList<>();
     private ArrayList<rol> bd_tabla_roles = new ArrayList<>();
     private ArrayList<usuario> bd_tabla_usuario= new ArrayList<>();
     private ArrayList<factura> bd_tabla_factura= new ArrayList<>(); 
     private ArrayList<item_factura> bd_tabla_item_factura= new ArrayList<>();
     private ArrayList<producto> bd_tabla_producto= new ArrayList<>();
     
    private ArrayList<usuario_persona> bd_tabla_usuariopersona= new ArrayList<>();
    private ArrayList<factura_persona> bd_tabla_facturapersona= new ArrayList<>();
    private ArrayList<factura_tipo_pago> bd_tabla_factura_tipo_pago= new ArrayList<>();
    private ArrayList<factura_itemfactura> bd_tabla_factura_itemfactura= new ArrayList<>();
    private ArrayList<producto_itemfactura> bd_tabla_producto_itemfactura= new ArrayList<>();
    private ArrayList<producto_clasificacion> bd_tabla_producto_clasificacion= new ArrayList<>();
    private ArrayList<producto_proveedor> bd_tabla_producto_proveedor= new ArrayList<>();
    
     public void cargarDatos() {
      
        // Creamos los tipos de pago
        tipo_pago tp1 = new tipo_pago(1, "EFECTIVO", "Pago mediante monedas o billetes");
        bd_tabla_TipoPago.add(tp1);
        tipo_pago tp2 = new tipo_pago(2, "TRANSFERENCIA BANCARIA", "El dinero se transfiere electrónicamente de una cuenta bancaria");
         bd_tabla_TipoPago.add(tp2);
        tipo_pago tp3 = new tipo_pago(3, "TERJETA DEBITO", " El dinero se retira directamente de la cuenta del titular");
        bd_tabla_TipoPago.add(tp3);
        
        // Creamos las personas
        persona pr1 = new persona(1, "JULIO", "JARAMILLO", "0150266387", "0998814976", "jj@gmail.com");
         bd_tabla_persona.add(pr1);
        persona pr2 = new persona(2, "MANUEL", "PAREDES", "015026999", "0998812221", "mn@gmail.com");
         bd_tabla_persona.add(pr2);
        persona pr3 = new persona(3, "MARIA", "ORTIZ", "0150261123", "0998835421", "mO@gmail.com");
         bd_tabla_persona.add(pr3);
         
        // Creamos las clasificaciones
        clasificacion cl1 = new clasificacion(1,"Maxima");
        bd_tabla_clasificacion.add(cl1);
        clasificacion cl2 = new clasificacion(2,"Minima");
        bd_tabla_clasificacion.add(cl2);
        clasificacion cl3 = new clasificacion(3,"Media");
        bd_tabla_clasificacion.add(cl3);
         
        // Creamos los proveedores
        proveedores pv1 = new proveedores(1,"232","3432","Canada","as@gmail.com","Dolar Canadiense");
        bd_tabla_proveedores.add(pv1);
        proveedores pv2 = new proveedores(2,"543","7564","Ecuador","ec@gmail.com","Dolar");
        bd_tabla_proveedores.add(pv2);
        proveedores pv3 = new proveedores(3,"645","8233","Argentina","sae@gmail.com","Peso");
        bd_tabla_proveedores.add(pv3);
        
        // Creamos los competencia
        competencia cp1= new competencia(1,"ABISMAL","Enfocada en procesos");
        bd_tabla_competencia.add(cp1);
        competencia cp2= new competencia(2,"NO ABISMAL","No enfocada en procesos");
        bd_tabla_competencia.add(cp2);
        competencia cp3= new competencia(1,"ADJUDICATURA","Enfocada en ejecucuiones");
        bd_tabla_competencia.add(cp3);
        
        //Creación roles
        rol r1 = new rol(1,"ADMNISTRADOR", true);
        bd_tabla_roles.add(r1);
        rol r2 = new rol(2,"SEGURIDAD", false);
        bd_tabla_roles.add(r2);
        rol r3 = new rol(3,"GESTION", true);
        bd_tabla_roles.add(r3);
                
        //Creación Usuarios
        usuario u1 = new usuario(1, 1, "admin", "1234");
        usuario u2 = new usuario(2, 1, "manuel", "1234");  
       
        //Relaciones Usuario - Persona
        bd_tabla_usuariopersona.add(new usuario_persona(1, 1));
        bd_tabla_usuariopersona.add(new usuario_persona(2, 2));
        
        //asigna la lista a la propiedad Listaupersona del objeto u1 y u2
        u1.setListaupersona(bd_tabla_usuariopersona);
        u2.setListaupersona(bd_tabla_usuariopersona);
         
        // Agregamos los usuarios a la lista
        bd_tabla_usuario.add(u1);
        bd_tabla_usuario.add(u2);
        
        //Creación factura
        factura f1 = new factura(1,"0234", 1, "2023/02/03", 1, 0.34, 123);
        bd_tabla_factura.add(f1);
        
        //Creación item_factura
        item_factura if1 = new item_factura(1,1,1,12,2.22,26.64);
        bd_tabla_item_factura.add(if1);  
 
        //Creación producto
        producto p1 = new producto (1, 120, 1.32, "uno", 1, 1, true);
        bd_tabla_producto.add(p1);      
        
         
        //Relaciones factura - Persona
        bd_tabla_facturapersona.add(new factura_persona(1, 1));
        
  
         //Relaciones factura - tipo
        bd_tabla_factura_tipo_pago.add(new factura_tipo_pago(1, 1));
        
         //asigna la lista a la propiedad Listaupersona del objeto u1 y u2
        f1.setListalistafacturapersonas(bd_tabla_facturapersona);
        f1.setListafacTipoPago(bd_tabla_factura_tipo_pago);
        // Agregamos los usuarios a la lista
        bd_tabla_factura.add(f1);
        
        
        
        //Relaciones factura - item
        bd_tabla_factura_itemfactura.add(new factura_itemfactura(1, 1));
           
         //asigna la lista a la propiedad Listaupersona del objeto u1 y u2
        if1.setListafacturaItem(bd_tabla_factura_itemfactura);
        // Agregamos los usuarios a la lista
        bd_tabla_item_factura.add(if1);
        
        //Relaciones producto - item
        bd_tabla_producto_itemfactura.add(new producto_itemfactura(1, 1));
        
       //Relaciones producto - clasificacion
        bd_tabla_producto_clasificacion.add(new producto_clasificacion(1, 1));
        
                 //Relaciones producto - proveedor
        bd_tabla_producto_proveedor.add(new producto_proveedor(1, 1));
    
       
        p1.setListaprodproveedor(bd_tabla_producto_proveedor);
        p1.setListaproditem(bd_tabla_producto_itemfactura);
        p1.setListaproclasificacion(bd_tabla_producto_clasificacion);
        
        // Agregamos los usuarios a la lista
        bd_tabla_producto.add(p1);
}    
     
     
     @WebMethod(operationName = "ingresarTipoPago")
public boolean ingresarTipoPago(String tipo, String descripcion) {

    // Validamos los datos
    if (tipo == null || tipo.isEmpty()) {
        throw new IllegalArgumentException("El tipo es obligatorio");
    }

    if (descripcion == null || descripcion.isEmpty()) {
        throw new IllegalArgumentException("La descripción es obligatoria");
    }

    // Creamos un nuevo objeto TipoPago
    tipo_pago tipoPago = new tipo_pago(
        // Generar un ID único para el tipo de pago
        bd_tabla_TipoPago.size() + 1,
        tipo,
        descripcion
    );

    // Añadimos el tipo de pago a la lista
    bd_tabla_TipoPago.add(tipoPago);
    System.out.println("Tipo de pago ingresado");
    return true; // Tipo de pago ingresado correctamente
}

@WebMethod(operationName = "eliminarTipoPago")
public boolean eliminarTipoPago(int idTipoPago) {

    // Validamos los datos
    if (idTipoPago == 0) {
        throw new IllegalArgumentException("El ID del tipo de pago es obligatorio");
    }

    // Buscamos el tipo de pago en la lista
    tipo_pago tipoPago = null;
    for (tipo_pago tp : bd_tabla_TipoPago) {
        if (tp.getId_tipo_pago()== idTipoPago) {
            tipoPago = tp;
            break;
        }
    }

    if (tipoPago == null) {
        System.out.println("El tipo de pago no existe");
        return false;
    }

    // Eliminamos el tipo de pago de la lista
    bd_tabla_TipoPago.remove(tipoPago);
    System.out.println("Tipo de pago eliminado");
    return true;
}


@WebMethod(operationName = "consultarTipoPago")
public tipo_pago consultarTipoPago(int idTipoPago) {

    // Validamos los datos
    if (idTipoPago == 0) {
        throw new IllegalArgumentException("El ID del tipo de pago es obligatorio");
    }

    // Buscamos el tipo de pago en la lista
    tipo_pago tipoPago = null;
    for (tipo_pago tp : bd_tabla_TipoPago) {
        if (tp.getId_tipo_pago()== idTipoPago) {
            tipoPago = tp;
            break;
        }
    }

    // Devolvemos el tipo de pago
    return tipoPago;
}

@WebMethod(operationName = "editarTipoPago")
public boolean editarTipoPago(int idTipoPago, String tipo, String descripcion) {

    // Validamos los datos
    if (idTipoPago == 0) {
        throw new IllegalArgumentException("El ID del tipo de pago es obligatorio");
    }

    // Buscamos el tipo de pago en la lista
    tipo_pago tipoPago = null;
    for (tipo_pago tp : bd_tabla_TipoPago) {
        if (tp.getId_tipo_pago()== idTipoPago) {
            tipoPago = tp;
            break;
        }
    }

    if (tipoPago == null) {
        System.out.println("El tipo de pago no existe");
        return false;
    }

    // Actualizamos los datos del tipo de pago
    tipoPago.setTipo(tipo);
    tipoPago.setDescripcion(descripcion);

    // Actualizamos el tipo de pago en la lista
    bd_tabla_TipoPago.set(bd_tabla_TipoPago.indexOf(tipoPago), tipoPago);
    System.out.println("Tipo de pago actualizado");
    return true;
}

     @WebMethod(operationName = "ingresarPersona")
public boolean ingresarPersona(String nombre, String apellido, String dni, String celular, String correo) {

    // Validamos los datos
    if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("El nombre es obligatorio");
    }

    if (apellido == null || apellido.isEmpty()) {
        throw new IllegalArgumentException("El apellido es obligatorio");
    }

    if (dni == null || dni.isEmpty()) {
        throw new IllegalArgumentException("El DNI es obligatorio");
    }

    if (celular == null || celular.isEmpty()) {
        throw new IllegalArgumentException("El celular es obligatorio");
    }

    if (correo == null || correo.isEmpty()) {
        throw new IllegalArgumentException("El correo electrónico es obligatorio");
    }

    // Creamos un nuevo objeto Persona
    persona persona = new persona(
        // Generar un ID único para la persona
        bd_tabla_persona.size() + 1,
        nombre,
        apellido,
        dni,
        celular,
        correo
    );

    // Buscamos la persona en la lista
    for (persona p : bd_tabla_persona) {
        if (p.getDni().equals(dni)) {
            System.out.println("La persona ya existe");
            return false; // Persona ya existe
        }
    }

    // Añadimos la persona a la lista
    bd_tabla_persona.add(persona);
    System.out.println("Persona ingresada");
    return true; // Persona ingresada correctamente
}


@WebMethod(operationName = "eliminarPersona")
public boolean eliminarPersona(String dni) {

    // Validamos los datos
    if (dni == null || dni.isEmpty()) {
        throw new IllegalArgumentException("El DNI es obligatorio");
    }

    // Buscamos la persona en la lista
    persona persona = null;
    for (persona p : bd_tabla_persona) {
        if (p.getDni().equals(dni)) {
            persona = p;
            break;
        }
    }

    if (persona == null) {
        System.out.println("La persona no existe");
        return false;
    }

    // Eliminamos la persona de la lista
    bd_tabla_persona.remove(persona);
    System.out.println("Persona eliminada");
    return true;
}


@WebMethod(operationName = "consultarPersona")
public persona consultarPersona(String dni) {

    // Validamos los datos
    if (dni == null || dni.isEmpty()) {
        throw new IllegalArgumentException("El DNI es obligatorio");
    }

    // Buscamos la persona en la lista
    persona persona = null;
    for (persona p : bd_tabla_persona) {
        if (p.getDni().equals(dni)) {
            persona = p;
            break;
        }
    }

    // Devolvemos la persona
    return persona;
}

@WebMethod(operationName = "editarPersona")
public boolean editarPersona(String dni, String nombre, String apellido, String celular, String correo) {

    // Validamos los datos
    if (dni == null || dni.isEmpty()) {
        throw new IllegalArgumentException("El DNI es obligatorio");
    }

    if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("El nombre es obligatorio");
    }

    if (apellido == null || apellido.isEmpty()) {
        throw new IllegalArgumentException("El apellido es obligatorio");
    }

    // Buscamos la persona en la lista
    persona persona = null;
    for (persona p : bd_tabla_persona) {
        if (p.getDni().equals(dni)) {
            persona = p;
            break;
        }
    }

    if (persona == null) {
        System.out.println("La persona no existe");
        return false;
    }

    // Actualizamos los datos de la persona
    persona.setNombre(nombre);
    persona.setApellido(apellido);
    persona.setCelular(celular);
    persona.setCorreo(correo);

    // Actualizamos la persona en la lista
    bd_tabla_persona.set(bd_tabla_persona.indexOf(persona), persona);
    System.out.println("Persona actualizada");
    return true;
}

@WebMethod(operationName = "buscarPersonaPorDNI")
public String buscarPersonaPorDNI(ArrayList<persona> personas, String dniBuscado) {

    // Validamos los datos
    if (personas == null) {
        throw new IllegalArgumentException("La lista de personas es obligatoria");
    }

    if (dniBuscado == null || dniBuscado.isEmpty()) {
        throw new IllegalArgumentException("El DNI es obligatorio");
    }

    // Buscamos la persona en la lista
    persona persona = null;
    for (persona pers : personas) {
        if (pers.getDni().equals(dniBuscado)) {
            persona = pers;
            break;
        }
    }

    // Devolvemos el nombre de la persona
    if (persona != null) {
        return persona.getNombre();
    } else {
        return null;
    }
}
     
@WebMethod(operationName = "ingresarClasificacion")
public boolean ingresarClasificacion(String grupo) {

    // Validamos los datos
    if (grupo == null || grupo.isEmpty()) {
        throw new IllegalArgumentException("El grupo es obligatorio");
    }

    // Creamos un nuevo objeto Clasificacion
    clasificacion clasificacion = new clasificacion(
        // Generar un ID único para la clasificacion
        bd_tabla_clasificacion.size() + 1,
        grupo
    );

    // Buscamos la clasificacion en la lista
    for (clasificacion c : bd_tabla_clasificacion) {
        if (c.getGrupo().equals(grupo)) {
            System.out.println("La clasificacion ya existe");
            return false; // Clasificacion ya existe
        }
    }

    // Añadimos la clasificacion a la lista
    bd_tabla_clasificacion.add(clasificacion);
    System.out.println("Clasificacion ingresada");
    return true; // Clasificacion ingresada correctamente
}

@WebMethod(operationName = "eliminarClasificacion")
public boolean eliminarClasificacion(int idClasificacion) {

    // Validamos los datos
    if (idClasificacion == 0) {
        throw new IllegalArgumentException("El ID de la clasificación es obligatorio");
    }

    // Buscamos la clasificación en la lista
    clasificacion clasificacion = null;
    for (clasificacion cl : bd_tabla_clasificacion) {
        if (cl.getId_clasificación() == idClasificacion) {
            clasificacion = cl;
            break;
        }
    }

    if (clasificacion == null) {
        System.out.println("La clasificación no existe");
        return false;
    }

    // Eliminamos la clasificación de la lista
    bd_tabla_clasificacion.remove(clasificacion);
    System.out.println("Clasificación eliminada");
    return true;
}

@WebMethod(operationName = "consultarClasificacion")
public clasificacion consultarClasificacion(int idClasificacion) {

    // Validamos los datos
    if (idClasificacion == 0) {
        throw new IllegalArgumentException("El ID de la clasificación es obligatorio");
    }

    // Buscamos la clasificación en la lista
    clasificacion clasificacion = null;
    for (clasificacion cl : bd_tabla_clasificacion) {
        if (cl.getId_clasificación()== idClasificacion) {
            clasificacion = cl;
            break;
        }
    }

    // Devolvemos la clasificación
    return clasificacion;
}

@WebMethod(operationName = "editarClasificacion")
public boolean editarClasificacion(int idClasificacion, String grupo) {

    // Validamos los datos
    if (idClasificacion == 0) {
        throw new IllegalArgumentException("El ID de la clasificación es obligatorio");
    }

    if (grupo == null || grupo.isEmpty()) {
        throw new IllegalArgumentException("El grupo es obligatorio");
    }

    // Buscamos la clasificación en la lista
    clasificacion clasificacion = null;
    for (clasificacion cl : bd_tabla_clasificacion) {
        if (cl.getId_clasificación()== idClasificacion) {
            clasificacion = cl;
            break;
        }
    }

    if (clasificacion == null) {
        System.out.println("La clasificación no existe");
        return false;
    }

    // Actualizamos los datos de la clasificación
    clasificacion.setGrupo(grupo);

    // Actualizamos la clasificación en la lista
    bd_tabla_clasificacion.set(bd_tabla_clasificacion.indexOf(clasificacion), clasificacion);
    System.out.println("Clasificación actualizada");
    return true;
}

@WebMethod(operationName = "ingresarProveedor")
public boolean ingresarProveedor(String ruc, String telefono, String pais, String correo, String moneda) {

    // Validamos los datos
    if (ruc == null || ruc.isEmpty()) {
        throw new IllegalArgumentException("El RUC es obligatorio");
    }

    if (telefono == null || telefono.isEmpty()) {
        throw new IllegalArgumentException("El teléfono es obligatorio");
    }

    if (pais == null || pais.isEmpty()) {
        throw new IllegalArgumentException("El país es obligatorio");
    }

    if (correo == null || correo.isEmpty()) {
        throw new IllegalArgumentException("El correo electrónico es obligatorio");
    }

    if (moneda == null || moneda.isEmpty()) {
        throw new IllegalArgumentException("La moneda es obligatoria");
    }

    // Creamos un nuevo objeto Proveedor
    proveedores proveedor = new proveedores(
        // Generar un ID único para el proveedor
        bd_tabla_proveedores.size() + 1,
        ruc,
        telefono,
        pais,
        correo,
        moneda
    );

    // Añadimos el proveedor a la lista
    bd_tabla_proveedores.add(proveedor);
    System.out.println("Proveedor ingresado");
    return true; // Proveedor ingresado correctamente
}


@WebMethod(operationName = "eliminarProveedor")
public boolean eliminarProveedor(int idProveedor) {

    // Validamos los datos
    if (idProveedor == 0) {
        throw new IllegalArgumentException("El ID del proveedor es obligatorio");
    }

    // Buscamos el proveedor en la lista
    proveedores proveedor = null;
    for (proveedores p : bd_tabla_proveedores) {
        if (p.getId_proveedor()== idProveedor) {
            proveedor = p;
            break;
        }
    }

    if (proveedor == null) {
        System.out.println("El proveedor no existe");
        return false;
    }

    // Eliminamos el proveedor de la lista
    bd_tabla_proveedores.remove(proveedor);
    System.out.println("Proveedor eliminado");
    return true;
}

@WebMethod(operationName = "consultarProveedor")
public proveedores consultarProveedor(int idProveedor) {

    // Validamos los datos
    if (idProveedor == 0) {
        throw new IllegalArgumentException("El ID del proveedor es obligatorio");
    }

    // Buscamos el proveedor en la lista
    proveedores proveedor = null;
    for (proveedores p : bd_tabla_proveedores) {
        if (p.getId_proveedor()== idProveedor) {
            proveedor = p;
            break;
        }
    }

    // Devolvemos el proveedor
    return proveedor;
}


@WebMethod(operationName = "editarProveedor")
public boolean editarProveedor(int idProveedor, String ruc, String telefono, String pais, String correo, String moneda) {

    // Validamos los datos
    if (idProveedor == 0) {
        throw new IllegalArgumentException("El ID del proveedor es obligatorio");
    }

    // Buscamos el proveedor en la lista
    proveedores proveedor = null;
    for (proveedores p : bd_tabla_proveedores) {
        if (p.getId_proveedor()== idProveedor) {
            proveedor = p;
            break;
        }
    }

    if (proveedor == null) {
        System.out.println("El proveedor no existe");
        return false;
    }

    // Actualizamos los datos del proveedor
    proveedor.setRuc(ruc);
    proveedor.setTelefono(telefono);
    proveedor.setPais(pais);
    proveedor.setCorreo(correo);
    proveedor.setMoneda(moneda);

    // Actualizamos el proveedor en la lista
    bd_tabla_proveedores.set(bd_tabla_proveedores.indexOf(proveedor), proveedor);
    System.out.println("Proveedor actualizado");
    return true;
}

@WebMethod(operationName = "ingresarCompetencia")
public boolean ingresarCompetencia(String nombre, String descripcion) {

    // Validamos los datos
    if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("El nombre es obligatorio");
    }

    if (descripcion == null || descripcion.isEmpty()) {
        throw new IllegalArgumentException("La descripción es obligatoria");
    }

    // Creamos un nuevo objeto Competencia
    competencia competencia = new competencia(
        // Generar un ID único para la competencia
        bd_tabla_competencia.size() + 1,
        nombre,
        descripcion
    );

    // Buscamos la competencia en la lista
    for (competencia c : bd_tabla_competencia) {
        if (c.getNombre().equals(nombre)) {
            System.out.println("La competencia ya existe");
            return false; // Competencia ya existe
        }
    }

    // Añadimos la competencia a la lista
    bd_tabla_competencia.add(competencia);
    System.out.println("Competencia ingresada");
    return true; // Competencia ingresada correctamente
}

@WebMethod(operationName = "eliminarCompetencia")
public boolean eliminarCompetencia(int idCompetencia) {

    // Validamos los datos
    if (idCompetencia == 0) {
        throw new IllegalArgumentException("El ID de la competencia es obligatorio");
    }

    // Buscamos la competencia en la lista
    competencia competencia = null;
    for (competencia c : bd_tabla_competencia) {
        if (c.getId_competencias() == idCompetencia) {
            competencia = c;
            break;
        }
    }

    if (competencia == null) {
        System.out.println("La competencia no existe");
        return false;
    }

    // Eliminamos la competencia de la lista
    bd_tabla_competencia.remove(competencia);
    System.out.println("Competencia eliminada");
    return true;
}


@WebMethod(operationName = "consultarCompetencia")
public competencia consultarCompetencia(int idCompetencia) {

    // Validamos los datos
    if (idCompetencia == 0) {
        throw new IllegalArgumentException("El ID de la competencia es obligatorio");
    }

    // Buscamos la competencia en la lista
    competencia competencia = null;
    for (competencia c : bd_tabla_competencia) {
        if (c.getId_competencias() == idCompetencia) {
            competencia = c;
            break;
        }
    }

    // Devolvemos la competencia
    return competencia;
}

@WebMethod(operationName = "editarCompetencia")
public boolean editarCompetencia(int idCompetencia, String nombre, String descripcion) {

    // Validamos los datos
    if (idCompetencia == 0) {
        throw new IllegalArgumentException("El ID de la competencia es obligatorio");
    }

    if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("El nombre es obligatorio");
    }

    // Buscamos la competencia en la lista
    competencia competencia = null;
    for (competencia c : bd_tabla_competencia) {
        if (c.getId_competencias()== idCompetencia) {
            competencia = c;
            break;
        }
    }

    if (competencia == null) {
        System.out.println("La competencia no existe");
        return false;
    }

    // Actualizamos los datos de la competencia
    competencia.setNombre(nombre);
    competencia.setDescripcion(descripcion);

    // Actualizamos la competencia en la lista
    bd_tabla_competencia.set(bd_tabla_competencia.indexOf(competencia), competencia);
    System.out.println("Competencia actualizada");
    return true;
}


@WebMethod(operationName = "verificarExistenciaCompetencia")
public competencia verificarExistenciaCompetencia(ArrayList<competencia> competencias, String nombre) {

    // Validamos los datos
    if (competencias == null) {
        throw new IllegalArgumentException("La lista de competencias es obligatoria");
    }

    if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("El nombre de la competencia es obligatorio");
    }

    // Buscamos la competencia en la lista
    competencia competencia = null;
    for (competencia comp : competencias) {
        if (comp.getNombre().equals(nombre)) {
            competencia = comp;
            break;
        }
    }

    // Devolvemos la competencia
    return competencia;
}

@WebMethod(operationName = "ingresarRol")
public boolean ingresarRol(String rol, boolean estado) {

    // Validamos los datos
    if (rol == null || rol.isEmpty()) {
        throw new IllegalArgumentException("El rol es obligatorio");
    }

    // Creamos un nuevo objeto Rol
    rol roles = new rol(
        // Generar un ID único para el rol
        bd_tabla_roles.size() + 1,
        rol,
        estado
    );

    // Añadimos el rol a la lista
    bd_tabla_roles.add(roles);
    System.out.println("Rol ingresado");
    return true; // Rol ingresado correctamente
}

@WebMethod(operationName = "eliminarRol")
public boolean eliminarRol(int idRol) {

    // Validamos los datos
    if (idRol == 0) {
        throw new IllegalArgumentException("El ID del rol es obligatorio");
    }

    // Buscamos el rol en la lista
    rol rol = null;
    for (rol r : bd_tabla_roles) {
        if (r.getId_rol()== idRol) {
            rol = r;
            break;
        }
    }

    if (rol == null) {
        System.out.println("El rol no existe");
        return false;
    }

    // Eliminamos el rol de la lista
    bd_tabla_roles.remove(rol);
    System.out.println("Rol eliminado");
    return true;
}

@WebMethod(operationName = "consultarRol")
public rol consultarRol(int idRol) {

    // Validamos los datos
    if (idRol == 0) {
        throw new IllegalArgumentException("El ID del rol es obligatorio");
    }

    // Buscamos el rol en la lista
      rol rol = null;
    for (rol r : bd_tabla_roles) {
        if (r.getId_rol()== idRol) {
            rol = r;
            break;
        }
    }

    // Devolvemos el rol
    return rol;
}

@WebMethod(operationName = "editarRol")
public boolean editarRol(int idRol, String rol, Boolean estado) {

    // Validamos los datos
    if (idRol == 0) {
        throw new IllegalArgumentException("El ID del rol es obligatorio");
    }

    // Buscamos el rol en la lista
    rol rolEncontrado = null;
    for (rol r : bd_tabla_roles) {
        if (r.getId_rol()== idRol) {
            rolEncontrado = r;
            break;
        }
    }

    if (rolEncontrado == null) {
        System.out.println("El rol no existe");
        return false;
    }

    // Actualizamos los datos del rol
    rolEncontrado.setRol(rol);
    rolEncontrado.setEstado(estado);

    // Actualizamos el rol en la lista
    bd_tabla_roles.set(bd_tabla_roles.indexOf(rolEncontrado), rolEncontrado);
    System.out.println("Rol actualizado");
    return true;
}

@WebMethod(operationName = "verificarExistenciaRol")
public boolean verificarExistenciaRol(ArrayList<rol> roles, String Rol) {

    // Validación de datos
    if (roles == null) {
        throw new IllegalArgumentException("La lista de roles es obligatoria");
    }

    // Búsqueda del rol
    for (rol rol : roles) {
        if (rol.getRol().equals(Rol)) {
            return true;
        }
    }
    return false;
}

@WebMethod(operationName = "ingresarUsuario")
public boolean ingresarUsuario(int idPersona, String user, String password) {

    // Validamos los datos
    if (idPersona == 0) {
        throw new IllegalArgumentException("El ID de la persona es obligatorio");
    }

    if (user == null || user.isEmpty()) {
        throw new IllegalArgumentException("El usuario es obligatorio");
    }

    if (password == null || password.isEmpty()) {
        throw new IllegalArgumentException("La contraseña es obligatoria");
    }

    // Buscamos la persona en la lista
    persona persona = null;
    for (persona p : bd_tabla_persona) {
        if (p.getId_persona() == idPersona) {
            persona = p;
            break;
        }
    }

    if (persona == null) {
        System.out.println("La persona no existe");
        return false;
    }

    // Creamos un nuevo objeto Usuario
    usuario usuario = new usuario(
        // Generar un ID único para el usuario
        bd_tabla_usuario.size() + 1,
        idPersona,
        user,
        password
    );

    // Añadimos el usuario a la lista
    bd_tabla_usuario.add(usuario);
    System.out.println("Usuario ingresado");
    return true; // Usuario ingresado correctamente
}

@WebMethod(operationName = "eliminarUsuario")
public boolean eliminarUsuario(int idUsuario) {

    // Validamos los datos
    if (idUsuario == 0) {
        throw new IllegalArgumentException("El ID del usuario es obligatorio");
    }

    // Buscamos el usuario en la lista
    usuario usuario = null;
    for (usuario u : bd_tabla_usuario) {
        if (u.getId_usuario() == idUsuario) {
            usuario = u;
            break;
        }
    }

    if (usuario == null) {
        System.out.println("El usuario no existe");
        return false;
    }

    // Eliminamos el usuario de la lista
    bd_tabla_usuario.remove(usuario);
    System.out.println("Usuario eliminado");
    return true;
}

@WebMethod(operationName = "consultarUsuario")
public usuario consultarUsuario(int idUsuario, int idPersona) {

    // Validamos los datos
    if (idUsuario == 0) {
        throw new IllegalArgumentException("El ID del usuario es obligatorio");
    }

    if (idPersona == 0) {
        throw new IllegalArgumentException("El ID de la persona es obligatorio");
    }

    // Buscamos el usuario en la lista
    usuario usuario = null;
    for (usuario u : bd_tabla_usuario) {
        if (u.getId_usuario()== idUsuario && u.getId_persona()== idPersona) {
            usuario = u;
            break;
        }
    }

    // Devolvemos el usuario
    return usuario;
}


@WebMethod(operationName = "editarUsuario")
public boolean editarUsuario(int idUsuario, int idPersona, String username, String password) {

    // Validamos los datos
    if (idUsuario == 0) {
        throw new IllegalArgumentException("El ID del usuario es obligatorio");
    }

    if (idPersona == 0) {
        throw new IllegalArgumentException("El ID de la persona es obligatorio");
    }

    // Buscamos el usuario en la lista
    usuario usuario = null;
    for (usuario u : bd_tabla_usuario) {
        if (u.getId_usuario()== idUsuario && u.getId_persona()== idPersona) {
            usuario = u;
            break;
        }
    }

    if (usuario == null) {
        System.out.println("El usuario no existe");
        return false;
    }

    // Actualizamos los datos del usuario
    usuario.setUser(username);
    usuario.setPassword(password);

    // Actualizamos el usuario en la lista
    bd_tabla_usuario.set(bd_tabla_usuario.indexOf(usuario), usuario);
    System.out.println("Usuario actualizado");
    return true;
}


@WebMethod(operationName = "verificarExistenciaUsuario")
public boolean verificarExistenciaUsuario(ArrayList<usuario> usuarios, String user, String password) {

    // Validación de datos
    if (usuarios == null) {
        throw new IllegalArgumentException("La lista de usuarios es obligatoria");
    }

    if (user == null || user.isEmpty()) {
        throw new IllegalArgumentException("El nombre de usuario es obligatorio");
    }

    // Búsqueda del usuario
    usuario usuarioEncontrado = null;
    for (usuario usuario : usuarios) {
        if (usuario.getUser().equals(user)) {
            usuarioEncontrado = usuario;
            break;
        }
    }

    // Verificación de la contraseña (si se proporciona)
    if (password != null && !password.isEmpty()) {
        if (!usuarioEncontrado.getPassword().equals(password)) {
            return false;
        }
    }

    // Resultado de la verificación
    return usuarioEncontrado != null;
}
     
@WebMethod(operationName = "ingresarFactura")
public boolean ingresarFactura(String ruc, int idPersona, String fecha, int idTipoPago, double descuento, double total) {

    // Validamos los datos
    if (ruc == null || ruc.isEmpty()) {
        throw new IllegalArgumentException("El RUC es obligatorio");
    }

    if (idPersona == 0) {
        throw new IllegalArgumentException("El ID de la persona es obligatorio");
    }

   if (fecha == null) {
        throw new IllegalArgumentException("La fecha es obligatoria");
    } 

    if (idTipoPago == 0) {
        throw new IllegalArgumentException("El ID del tipo de pago es obligatorio");
    }

    if (descuento < 0 || descuento > 1) {
        throw new IllegalArgumentException("El descuento debe estar entre 0 y 1");
    }

    if (total < 0) {
        throw new IllegalArgumentException("El total debe ser mayor o igual a 0");
    }

    // Creamos un nuevo objeto Factura
    factura factura = new factura(
        // Generar un ID único para la factura
        bd_tabla_factura.size() + 1,
        ruc,
        idPersona,
        fecha,
        idTipoPago,
        descuento,
        total
    );

    // Añadimos la factura a la lista
    bd_tabla_factura.add(factura);
    System.out.println("Factura ingresada");
    return true; // Factura ingresada correctamente
}

@WebMethod(operationName = "eliminarFactura")
public boolean eliminarFactura(int idFactura) {

    // Validamos los datos
    if (idFactura == 0) {
        throw new IllegalArgumentException("El ID de la factura es obligatorio");
    }

    // Buscamos la factura en la lista
    factura factura = null;
    for (factura f : bd_tabla_factura) {
        if (f.getId_factura()== idFactura) {
            factura = f;
            break;
        }
    }

    if (factura == null) {
        System.out.println("La factura no existe");
        return false;
    }

    // Eliminamos la factura de la lista
    bd_tabla_factura.remove(factura);
    System.out.println("Factura eliminada");
    return true;
}

@WebMethod(operationName = "consultarFactura")
public factura consultarFactura(int idFactura) {

    // Validamos los datos
    if (idFactura == 0) {
        throw new IllegalArgumentException("El ID de la factura es obligatorio");
    }

    // Buscamos la factura en la lista
    factura factura = null;
    for (factura f : bd_tabla_factura) {
        if (f.getId_factura()== idFactura) {
            factura = f;
            break;
        }
    }

    // Devolvemos la factura
    return factura;
}

@WebMethod(operationName = "editarFactura")
public boolean editarFactura(int idFactura, String ruc, int idPersona, String fecha, int idTipoPago, double descuento, double total) {

    // Validamos los datos
    if (idFactura == 0) {
        throw new IllegalArgumentException("El ID de la factura es obligatorio");
    }

    // Buscamos la factura en la lista
    factura factura = null;
    for (factura f : bd_tabla_factura) {
        if (f.getId_factura()== idFactura) {
            factura = f;
            break;
        }
    }

    if (factura == null) {
        System.out.println("La factura no existe");
        return false;
    }

    // Actualizamos los datos de la factura
    factura.setRuc(ruc);
    factura.setId_persona(idPersona);
    factura.setFecha(fecha);
    factura.setId_tipo_pago(idTipoPago);
    factura.setDescuento(descuento);
    factura.setTotal(total);

    // Actualizamos la factura en la lista
    bd_tabla_factura.set(bd_tabla_factura.indexOf(factura), factura);
    System.out.println("Factura actualizada");
    return true;
}

@WebMethod(operationName = "ingresarItemFactura")
public boolean ingresarItemFactura(int idFactura, int idProducto, int cantidad, double precio, double subtotal) {

    // Validamos los datos
    if (idFactura == 0) {
        throw new IllegalArgumentException("El ID de la factura es obligatorio");
    }

    if (idProducto == 0) {
        throw new IllegalArgumentException("El ID del producto es obligatorio");
    }

    if (cantidad < 1) {
        throw new IllegalArgumentException("La cantidad debe ser mayor o igual a 1");
    }

    if (precio < 0) {
        throw new IllegalArgumentException("El precio debe ser mayor o igual a 0");
    }

    if (subtotal < 0) {
        throw new IllegalArgumentException("El subtotal debe ser mayor o igual a 0");
    }

    // Creamos un nuevo objeto ItemFactura
    item_factura itemFactura = new item_factura(
        // Generar un ID único para el item de factura
        bd_tabla_item_factura.size() + 1,
        idFactura,
        idProducto,
        cantidad,
        precio,
        subtotal
    );

    // Añadimos el item de factura a la lista
    bd_tabla_item_factura.add(itemFactura);
    System.out.println("Item de factura ingresado");
    return true; // Item de factura ingresado correctamente
}

@WebMethod(operationName = "eliminarItemFactura")
public boolean eliminarItemFactura(int idItemFactura) {

    // Validamos los datos
    if (idItemFactura == 0) {
        throw new IllegalArgumentException("El ID del item de factura es obligatorio");
    }

    // Buscamos el item de factura en la lista
    item_factura itemFactura = null;
    for (item_factura i : bd_tabla_item_factura) {
        if (i.getId_item_factura()== idItemFactura) {
            itemFactura = i;
            break;
        }
    }

    if (itemFactura == null) {
        System.out.println("El item de factura no existe");
        return false;
    }

    // Eliminamos el item de factura de la lista
    bd_tabla_item_factura.remove(itemFactura);
    System.out.println("Item de factura eliminado");
    return true;
}


@WebMethod(operationName = "consultarItemFactura")
public item_factura consultarItemFactura(int idItemFactura) {

    // Validamos los datos
    if (idItemFactura == 0) {
        throw new IllegalArgumentException("El ID del item de factura es obligatorio");
    }

    // Buscamos el item de factura en la lista
    item_factura itemFactura = null;
    for (item_factura i : bd_tabla_item_factura) {
        if (i.getId_item_factura()== idItemFactura) {
            itemFactura = i;
            break;
        }
    }

    // Devolvemos el item de factura
    return itemFactura;
}

@WebMethod(operationName = "editarItemFactura")
public boolean editarItemFactura(int idItemFactura, int idFactura, int idProducto, int cantidad, Double precio, Double subtotal) {

    // Validamos los datos
    if (idItemFactura == 0) {
        throw new IllegalArgumentException("El ID del item de factura es obligatorio");
    }

    // Buscamos el item de factura en la lista
    item_factura itemFactura = null;
    for (item_factura i : bd_tabla_item_factura) {
        if (i.getId_item_factura()== idItemFactura) {
            itemFactura = i;
            break;
        }
    }

    if (itemFactura == null) {
        System.out.println("El item de factura no existe");
        return false;
    }

    // Actualizamos los datos del item de factura
    itemFactura.setId_factura(idFactura);
    itemFactura.setId_producto(idProducto);
    itemFactura.setCantidad(cantidad);
    itemFactura.setPrecio(precio);
    itemFactura.setSubtotal(subtotal);

    // Actualizamos el item de factura en la lista
    bd_tabla_item_factura.set(bd_tabla_item_factura.indexOf(itemFactura), itemFactura);
    System.out.println("Item de factura actualizado");
    return true;
}

@WebMethod(operationName = "ingresarProducto")
public boolean ingresarProducto(int stock, double precioUnitario, String unidad, int idClasificacion, int idProveedor, boolean iva) {

    // Validamos los datos
    if (stock < 0) {
        throw new IllegalArgumentException("El stock debe ser mayor o igual a 0");
    }

    if (precioUnitario < 0) {
        throw new IllegalArgumentException("El precio unitario debe ser mayor o igual a 0");
    }

    if (unidad == null || unidad.isEmpty()) {
        throw new IllegalArgumentException("La unidad es obligatoria");
    }

    if (idClasificacion == 0) {
        throw new IllegalArgumentException("El ID de la clasificación es obligatorio");
    }

    if (idProveedor == 0) {
        throw new IllegalArgumentException("El ID del proveedor es obligatorio");
    }

    // Creamos un nuevo objeto Producto
    producto producto = new producto(
        // Generar un ID único para el producto
        bd_tabla_producto.size() + 1,
        stock,
        precioUnitario,
        unidad,
        idClasificacion,
        idProveedor,
        iva
    );

    // Añadimos el producto a la lista
    bd_tabla_producto.add(producto);
    System.out.println("Producto ingresado");
    return true; // Producto ingresado correctamente
}

@WebMethod(operationName = "eliminarProducto")
public boolean eliminarProducto(int idProducto) {

    // Validamos los datos
    if (idProducto == 0) {
        throw new IllegalArgumentException("El ID del producto es obligatorio");
    }

    // Buscamos el producto en la lista
    producto producto = null;
    for (producto p : bd_tabla_producto) {
        if (p.getId_producto()== idProducto) {
            producto = p;
            break;
        }
    }

    if (producto == null) {
        System.out.println("El producto no existe");
        return false;
    }

    // Eliminamos el producto de la lista
    bd_tabla_producto.remove(producto);
    System.out.println("Producto eliminado");
    return true;
}

@WebMethod(operationName = "consultarProducto")
public producto consultarProducto(int idProducto) {

    // Validamos los datos
    if (idProducto == 0) {
        throw new IllegalArgumentException("El ID del producto es obligatorio");
    }

    // Buscamos el producto en la lista
    producto producto = null;
    for (producto p : bd_tabla_producto) {
        if (p.getId_producto()== idProducto) {
            producto = p;
            break;
        }
    }

    // Devolvemos el producto
    return producto;
}


@WebMethod(operationName = "editarProducto")
public boolean editarProducto(int idProducto, int stock, Double precioUnitario, String unidad, int idClasificacion, int idProveedor, Boolean iva) {

    // Validamos los datos
    if (idProducto == 0) {
        throw new IllegalArgumentException("El ID del producto es obligatorio");
    }

    // Buscamos el producto en la lista
    producto producto = null;
    for (producto p : bd_tabla_producto) {
        if (p.getId_producto()== idProducto) {
            producto = p;
            break;
        }
    }

    if (producto == null) {
        System.out.println("El producto no existe");
        return false;
    }

    // Actualizamos los datos del producto
    producto.setStock(stock);
    producto.setPrecio_unitario(precioUnitario);
    producto.setUnidad(unidad);
    producto.setId_clasificación(idClasificacion);
    producto.setId_proveedor(idProveedor);
    producto.setIva(iva);

    // Actualizamos el producto en la lista
    bd_tabla_producto.set(bd_tabla_producto.indexOf(producto), producto);
    System.out.println("Producto actualizado");
    return true;
}

    }
     
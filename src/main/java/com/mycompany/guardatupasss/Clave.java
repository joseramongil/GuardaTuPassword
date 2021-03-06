package com.mycompany.guardatupasss;
// Generated 26-may-2016 18:31:56 by Hibernate Tools 4.3.1



/**
 * Clave generated by hbm2java
 */
public class Clave  implements java.io.Serializable {


     private Integer id;
     private String nombreUsuario;
     private String clave;
     private String descripcion;
     private int usuario;

    public Clave() {
    }

	
    public Clave(String nombreUsuario, String clave, int usuario) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.usuario = usuario;
    }
    public Clave(String nombreUsuario, String clave, String descripcion, int usuario) {
       this.nombreUsuario = nombreUsuario;
       this.clave = clave;
       this.descripcion = descripcion;
       this.usuario = usuario;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }




}



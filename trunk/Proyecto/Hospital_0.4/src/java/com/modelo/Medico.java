package com.modelo;
// Generated 30-abr-2013 12:33:26 by Hibernate Tools 3.2.1.GA



/**
 * Medico generated by hbm2java
 */
public class Medico  implements java.io.Serializable {


     private int id;
     private int idpersona;
     private int idespecializacion;

    public Medico() {
    }

    public Medico(int id, int idpersona, int idespecializacion) {
       this.id = id;
       this.idpersona = idpersona;
       this.idespecializacion = idespecializacion;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getIdpersona() {
        return this.idpersona;
    }
    
    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }
    public int getIdespecializacion() {
        return this.idespecializacion;
    }
    
    public void setIdespecializacion(int idespecializacion) {
        this.idespecializacion = idespecializacion;
    }




}



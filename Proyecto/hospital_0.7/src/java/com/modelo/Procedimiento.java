package com.modelo;
// Generated 13-may-2013 15:44:06 by Hibernate Tools 3.2.1.GA



/**
 * Procedimiento generated by hbm2java
 */
public class Procedimiento  implements java.io.Serializable {


     private int id;
     private String cirugia;
     private String terapia;
     private int idcita;

    public Procedimiento() {
    }

    public Procedimiento(int id, String cirugia, String terapia, int idcita) {
       this.id = id;
       this.cirugia = cirugia;
       this.terapia = terapia;
       this.idcita = idcita;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCirugia() {
        return this.cirugia;
    }
    
    public void setCirugia(String cirugia) {
        this.cirugia = cirugia;
    }
    public String getTerapia() {
        return this.terapia;
    }
    
    public void setTerapia(String terapia) {
        this.terapia = terapia;
    }
    public int getIdcita() {
        return this.idcita;
    }
    
    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }




}



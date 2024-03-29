package com.modelo;
// Generated 13-may-2013 15:44:06 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private int id;
     private Integer tipodocumento;
     private Long nrodocumento;
     private String nombres;
     private String apellidos;
     private String email;
     private Date fechanacimiento;
     private String telefono;
     private String direccion;
     private Integer idusurio;
    private Persona persona;

    public Persona() {
    }

	
    public Persona(int id) {
        this.id = id;
    }
    public Persona(int id, Integer tipodocumento, Long nrodocumento, String nombres, String apellidos, String email, Date fechanacimiento, String telefono, String direccion, Integer idusurio) {
       this.id = id;
       this.tipodocumento = tipodocumento;
       this.nrodocumento = nrodocumento;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.email = email;
       this.fechanacimiento = fechanacimiento;
       this.telefono = telefono;
       this.direccion = direccion;
       this.idusurio = idusurio;
    }
   public Persona getPersona(int id, Integer tipodocumento, Long nrodocumento, String nombres, String apellidos, String email, Date fechanacimiento, String telefono, String direccion, Integer idusurio, Persona persona){
         return persona;
       
   }
   public void setPersona(int id, Integer tipodocumento, Long nrodocumento, String nombres, String apellidos, String email, Date fechanacimiento, String telefono, String direccion, Integer idusurio, Persona persona){
         this.setPersona(persona);
       
   }
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getTipodocumento() {
        return this.tipodocumento;
    }
    
    public void setTipodocumento(Integer tipodocumento) {
        this.tipodocumento = tipodocumento;
    }
    public Long getNrodocumento() {
        return this.nrodocumento;
    }
    
    public void setNrodocumento(Long nrodocumento) {
        this.nrodocumento = nrodocumento;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getFechanacimiento() {
        return this.fechanacimiento;
    }
    
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Integer getIdusurio() {
        return this.idusurio;
    }
    
    public void setIdusurio(Integer idusurio) {
        this.idusurio = idusurio;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }




}



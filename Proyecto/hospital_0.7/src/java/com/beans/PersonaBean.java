/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;


import com.interfaces.interfaz_persona;
import com.implementacion.implemetacion_persona;
import com.modelo.Persona;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author carlos
 */
@ManagedBean (name="personaBean")
@SessionScoped
    public class PersonaBean implements Serializable{
    
    private Persona persona;
    private List<Persona> personas;
    
    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
        persona=new Persona();
    }
    
    public void prepararInsertar(){
        persona=new Persona();
    }
    
    public void insertar(ActionEvent actionEvent){
        System.out.print("Exito");
        interfaz_persona ip=new implemetacion_persona();
        ip.insertar(persona);
        FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage("El registro se ingreso exitosamente"));
        persona=new Persona();
    }
    
    public void prepararActualizar(Integer nrodocumento){
        System.out.print("hOLAAAAAAAAAA "+nrodocumento);
        interfaz_persona ip=new implemetacion_persona();
        persona=ip.buscarId(nrodocumento);
        //persona=new Persona();
        System.out.print("Id"+persona.getId()+"numerodoc"+persona.getNrodocumento());
    }
    
    public void actualizar(ActionEvent actionEvent){
        interfaz_persona ip=new implemetacion_persona();
        ip.actualizar(persona);
        FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage("El registro se actualizo exitosamente"));
        persona=new Persona();
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getPersonasPacientes() {
        interfaz_persona ip=new implemetacion_persona();
        personas=ip.buscarPacientes();
         System.out.print("Aqui"+personas.size());   
        personas=ip.buscarPersonasPacientes();
        return personas;
    }
    
    
    
}

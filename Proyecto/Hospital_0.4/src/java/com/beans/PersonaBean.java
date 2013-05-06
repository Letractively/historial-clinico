/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.entidades.TipoPersona;
import com.interfaces.interfaz_persona;
import com.implementacion.implemetacion_persona;
import com.modelo.Persona;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author carlos
 */
@ManagedBean (name="persona")
@RequestScoped
public class PersonaBean {
    
    private Persona persona;
    private List<Persona> personas;
    
    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
        persona=new Persona();
    }
    
    public void prepararInsertar(ActionEvent actionEvent){
        persona=new Persona();
    }
    
    public void insertar(ActionEvent actionEvent){
        interfaz_persona ip=new implemetacion_persona();
        ip.insertar(persona);
        FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage("El ingreso del medico fue exitoso"));
        
    }
    
    public void prepararActualizar(Integer id){
        interfaz_persona ip=new implemetacion_persona();
        persona=ip.buscarId(id);
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

    public List<Persona> getPersonas() {
        interfaz_persona ip=new implemetacion_persona();
        personas=ip.buscarPersonas();
        return personas;
    }
    
    
    
}

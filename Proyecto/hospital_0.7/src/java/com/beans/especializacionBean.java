/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.implementacion.implementacion_especializacion;
import com.interfaces.interfaz_especializacion;
import com.modelo.Especializacion;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author carlos
 */
@ManagedBean (name="especializacionController")
@SessionScoped
public class especializacionBean implements Serializable {
    
    private Especializacion especializacion;
    /**
     * Creates a new instance of especializacionBean
     */
    public especializacionBean() {
        especializacion = new Especializacion();
    }
    
    public void prepararInsertar(ActionEvent actionEvent){
        especializacion=new Especializacion();
    }
    
    public void insertar(ActionEvent actionEvent){
        System.out.print("Exito");
        interfaz_especializacion esp=new implementacion_especializacion();
        esp.insertar(especializacion);
        FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage("El registro se ingreso exitosamente"));
        System.out.print("Exito");
    }

    public Especializacion getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(Especializacion especializacion) {
        this.especializacion = especializacion;
    }
    
    
    public void prepararActualizar(Integer id){
        System.out.print("hOLAAAAAAAAAA "+id);
        interfaz_especializacion esp=new implementacion_especializacion();
        especializacion=esp.buscarId(id);
        //persona=new Persona();
        
    }
    
}

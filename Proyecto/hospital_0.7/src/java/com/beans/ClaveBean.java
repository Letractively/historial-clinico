/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.dao.UsuarioDao;
import com.dao.impl.UsuarioDaoImpl;
import com.modelo.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Oscar Rada
 */
@ManagedBean (name="clave")
@SessionScoped
public class ClaveBean {
    
    private String claveNueva;
    
    public String getClaveNueva() {
        return claveNueva;
    }

    public void setClaveNueva(String claveNueva) {
        this.claveNueva = claveNueva;
    }
    
    public void cambiarClave(ActionEvent actionEvent) {
        RequestContext context = RequestContext.getCurrentInstance();  
        FacesMessage msg = null;
        
        HttpSession sesion = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        Usuario usuario = (Usuario) sesion.getAttribute("Usuario");
        
        
        
    }
}

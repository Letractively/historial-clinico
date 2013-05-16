/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.dao.ClaveDao;
import com.dao.UsuarioDao;
import com.dao.impl.ClaveDaoImpl;
import com.dao.impl.UsuarioDaoImpl;
import com.modelo.Usuario;
import com.util.HibernateUtil;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Oscar Rada
 */
@ManagedBean(name = "clave")
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
        ClaveDao claveDao = new ClaveDaoImpl();
        FacesMessage msg;

        HttpSession sesion = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        Usuario usuario = (Usuario) sesion.getAttribute("Usuario");

        if (claveDao.cambiarClave(usuario.getLogin(), getClaveNueva())) {
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "La Contraseña ha sido cambiada correctamente "
                    + "para el usuario ", usuario.getLogin());
        } else {
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error de Usuario", "Contraseña Invalida");
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}

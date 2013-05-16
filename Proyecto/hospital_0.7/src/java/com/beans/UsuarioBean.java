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
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Oscar Rada
 */
@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean {

    private Usuario usuario;
    boolean loggedIn = false;
    
    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
    }

    public Usuario getUsuario() {
        if(usuario == null){
            usuario = new Usuario();
        }
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void login(ActionEvent actionEvent) {  
        RequestContext context = RequestContext.getCurrentInstance();  
        FacesMessage msg = null;
          
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        usuario = usuarioDao.buscarPorUsuario(usuario);
        
        if(usuario != null) {  
            if(usuario.getEstado() == 1){
                loggedIn = true;
                msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido ", usuario.getLogin());
            }else{
                loggedIn = false;
                msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario Inactivo", "El usuario "
                        +usuario.getLogin()+" está inactivo");
            }
        } else {  
            loggedIn = false;
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error de Usuario", "Contraseña Invalida");  
        }
        
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        context.addCallbackParam("loggedIn", loggedIn);  
        if (loggedIn)
            context.addCallbackParam("view", "layout.xhtml");
    }
    
    public void logout() {
        HttpSession session;
        session = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(false);
        session.invalidate();
        loggedIn = false;
    }
}

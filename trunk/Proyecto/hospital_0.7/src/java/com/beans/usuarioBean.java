/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.implementacion.implementacion_usuario;
import com.interfaces.interfaz_usuario;
import com.modelo.Usuario;
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
@ManagedBean (name="usuario")
@SessionScoped
public class usuarioBean implements Serializable{

    private Usuario usuario;
    /**
     * Creates a new instance of usuarioBean
     */
    public usuarioBean() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void prepararInsertar(ActionEvent actionEvent){
        usuario=new Usuario();
    }
    
    public void insertar(ActionEvent actionEvent){
        System.out.print("Exito");
        interfaz_usuario ip=new implementacion_usuario();
        ip.insertar(usuario);
        FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage("El registro se actualizo exitosamente"));
        System.out.print("Exito");
    }
    
    public void prepararActualizar(Integer id){
        interfaz_usuario ip=new implementacion_usuario();
        usuario=ip.buscarId(id);
    }
    
    public void actualizar(ActionEvent actionEvent){
        interfaz_usuario ip=new implementacion_usuario();
        ip.actualizar(usuario);
        FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage("El registro se actualizo exitosamente"));
        usuario=new Usuario();
    }
}

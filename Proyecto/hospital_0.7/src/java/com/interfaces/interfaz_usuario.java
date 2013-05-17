/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.modelo.Usuario;

/**
 *
 * @author carlos
 */
public interface interfaz_usuario {
    public void insertar(String usuario,String clave);
    public void actualizar(Usuario usuario);
    public Usuario buscarId(Integer id);
}

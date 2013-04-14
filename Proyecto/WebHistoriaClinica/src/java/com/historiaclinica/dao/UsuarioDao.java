/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.historiaclinica.dao;

import com.historiaclinica.hospital.Usuario;

/**
 *
 * @author Oscar Rada
 */
public interface UsuarioDao {
    
    public Usuario buscarPorUsuario(Usuario usuario);
    
}

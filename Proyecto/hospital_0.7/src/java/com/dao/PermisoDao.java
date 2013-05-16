/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Permiso;
import java.util.List;

/**
 *
 * @author Oscar Rada
 */
public interface PermisoDao {
    
    public void actualizar(Permiso permiso);
    public Permiso buscarPorId(Integer id);
    public List<Permiso> buscarTodos();
}

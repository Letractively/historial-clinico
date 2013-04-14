/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.historiaclinica.dao;

import com.historiaclinica.hospital.Permisosxusurio;
import java.util.List;

/**
 *
 * @author Oscar Rada
 */
public interface PermisosXUsuarioDao {
    
    public void actualizar(Permisosxusurio permisosxusurio);
    public Permisosxusurio buscarPorId(Integer id);
    public List<Permisosxusurio> buscarTodos();
}

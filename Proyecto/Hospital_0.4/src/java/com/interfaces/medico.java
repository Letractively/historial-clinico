/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.modelo.Medico;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface medico {
    public void insertar(Medico medico);
    public void actualizar(Medico medico);
    public void eliminar(Medico medico);
    public Medico buscarId(Integer id);
    public List<Medico> buscarMedicos();
}

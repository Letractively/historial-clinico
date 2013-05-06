/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.modelo.Persona;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface pacientes {
    public void insertar(Persona persona);
    public void actualizar(Persona persona);
    public void eliminar(Persona persona);
    public Persona buscarId(Integer id);
    public List<Persona> buscarPersonas();
}

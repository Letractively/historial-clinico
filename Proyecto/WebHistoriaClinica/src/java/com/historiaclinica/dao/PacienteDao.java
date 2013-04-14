/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.historiaclinica.dao;

import com.historiaclinica.hospital.Paciente;
import java.util.List;

/**
 *
 * @author Oscar Rada
 */
public interface PacienteDao {
    
    public void insertar(Paciente paciente);
    public void actualizar(Paciente paciente);
    public void deshabilitar(Paciente paciente);
    public Paciente buscarPorId(Integer id);
    public List<Paciente> buscarTodos();
}

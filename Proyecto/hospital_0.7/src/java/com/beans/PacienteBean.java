/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.implementacion.ImplemePaciente;
import com.interfaces.paciente;
import com.modelo.Paciente;
import com.modelo.Persona;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author carlos
 */
@ManagedBean (name="pacienteController")
@SessionScoped
public class PacienteBean implements Serializable{
    
    private Persona persona;
    private Paciente paciente;

    /**
     * Creates a new instance of PacienteBean
     */
    public PacienteBean() {
        persona=new Persona();
        paciente=new Paciente();
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void insertar(){
        paciente p=new ImplemePaciente();
        p.insertar(persona, paciente);
    }
    
    
}

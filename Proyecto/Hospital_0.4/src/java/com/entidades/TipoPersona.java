/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

/**
 *
 * @author carlos
 */
public enum TipoPersona {
    M("medico"),
    P("paciente");
    private final String label;
    
    private TipoPersona(String label){
        this.label=label;
    }
    
    public String getLabel(){
        return label;
    }
}

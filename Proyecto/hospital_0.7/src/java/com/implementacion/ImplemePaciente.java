/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacion;

import com.interfaces.paciente;
import com.modelo.Paciente;
import com.modelo.Persona;
import com.util.HibernateUtil;
import org.hibernate.Session;



/**
 *
 * @author carlos
 */
public class ImplemePaciente implements paciente{

    @Override
    public void insertar(Persona persona, Paciente paciente) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(persona);
            session.save(paciente);
            session.beginTransaction().commit();
        }catch(Exception e) {
            System.out.print("Error en actualizar: "+e.getMessage());
            session.beginTransaction().rollback();
            
        }
        
    }
    
}

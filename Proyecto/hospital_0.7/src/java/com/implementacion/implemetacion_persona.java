/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacion;

import com.util.HibernateUtil;
import com.interfaces.interfaz_persona;
import com.modelo.Persona;
import com.modelo.Paciente;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author carlos
 */
public class implemetacion_persona implements interfaz_persona{
    
    

    @Override
    public void insertar(Persona persona) {
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            System.out.print("persona "+persona);
            session.save(persona);
            session.beginTransaction().commit();
        } catch (Exception e) {
            System.out.print("Error en inserta: "+e.getMessage());
            session.beginTransaction().rollback();
        
        }
        
        /*Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        if((id!=null)&&(id!=0)){*/
        
    }

    
    @Override
    public void actualizar(Persona persona) {
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        try {
            
            session.beginTransaction();
            session.update(persona);
            session.beginTransaction().commit();
        } catch (Exception e) {
            System.out.print("Error en actualizar: "+e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public void eliminar(Persona persona) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        /*Session session=HibernateUtil.getSessionFactory().openSession();*/
        try {
            session.beginTransaction();
            session.delete(persona);
            session.beginTransaction().commit();
        } catch (Exception e) {
        }    
    }

    @Override
    public Persona buscarId(Integer id) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        //System.out.print("hOLAAAAAAAAAA");
        return (Persona) session.load(Persona.class, id);
    }

    @Override
    public List<Persona> buscarPacientes() {
        Session session;
        session = HibernateUtil.getSessionFactory().openSession();
        return  session.createQuery("from Persona").list();
    }
    
    @Override
    public List<Persona> buscarPersonasPacientes() {
        Session session;
        session = HibernateUtil.getSessionFactory().openSession();
        return  session.createQuery("from Persona e "
                + "where e.id IN (select a.idpersona from Paciente a)").list();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.historiaclinica.dao.impl;

import com.historiaclinica.dao.PacienteDao;
import com.historiaclinica.hospital.Paciente;
import com.historiaclinica.util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author Oscar Rada
 */
public class PacienteDaoImpl implements PacienteDao{

    @Override
    public void insertar(Paciente paciente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(paciente);
            session.beginTransaction().commit();
        }catch (Exception e){
            System.out.println("Error en insertar: "+e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public void actualizar(Paciente paciente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(paciente);
            session.beginTransaction().commit();
        }catch (Exception e){
            System.out.println("Error en actualizar: "+e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public void deshabilitar(Paciente paciente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(paciente);
            session.beginTransaction().commit();
        }catch (Exception e){
            System.out.println("Error en deshabilitar: "+e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public Paciente buscarPorId(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Paciente) session.load(Paciente.class, id);
    }

    @Override
    public List<Paciente> buscarTodos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from Paciente").list();
    }
    
}

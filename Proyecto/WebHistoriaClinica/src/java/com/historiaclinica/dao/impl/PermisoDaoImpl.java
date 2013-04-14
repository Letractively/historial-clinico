/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.historiaclinica.dao.impl;

import com.historiaclinica.dao.PermisoDao;
import com.historiaclinica.hospital.Permiso;
import com.historiaclinica.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Oscar Rada
 */
public class PermisoDaoImpl implements PermisoDao{

    @Override
    public void actualizar(Permiso permiso) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(permiso);
            session.beginTransaction();
        } catch (Exception e) {
            System.out.println("Error en actualizar perfil"+e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public Permiso buscarPorId(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Permiso) session.load(Permiso.class, id);
    }

    @Override
    public List<Permiso> buscarTodos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from permiso").list();
    }
    
}

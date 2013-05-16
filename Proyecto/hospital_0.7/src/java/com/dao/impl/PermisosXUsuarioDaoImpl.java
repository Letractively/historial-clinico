/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.PermisosXUsuarioDao;
import com.modelo.Permisosxusurio;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Oscar Rada
 */
public class PermisosXUsuarioDaoImpl implements PermisosXUsuarioDao{

    @Override
    public void actualizar(Permisosxusurio permisosxusurio) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(permisosxusurio);
            session.beginTransaction();
        } catch (Exception e) {
            System.out.println("Error en actualizar perfil"+e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public Permisosxusurio buscarPorId(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Permisosxusurio) session.load(PermisosXUsuarioDao.class, id);
    }

    @Override
    public List<Permisosxusurio> buscarTodos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from permisosxusuario").list();
    }
    
}

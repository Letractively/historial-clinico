/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacion;

import com.interfaces.interfaz_usuario;
import com.modelo.Usuario;
import com.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author carlos
 */
public class implementacion_usuario implements  interfaz_usuario{

    @Override
    public void insertar(String usuario ,String clave) {
        int executeUpdate = 0;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();           
            session.save(usuario);
            String sql;
            sql = "update Usuario u "
                    + "set clave = md5(:pass) "
                    + "where login = :user ";
            Query query = session.createQuery(sql);
            query.setString("user", usuario);
            query.setString("pass", clave);
            executeUpdate = query.executeUpdate();
            session.beginTransaction().commit();
        } catch (Exception e) {
        
        }
    }

    @Override
    public void actualizar(Usuario usuario) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();           
            session.update(usuario);
            session.beginTransaction().commit();
        } catch (Exception e) {
        
        }
    }
    
    @Override
    public Usuario buscarId(Integer id) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        return (Usuario) session.load(Usuario.class, id);
    }
    
}

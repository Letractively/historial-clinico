/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.ClaveDao;
import com.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;


public class ClaveDaoImpl implements ClaveDao {

    @Override
    public boolean cambiarClave(String usuario,String clave) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        int executeUpdate = 0;
        try {
            String sql;
            sql = "update Usuario u "
                    + "set clave = md5(:pass) "
                    + "where login = :user ";
            Query query = session.createQuery(sql);
            query.setString("user", usuario);
            query.setString("pass", clave);
            executeUpdate = query.executeUpdate();
        } catch (Exception e) {
            System.err.println("Problemas en el cambio de clave");
        }
        if(executeUpdate == 1)
            return true;
        else
            return false;
    }
    
}

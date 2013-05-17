/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.UsuarioDao;
import com.modelo.Usuario;
import com.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Oscar Rada
 */
public class UsuarioDaoImpl implements UsuarioDao{

    @Override
    public Usuario buscarPorUsuario(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String sql;
        sql = "select u from Usuario u "
                + "where login = :user "
                + "and clave = md5(:pass)";
        Query query = session.createQuery(sql);
        query.setString("user", usuario.getLogin());
        query.setString("pass", usuario.getClave());
        return (Usuario) query.uniqueResult();
    }
    
    
    
}

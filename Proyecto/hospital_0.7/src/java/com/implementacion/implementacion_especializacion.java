/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacion;

import com.interfaces.interfaz_especializacion;
import com.modelo.Especializacion;
import com.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author carlos
 */
public class implementacion_especializacion implements interfaz_especializacion{

    @Override
    public void insertar(Especializacion especializacion) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(especializacion);
            session.beginTransaction().commit();
        } catch (Exception e) {
        
        }
    }
    
}

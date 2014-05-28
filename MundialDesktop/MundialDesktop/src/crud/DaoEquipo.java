/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.ArrayList;
import java.util.List;
import modelo.Equipo;
import modelo.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author elivar
 */
public class DaoEquipo implements DaoGeneric {

    @Override
    public void guardar(Equipo equipo) {
        int id;
        id = generarId();
        equipo.setEquipo(id);
        Transaction tr = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tr = session.beginTransaction();
        session.save(equipo);
        session.getTransaction().commit();
    }

    @Override
    public void editar(Equipo equipo) {

        Transaction tr = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tr = session.beginTransaction();
        session.update(equipo);
        session.getTransaction().commit();
    }

    @Override
    public void eliminar(Equipo equipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Equipo> listaEquipo(boolean tipoBusqueda) {
       
       String busqueda="from Equipo as p order by p.rankingfifa asc";
        
       if (tipoBusqueda) {
            busqueda="from Equipo as p order by p.id desc";
        }
        List<Equipo> equipos = new ArrayList<Equipo>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            equipos = session.createQuery(busqueda).list();
        } catch (HibernateException e) {
        } finally {
            session.flush();
            session.close();
        }
        return equipos;
    }

    public int generarId() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trns = null;
        List<Equipo> lista;
        trns = session.beginTransaction();
        lista =  session.createQuery("from Equipo as p order by p.id desc").list();
        if (lista.isEmpty()) {
            return 1;
        }
        return lista.get(0).getEquipo() + 1;
    }


}

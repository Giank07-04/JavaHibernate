/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Contacto;

/**
 *
 * @author DAMIAN
 */
public class ContactoDAO extends GenericDAO {
    public List<Contacto> listar() {
        String consulta = "SELECT c FROM Contacto c";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();

    }

    public void insertar(Contacto contacto) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contacto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
       public void actualizar(Contacto contacto) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(contacto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } 
        finally {
            if (em != null) {
                em.close();
            }
        }
    }
       
        public void eliminar(Contacto contacto ){
         try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(contacto));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } 
          finally {
            if (em != null) {
                em.close();
            }
        }
    }
        
     public Contacto buscarPorId(Contacto p){
       return  em.find(Contacto.class, p.getIdContacto());
    }
}


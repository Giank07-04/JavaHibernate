package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Alumno;

public abstract class GenericDAO {

    protected static  EntityManager em;
    private static EntityManagerFactory emf;
    private static final String PU ="HibernateJpaPU";

    public GenericDAO() {

        if(emf == null){
            emf = Persistence.createEntityManagerFactory(PU);
            
        }

    }

    protected EntityManager getEntityManager(){
        if(em == null){
            em = emf.createEntityManager();
        }
        return em;
    }
}
//     public void listar() {
//        String hql = "SELECT p FROM alumno p";
//        Query query = em.createQuery(hql);
//        List<Alumno> alumnos = query.getResultList();
//        for (Alumno p : alumnos) {
//            System.out.println("p =" + p);
//        }
//    }
//}
//   
//    public void insertar(Persona persona) {
//
//        try {
//            em.getTransaction().begin();
//            em.persist(persona);
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            ex.printStackTrace(System.out);
//            em.getTransaction().rollback();
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }
//    }
//    
//     public void modificar(Persona persona) {
//
//        try {
//            em.getTransaction().begin();
//            em.merge(persona);
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            ex.printStackTrace(System.out);
//            em.getTransaction().rollback();
//        } 
////        finally {
////            if (em != null) {
////                em.close();
////            }
////        }
//    }
//     
//    public Persona buscarPersonaPorId(Persona p){
//       return  em.find(Persona.class, p.getIdPersona());
//    }
//    
//    public void eliminar(Persona persona ){
//         try {
//            em.getTransaction().begin();
//            em.remove(em.merge(persona));
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            ex.printStackTrace(System.out);
//            em.getTransaction().rollback();
//        } 
//    }
//    
//}

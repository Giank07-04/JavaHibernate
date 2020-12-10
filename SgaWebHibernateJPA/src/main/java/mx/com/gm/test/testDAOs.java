
package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.dao.AsignacionDAO;
import mx.com.gm.dao.ContactoDAO;
import mx.com.gm.dao.CursoDAO;
import mx.com.gm.dao.DomicilioDAO;


public class testDAOs {
    public static void main(String[] args) {
        
        AlumnoDAO alumnoDao = new AlumnoDAO();
        System.out.println("ALumnos: ");
        imprimir(alumnoDao.listar());
        
        
        System.out.println("Domicilios:");
        DomicilioDAO domicilioDao= new DomicilioDAO();
        imprimir(domicilioDao.listar());
        
        System.out.println("Contacto:");
        ContactoDAO contactoDao= new ContactoDAO();
        imprimir(contactoDao.listar());
        
        System.out.println("Cursos:");
        CursoDAO cursosDao= new CursoDAO();
        imprimir(cursosDao.listar());
        
        System.out.println("Asignacion:");
        AsignacionDAO asignacionDao= new AsignacionDAO();
        imprimir(asignacionDao.listar());
    }
    
    private static void imprimir(List coleccion){
        for(Object o: coleccion){
            System.out.println("valor: "+o);
        }
    }
}
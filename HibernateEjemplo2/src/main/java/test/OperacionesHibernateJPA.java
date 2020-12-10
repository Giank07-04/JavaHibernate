/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

/**
 *
 * @author DAMIAN
 */
public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.listar();
        
        Persona persona = new Persona();
      
        persona.setIdPersona(5);
        
        persona = personaDao.buscarPersonaPorId(persona);
       System.out.println("Persona Encontrada = "+persona);
        
        //persona.setNombre("Oscar");
        persona.setApellido("Mirko");
       persona.setEmail("OMirko@mail.com");
        //persona.setTelefono("55443322");
        
        
        //personaDao.insertar(persona);
      // personaDao.modificar(persona);
        personaDao.eliminar(persona);
        personaDao.listar();
                
    }
}

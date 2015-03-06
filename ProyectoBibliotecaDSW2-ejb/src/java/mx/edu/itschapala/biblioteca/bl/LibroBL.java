/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.LibroDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Libro;

/**
 *
 * @author Estudiante
 */
@Stateless
public class LibroBL implements LibroBLLocal {
    @EJB
    private LibroDaoLocal libroDao;
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean registrar(Libro libro) {
        libroDao.crear(libro);
        return true;
    }

    @Override
    public boolean eliminar(Libro libro) {
        libroDao.eliminar(libro);
        return true;
    }

    @Override
    public boolean modificar(Libro libro) {
        libroDao.editar(libro);
        return true;
    }

    @Override
    public List<Libro> getLista() {
        return libroDao.buscarTodo();
    }

    @Override
    public Libro getPorId(int id) {
        return libroDao.buscarPorId(id);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.AutorDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Autor;

/**
 *
 * @author Estudiante
 */
@Stateless
public class AutorBL implements AutorBLLocal {
    @EJB
    private AutorDaoLocal autorDao;

    @Override
    public boolean registrar(Autor autor) {
        autorDao.crear(autor);
        return true;
         }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

   

    @Override
    public boolean modificar(Autor autor) {
        autorDao.editar(autor);
        return false;
    }

    @Override
    public List<Autor> getlista() {
        return autorDao.buscarTodo();
    }

    @Override
    public Autor getPorId(int id) {
        return autorDao.buscarPorId(id);
    }

    @Override
    public boolean eliminar(Autor autor) {
        autorDao.eliminar(autor);
        return true;
    }
}

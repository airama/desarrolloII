/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.CategoriaDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Categoria;

/**
 *
 * @author Estudiante
 */
@Stateless
public class CategoriaBL implements CategoriaBLLocal {
    @EJB
    private CategoriaDaoLocal categoriaDao;

    @Override
    public boolean registrar(Categoria categoria) {
        categoriaDao.crear(categoria);
        return false;
    }
    

    // Add business logic below. (Right-click in editor and choose
    
    // "Insert Code > Add Business Method")

   

    @Override
    public boolean eliminar(Categoria categoria) {
        categoriaDao.eliminar(categoria);
        return true;
    }

    @Override
    public boolean modificar(Categoria categoria) {
        categoriaDao.editar(categoria);
        return true;
    }

    @Override
    public List<Categoria> getLista() {
        return categoriaDao.buscarTodo();
    }

    @Override
    public Categoria getPorId(int id) {
        return categoriaDao.buscarPorId(id);
    }

    
    
}

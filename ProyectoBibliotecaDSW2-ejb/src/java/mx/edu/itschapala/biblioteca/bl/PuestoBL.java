/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.PuestoDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Puesto;

/**
 *
 * @author Estudiante
 */
@Stateless
public class PuestoBL implements PuestoBLLocal {
    @EJB
    private PuestoDaoLocal puestoDao;
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean registrar(Puesto puesto) {
        puestoDao.crear(puesto);
        return true;
    }

    @Override
    public boolean eliminar(Puesto puesto) {
        puestoDao.eliminar(puesto);
        return true;
    }

    @Override
    public boolean modificar(Puesto puesto) {
        puestoDao.editar(puesto);
        return true;
    }

    @Override
    public List<Puesto> getLista() {
        return puestoDao.buscarTodo();
    }

    @Override
    public Puesto getPorId(int id) {
        return puestoDao.buscarPorId(id);
    }
    
    
}

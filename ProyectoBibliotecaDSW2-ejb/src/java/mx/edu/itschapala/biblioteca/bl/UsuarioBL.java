/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.UsuarioDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Usuario;

/**
 *
 * @author Estudiante
 */
@Stateless
public class UsuarioBL implements UsuarioBLLocal {
    @EJB
    private UsuarioDaoLocal usuarioDao;
    
   

    @Override
    public boolean registrar(Usuario usuario) {
        usuarioDao.crear(usuario);
        return true;
    }

    @Override
    public boolean eliminar(Usuario usuario) {
        usuarioDao.eliminar(usuario);
        return true;
    }

    @Override
    public boolean modificar(Usuario usuario) {
        usuarioDao.editar(usuario);
        return true;
    }

    @Override
    public List<Usuario> getLista() {
        return usuarioDao.buscarTodo();
    }

    @Override
    public Usuario getPorId(int id) {
        return usuarioDao.buscarPorId(id);
    }
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Categorialibro;

/**
 *
 * @author Estudiante
 */
@Local
public interface CategorialibroDaoLocal {

    void crear(Categorialibro categorialibro);

    void editar(Categorialibro categorialibro);

    void borrar(Categorialibro categorialibro);

    Categorialibro buscarPorId(Object id);

    List<Categorialibro> buscarTodo();

    List<Categorialibro> buscarEnRango(int[] range);

    int contar();
    
}

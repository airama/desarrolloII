/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Autor;

/**
 *
 * @author Estudiante
 */
@Local
public interface AutorBLLocal {

    boolean registrar(Autor autor);

    boolean eliminar(Autor autor);

    boolean modificar(Autor autor);

    List<Autor> getlista();

    Autor getPorId(int id);

    
}

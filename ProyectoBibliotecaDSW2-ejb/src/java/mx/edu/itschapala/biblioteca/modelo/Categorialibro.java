/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.biblioteca.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Estudiante
 */
@Entity
@Table(name = "categorialibro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorialibro.findAll", query = "SELECT c FROM Categorialibro c"),
    @NamedQuery(name = "Categorialibro.findByIdLC", query = "SELECT c FROM Categorialibro c WHERE c.idLC = :idLC")})
public class Categorialibro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id L-C")
    private Integer idLC;
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria")
    @ManyToOne(optional = false)
    private Categoria idCategoria;
    @JoinColumn(name = "idlibro", referencedColumnName = "idlibro")
    @ManyToOne(optional = false)
    private Libro idlibro;

    public Categorialibro() {
    }

    public Categorialibro(Integer idLC) {
        this.idLC = idLC;
    }

    public Integer getIdLC() {
        return idLC;
    }

    public void setIdLC(Integer idLC) {
        this.idLC = idLC;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Libro getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(Libro idlibro) {
        this.idlibro = idlibro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLC != null ? idLC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorialibro)) {
            return false;
        }
        Categorialibro other = (Categorialibro) object;
        if ((this.idLC == null && other.idLC != null) || (this.idLC != null && !this.idLC.equals(other.idLC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.itschapala.biblioteca.Categorialibro[ idLC=" + idLC + " ]";
    }
    
}

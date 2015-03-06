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
@Table(name = "autorlibro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autorlibro.findAll", query = "SELECT a FROM Autorlibro a"),
    @NamedQuery(name = "Autorlibro.findByIdlA", query = "SELECT a FROM Autorlibro a WHERE a.idlA = :idlA")})
public class Autorlibro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDL-A")
    private Integer idlA;
    @JoinColumn(name = "idAutor", referencedColumnName = "idAutor")
    @ManyToOne(optional = false)
    private Autor idAutor;
    @JoinColumn(name = "idlibro", referencedColumnName = "idlibro")
    @ManyToOne(optional = false)
    private Libro idlibro;

    public Autorlibro() {
    }

    public Autorlibro(Integer idlA) {
        this.idlA = idlA;
    }

    public Integer getIdlA() {
        return idlA;
    }

    public void setIdlA(Integer idlA) {
        this.idlA = idlA;
    }

    public Autor getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Autor idAutor) {
        this.idAutor = idAutor;
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
        hash += (idlA != null ? idlA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autorlibro)) {
            return false;
        }
        Autorlibro other = (Autorlibro) object;
        if ((this.idlA == null && other.idlA != null) || (this.idlA != null && !this.idlA.equals(other.idlA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.itschapala.biblioteca.Autorlibro[ idlA=" + idlA + " ]";
    }
    
}

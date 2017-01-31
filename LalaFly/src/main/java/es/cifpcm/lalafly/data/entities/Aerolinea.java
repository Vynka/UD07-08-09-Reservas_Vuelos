/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.lalafly.data.entities;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 2dawb
 */
@Entity
@Table(name = "aerolinea")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aerolinea.findAll", query = "SELECT a FROM Aerolinea a"),
    @NamedQuery(name = "Aerolinea.findByIdAerolinea", query = "SELECT a FROM Aerolinea a WHERE a.idAerolinea = :idAerolinea"),
    @NamedQuery(name = "Aerolinea.findByCodigo", query = "SELECT a FROM Aerolinea a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Aerolinea.findByNombre", query = "SELECT a FROM Aerolinea a WHERE a.nombre = :nombre")})
public class Aerolinea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAerolinea")
    private Integer idAerolinea;
    @Size(max = 3)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "idVueloGenerico", referencedColumnName = "idVueloGenerico")
    @ManyToOne
    private VueloGenerico idVueloGenerico;

    public Aerolinea() {
    }

    public Aerolinea(Integer idAerolinea) {
        this.idAerolinea = idAerolinea;
    }

    public Integer getIdAerolinea() {
        return idAerolinea;
    }

    public void setIdAerolinea(Integer idAerolinea) {
        this.idAerolinea = idAerolinea;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public VueloGenerico getIdVueloGenerico() {
        return idVueloGenerico;
    }

    public void setIdVueloGenerico(VueloGenerico idVueloGenerico) {
        this.idVueloGenerico = idVueloGenerico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAerolinea != null ? idAerolinea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aerolinea)) {
            return false;
        }
        Aerolinea other = (Aerolinea) object;
        if ((this.idAerolinea == null && other.idAerolinea != null) || (this.idAerolinea != null && !this.idAerolinea.equals(other.idAerolinea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.cifpcm.lalafly.data.entities.Aerolinea[ idAerolinea=" + idAerolinea + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.lalafly.data.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 2dawb
 */
@Entity
@Table(name = "vuelo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vuelo.findAll", query = "SELECT v FROM Vuelo v"),
    @NamedQuery(name = "Vuelo.findByIdVuelo", query = "SELECT v FROM Vuelo v WHERE v.idVuelo = :idVuelo"),
    @NamedQuery(name = "Vuelo.findByFecha", query = "SELECT v FROM Vuelo v WHERE v.fecha = :fecha"),
    @NamedQuery(name = "Vuelo.findByPlazasLibres", query = "SELECT v FROM Vuelo v WHERE v.plazasLibres = :plazasLibres")})
public class Vuelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVuelo")
    private Integer idVuelo;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "plazasLibres")
    private Integer plazasLibres;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVuelo")
    private Collection<Reservas> reservasCollection;
    @JoinColumn(name = "idVueloGenerico", referencedColumnName = "idVueloGenerico")
    @ManyToOne(optional = false)
    private VueloGenerico idVueloGenerico;

    public Vuelo() {
    }

    public Vuelo(Integer idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Integer getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Integer idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getPlazasLibres() {
        return plazasLibres;
    }

    public void setPlazasLibres(Integer plazasLibres) {
        this.plazasLibres = plazasLibres;
    }

    @XmlTransient
    public Collection<Reservas> getReservasCollection() {
        return reservasCollection;
    }

    public void setReservasCollection(Collection<Reservas> reservasCollection) {
        this.reservasCollection = reservasCollection;
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
        hash += (idVuelo != null ? idVuelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vuelo)) {
            return false;
        }
        Vuelo other = (Vuelo) object;
        if ((this.idVuelo == null && other.idVuelo != null) || (this.idVuelo != null && !this.idVuelo.equals(other.idVuelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.cifpcm.lalafly.data.entities.Vuelo[ idVuelo=" + idVuelo + " ]";
    }
    
}

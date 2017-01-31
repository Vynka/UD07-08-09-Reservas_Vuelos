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
@Table(name = "vueloGenerico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VueloGenerico.findAll", query = "SELECT v FROM VueloGenerico v"),
    @NamedQuery(name = "VueloGenerico.findByNVuelo", query = "SELECT v FROM VueloGenerico v WHERE v.nVuelo = :nVuelo"),
    @NamedQuery(name = "VueloGenerico.findByHoraSalida", query = "SELECT v FROM VueloGenerico v WHERE v.horaSalida = :horaSalida"),
    @NamedQuery(name = "VueloGenerico.findByHoraLlegada", query = "SELECT v FROM VueloGenerico v WHERE v.horaLlegada = :horaLlegada"),
    @NamedQuery(name = "VueloGenerico.findByPrecio", query = "SELECT v FROM VueloGenerico v WHERE v.precio = :precio"),
    @NamedQuery(name = "VueloGenerico.findByCapacidad", query = "SELECT v FROM VueloGenerico v WHERE v.capacidad = :capacidad"),
    @NamedQuery(name = "VueloGenerico.findByIdVueloGenerico", query = "SELECT v FROM VueloGenerico v WHERE v.idVueloGenerico = :idVueloGenerico")})
public class VueloGenerico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "nVuelo")
    private Integer nVuelo;
    @Column(name = "horaSalida")
    @Temporal(TemporalType.TIME)
    private Date horaSalida;
    @Column(name = "horaLlegada")
    @Temporal(TemporalType.TIME)
    private Date horaLlegada;
    @Column(name = "precio")
    private Long precio;
    @Column(name = "capacidad")
    private Integer capacidad;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVueloGenerico")
    private Integer idVueloGenerico;
    @OneToMany(mappedBy = "idVueloGenerico")
    private Collection<Aerolinea> aerolineaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVueloGenerico")
    private Collection<Reservas> reservasCollection;
    @JoinColumn(name = "idDestino", referencedColumnName = "idAeropuerto")
    @ManyToOne(optional = false)
    private Aeropuerto idDestino;
    @JoinColumn(name = "idOrigen", referencedColumnName = "idAeropuerto")
    @ManyToOne(optional = false)
    private Aeropuerto idOrigen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVueloGenerico")
    private Collection<Vuelo> vueloCollection;

    public VueloGenerico() {
    }

    public VueloGenerico(Integer idVueloGenerico) {
        this.idVueloGenerico = idVueloGenerico;
    }

    public Integer getNVuelo() {
        return nVuelo;
    }

    public void setNVuelo(Integer nVuelo) {
        this.nVuelo = nVuelo;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getIdVueloGenerico() {
        return idVueloGenerico;
    }

    public void setIdVueloGenerico(Integer idVueloGenerico) {
        this.idVueloGenerico = idVueloGenerico;
    }

    @XmlTransient
    public Collection<Aerolinea> getAerolineaCollection() {
        return aerolineaCollection;
    }

    public void setAerolineaCollection(Collection<Aerolinea> aerolineaCollection) {
        this.aerolineaCollection = aerolineaCollection;
    }

    @XmlTransient
    public Collection<Reservas> getReservasCollection() {
        return reservasCollection;
    }

    public void setReservasCollection(Collection<Reservas> reservasCollection) {
        this.reservasCollection = reservasCollection;
    }

    public Aeropuerto getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(Aeropuerto idDestino) {
        this.idDestino = idDestino;
    }

    public Aeropuerto getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Aeropuerto idOrigen) {
        this.idOrigen = idOrigen;
    }

    @XmlTransient
    public Collection<Vuelo> getVueloCollection() {
        return vueloCollection;
    }

    public void setVueloCollection(Collection<Vuelo> vueloCollection) {
        this.vueloCollection = vueloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVueloGenerico != null ? idVueloGenerico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VueloGenerico)) {
            return false;
        }
        VueloGenerico other = (VueloGenerico) object;
        if ((this.idVueloGenerico == null && other.idVueloGenerico != null) || (this.idVueloGenerico != null && !this.idVueloGenerico.equals(other.idVueloGenerico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.cifpcm.lalafly.data.entities.VueloGenerico[ idVueloGenerico=" + idVueloGenerico + " ]";
    }
    
}

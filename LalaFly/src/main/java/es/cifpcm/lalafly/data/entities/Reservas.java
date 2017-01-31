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
@Table(name = "reservas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservas.findAll", query = "SELECT r FROM Reservas r"),
    @NamedQuery(name = "Reservas.findByIdReservas", query = "SELECT r FROM Reservas r WHERE r.idReservas = :idReservas"),
    @NamedQuery(name = "Reservas.findByNReserva", query = "SELECT r FROM Reservas r WHERE r.nReserva = :nReserva"),
    @NamedQuery(name = "Reservas.findByNombre", query = "SELECT r FROM Reservas r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Reservas.findByApellido1", query = "SELECT r FROM Reservas r WHERE r.apellido1 = :apellido1"),
    @NamedQuery(name = "Reservas.findByApellido2", query = "SELECT r FROM Reservas r WHERE r.apellido2 = :apellido2"),
    @NamedQuery(name = "Reservas.findByTelefono", query = "SELECT r FROM Reservas r WHERE r.telefono = :telefono"),
    @NamedQuery(name = "Reservas.findByTarjeta", query = "SELECT r FROM Reservas r WHERE r.tarjeta = :tarjeta"),
    @NamedQuery(name = "Reservas.findByImporte", query = "SELECT r FROM Reservas r WHERE r.importe = :importe")})
public class Reservas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReservas")
    private Integer idReservas;
    @Column(name = "nReserva")
    private Integer nReserva;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "apellido1")
    private String apellido1;
    @Size(max = 45)
    @Column(name = "apellido2")
    private String apellido2;
    @Column(name = "telefono")
    private Integer telefono;
    @Column(name = "tarjeta")
    private Integer tarjeta;
    @Column(name = "importe")
    private Long importe;
    @JoinColumn(name = "idVueloGenerico", referencedColumnName = "idVueloGenerico")
    @ManyToOne(optional = false)
    private VueloGenerico idVueloGenerico;
    @JoinColumn(name = "idVuelo", referencedColumnName = "idVuelo")
    @ManyToOne(optional = false)
    private Vuelo idVuelo;

    public Reservas() {
    }

    public Reservas(Integer idReservas) {
        this.idReservas = idReservas;
    }

    public Integer getIdReservas() {
        return idReservas;
    }

    public void setIdReservas(Integer idReservas) {
        this.idReservas = idReservas;
    }

    public Integer getNReserva() {
        return nReserva;
    }

    public void setNReserva(Integer nReserva) {
        this.nReserva = nReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Integer tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Long getImporte() {
        return importe;
    }

    public void setImporte(Long importe) {
        this.importe = importe;
    }

    public VueloGenerico getIdVueloGenerico() {
        return idVueloGenerico;
    }

    public void setIdVueloGenerico(VueloGenerico idVueloGenerico) {
        this.idVueloGenerico = idVueloGenerico;
    }

    public Vuelo getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Vuelo idVuelo) {
        this.idVuelo = idVuelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReservas != null ? idReservas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservas)) {
            return false;
        }
        Reservas other = (Reservas) object;
        if ((this.idReservas == null && other.idReservas != null) || (this.idReservas != null && !this.idReservas.equals(other.idReservas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.cifpcm.lalafly.data.entities.Reservas[ idReservas=" + idReservas + " ]";
    }
    
}

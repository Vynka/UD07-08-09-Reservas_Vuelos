/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.lalafly.data.entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 2dawb
 */
@Entity
@Table(name = "aeropuerto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aeropuerto.findAll", query = "SELECT a FROM Aeropuerto a"),
    @NamedQuery(name = "Aeropuerto.findByIdAeropuerto", query = "SELECT a FROM Aeropuerto a WHERE a.idAeropuerto = :idAeropuerto"),
    @NamedQuery(name = "Aeropuerto.findByCodigo", query = "SELECT a FROM Aeropuerto a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Aeropuerto.findByNombre", query = "SELECT a FROM Aeropuerto a WHERE a.nombre = :nombre")})
public class Aeropuerto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAeropuerto")
    private Integer idAeropuerto;
    @Size(max = 3)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "idCiudad", referencedColumnName = "idCiudad")
    @ManyToOne(optional = false)
    private Ciudad idCiudad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDestino")
    private Collection<VueloGenerico> vueloGenericoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrigen")
    private Collection<VueloGenerico> vueloGenericoCollection1;

    public Aeropuerto() {
    }

    public Aeropuerto(Integer idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public Integer getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(Integer idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
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

    public Ciudad getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Ciudad idCiudad) {
        this.idCiudad = idCiudad;
    }

    @XmlTransient
    public Collection<VueloGenerico> getVueloGenericoCollection() {
        return vueloGenericoCollection;
    }

    public void setVueloGenericoCollection(Collection<VueloGenerico> vueloGenericoCollection) {
        this.vueloGenericoCollection = vueloGenericoCollection;
    }

    @XmlTransient
    public Collection<VueloGenerico> getVueloGenericoCollection1() {
        return vueloGenericoCollection1;
    }

    public void setVueloGenericoCollection1(Collection<VueloGenerico> vueloGenericoCollection1) {
        this.vueloGenericoCollection1 = vueloGenericoCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAeropuerto != null ? idAeropuerto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aeropuerto)) {
            return false;
        }
        Aeropuerto other = (Aeropuerto) object;
        if ((this.idAeropuerto == null && other.idAeropuerto != null) || (this.idAeropuerto != null && !this.idAeropuerto.equals(other.idAeropuerto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.cifpcm.lalafly.data.entities.Aeropuerto[ idAeropuerto=" + idAeropuerto + " ]";
    }
    
}

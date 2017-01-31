package es.cifpcm.lalafly.data.entities;

import es.cifpcm.lalafly.data.entities.Aerolinea;
import es.cifpcm.lalafly.data.entities.Aeropuerto;
import es.cifpcm.lalafly.data.entities.Reservas;
import es.cifpcm.lalafly.data.entities.Vuelo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-01-31T16:44:20")
@StaticMetamodel(VueloGenerico.class)
public class VueloGenerico_ { 

    public static volatile SingularAttribute<VueloGenerico, Long> precio;
    public static volatile CollectionAttribute<VueloGenerico, Vuelo> vueloCollection;
    public static volatile SingularAttribute<VueloGenerico, Aeropuerto> idOrigen;
    public static volatile SingularAttribute<VueloGenerico, Date> horaLlegada;
    public static volatile CollectionAttribute<VueloGenerico, Aerolinea> aerolineaCollection;
    public static volatile CollectionAttribute<VueloGenerico, Reservas> reservasCollection;
    public static volatile SingularAttribute<VueloGenerico, Integer> nVuelo;
    public static volatile SingularAttribute<VueloGenerico, Integer> idVueloGenerico;
    public static volatile SingularAttribute<VueloGenerico, Date> horaSalida;
    public static volatile SingularAttribute<VueloGenerico, Aeropuerto> idDestino;
    public static volatile SingularAttribute<VueloGenerico, Integer> capacidad;

}
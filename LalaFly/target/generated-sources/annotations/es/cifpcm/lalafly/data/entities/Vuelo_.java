package es.cifpcm.lalafly.data.entities;

import es.cifpcm.lalafly.data.entities.Reservas;
import es.cifpcm.lalafly.data.entities.VueloGenerico;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-01-31T16:44:20")
@StaticMetamodel(Vuelo.class)
public class Vuelo_ { 

    public static volatile SingularAttribute<Vuelo, Date> fecha;
    public static volatile CollectionAttribute<Vuelo, Reservas> reservasCollection;
    public static volatile SingularAttribute<Vuelo, Integer> idVuelo;
    public static volatile SingularAttribute<Vuelo, Integer> plazasLibres;
    public static volatile SingularAttribute<Vuelo, VueloGenerico> idVueloGenerico;

}
package es.cifpcm.lalafly.data.entities;

import es.cifpcm.lalafly.data.entities.Vuelo;
import es.cifpcm.lalafly.data.entities.VueloGenerico;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-01-31T16:44:20")
@StaticMetamodel(Reservas.class)
public class Reservas_ { 

    public static volatile SingularAttribute<Reservas, String> apellido2;
    public static volatile SingularAttribute<Reservas, Integer> idReservas;
    public static volatile SingularAttribute<Reservas, String> apellido1;
    public static volatile SingularAttribute<Reservas, Integer> nReserva;
    public static volatile SingularAttribute<Reservas, Vuelo> idVuelo;
    public static volatile SingularAttribute<Reservas, Integer> telefono;
    public static volatile SingularAttribute<Reservas, Integer> tarjeta;
    public static volatile SingularAttribute<Reservas, String> nombre;
    public static volatile SingularAttribute<Reservas, Long> importe;
    public static volatile SingularAttribute<Reservas, VueloGenerico> idVueloGenerico;

}
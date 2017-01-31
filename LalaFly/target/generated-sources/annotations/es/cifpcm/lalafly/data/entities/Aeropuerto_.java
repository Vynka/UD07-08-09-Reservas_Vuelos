package es.cifpcm.lalafly.data.entities;

import es.cifpcm.lalafly.data.entities.Ciudad;
import es.cifpcm.lalafly.data.entities.VueloGenerico;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-01-31T16:44:20")
@StaticMetamodel(Aeropuerto.class)
public class Aeropuerto_ { 

    public static volatile SingularAttribute<Aeropuerto, String> codigo;
    public static volatile CollectionAttribute<Aeropuerto, VueloGenerico> vueloGenericoCollection;
    public static volatile SingularAttribute<Aeropuerto, Integer> idAeropuerto;
    public static volatile CollectionAttribute<Aeropuerto, VueloGenerico> vueloGenericoCollection1;
    public static volatile SingularAttribute<Aeropuerto, String> nombre;
    public static volatile SingularAttribute<Aeropuerto, Ciudad> idCiudad;

}
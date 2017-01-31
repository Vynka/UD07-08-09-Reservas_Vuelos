package es.cifpcm.lalafly.data.entities;

import es.cifpcm.lalafly.data.entities.Aeropuerto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-01-31T16:44:20")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile CollectionAttribute<Ciudad, Aeropuerto> aeropuertoCollection;
    public static volatile SingularAttribute<Ciudad, String> nombre;
    public static volatile SingularAttribute<Ciudad, Integer> idCiudad;

}
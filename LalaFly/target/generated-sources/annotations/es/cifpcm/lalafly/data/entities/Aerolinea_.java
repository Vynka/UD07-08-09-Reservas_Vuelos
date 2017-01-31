package es.cifpcm.lalafly.data.entities;

import es.cifpcm.lalafly.data.entities.VueloGenerico;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-01-31T16:44:20")
@StaticMetamodel(Aerolinea.class)
public class Aerolinea_ { 

    public static volatile SingularAttribute<Aerolinea, String> codigo;
    public static volatile SingularAttribute<Aerolinea, Integer> idAerolinea;
    public static volatile SingularAttribute<Aerolinea, String> nombre;
    public static volatile SingularAttribute<Aerolinea, VueloGenerico> idVueloGenerico;

}
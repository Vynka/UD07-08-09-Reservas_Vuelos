/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.lalafly.rs;

import es.cifpcm.lalafly.data.DaoFactory;
import es.cifpcm.lalafly.data.entities.Aeropuerto;
import es.cifpcm.lalafly.data.mysqlDao.MySqlAeropuertoDao;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Wyrna
 */
@Path("aeropuertos")
public class AeropuertoResource {
    private static List<Aeropuerto> aeropuertoList;
    private static DaoFactory daoFactory;
    
    static{
        aeropuertoList = new ArrayList<>();
    }

    public AeropuertoResource(){}
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Aeropuerto> read(){
        

        daoFactory = DaoFactory.getInstance();
        MySqlAeropuertoDao aeropuertoDao = daoFactory.getAeropuertoDao();
        aeropuertoList = aeropuertoDao.selectAll();
        return aeropuertoList;
    }
    
//    @GET
//    @Path("{nombre}")
//    @Produces({MediaType.APPLICATION_JSON})
//    public Actor selectActor(@PathParam("nombre") String nom){
//        for(Actor thisActor : actorList){
//            if(thisActor.getFirstName().equals(nom)){
//                return thisActor;
//            }
//        }
//        return null;
//    }
//    @POST
//    @Consumes({MediaType.APPLICATION_JSON})
//    public void set(Actor actor){
//        daoFactory = MySqlDaoFactory.getInstance();
//        ActorDao actorDao = daoFactory.getActorDao();
//        actor = actorDao.insert(actor);
//        actorList.add(actor);
//    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.bancobilardos.rest.services;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import utn.frd.bancobilardos.entities.Transferencias;
import utn.frd.bancobilardos.sessions.TransferenciasFacade;
/**
 *
 * @author Fernando
 */
    @Path("/transferencias")
public class TransferenciasRest {
    
    @EJB
    private TransferenciasFacade ejTransferenciasFacade;

    //obtener todas las entidades
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Transferencias> findAll(){
        return ejTransferenciasFacade.findAll();
    }
    
    //crear entidades
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Transferencias transferencias){
        ejTransferenciasFacade.create(transferencias);
    }
    
    @PUT
    @Path("/transferenciaentrante")
    @Consumes({MediaType.APPLICATION_JSON})
    public void transferenciaEntrante(Transferencias transferencias){
        ejTransferenciasFacade.create(transferencias);
    }
    
    //actualizar entidades
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public void edit(@PathParam("id")long id, Transferencias transferencias){
        ejTransferenciasFacade.edit(transferencias);
    }
    
    //eliminar entidades
    @DELETE
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Path("/{id}")
    public void remove(@PathParam("id")long id){
        ejTransferenciasFacade.remove( ejTransferenciasFacade.find(id) );
    }
    
  //obtener una entidad por id
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Transferencias findById(@PathParam("id")long id){
        return ejTransferenciasFacade.find(id);
    }
    
    @GET
    @Path("/transferenciaspendientes")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Transferencias> transferenciasPendientes(){
        return ejTransferenciasFacade.transferenciasPendientes();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.bancobilardos.rest.services;

import java.util.ArrayList;
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
import utn.frd.bancobilardos.entities.Bonos;
import utn.frd.bancobilardos.sessions.BonosFacade;

/**
 *
 * @author Fer
 */
@Path("/bonos")
public class BonosRest {
    @EJB
    private BonosFacade ejbBonosFacade;
    
    //obtener todas las entidades
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Bonos> findAll(){
        return ejbBonosFacade.findAll();
    }
    
    //crear entidades
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Bonos bonos){
        ejbBonosFacade.create(bonos);
    }
    
    //actualizar entidades
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public void edit(@PathParam("id")long id, Bonos bonos){
        ejbBonosFacade.edit(bonos);
    }
    
    //eliminar entidades
    @DELETE
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
@Path("/{id}")
    public void remove(@PathParam("id")long id){
        ejbBonosFacade.remove( ejbBonosFacade.find(id) );
    }
    
    //obtener una entidad por id
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Bonos findById(@PathParam("id")long id) {
        return ejbBonosFacade.find(id);
    }
//    List<Cliente> lista = new ArrayList<>();
//    @GET
//    @Path("/{documento}")
//    @Produces({MediaType.APPLICATION_JSON})
//    public List<Cliente> findByDocumentoLista(@PathParam("documento")long documento){
//        lista.add(ejbClienteFacade.find(documento));
//        return lista;
//    }
}
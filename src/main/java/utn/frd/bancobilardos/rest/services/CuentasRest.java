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
import utn.frd.bancobilardos.entities.Cuentas;
import utn.frd.bancobilardos.sessions.CuentasFacade;
/**
 *
 * @author Fernando
 */
    @Path("/cuentas")
public class CuentasRest {
    
    @EJB
    private CuentasFacade ejbCuentasFacade;

    //obtener todas las entidades
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Cuentas> findAll(){
        return ejbCuentasFacade.findAll();
    }
    
    //crear entidades
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Cuentas cuentas){
        ejbCuentasFacade.create(cuentas);
    }
    
    //actualizar entidades
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/{idCuenta}")
    public void edit(@PathParam("idCuenta")long idCuenta, Cuentas cuentas){
        ejbCuentasFacade.edit(cuentas);
    }
    
    //eliminar entidades
    @DELETE
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Path("/{idCuenta}")
    public void remove(@PathParam("idCuenta")long idCuenta){
        ejbCuentasFacade.remove( ejbCuentasFacade.find(idCuenta) );
    }
    
        //obtener una entidad por id
//    @GET
//    @Path("/{idCuenta}")
//    @Produces({MediaType.APPLICATION_JSON})
//    public Cuentas findByIdCuenta(@PathParam("idCuenta")int idCuenta){
//        return ejbCuentasFacade.find(idCuenta);
//    }
    
    List<Cuentas> lista = new ArrayList<>();
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Cuentas> findByIdLista(@PathParam("id")long id){
        lista.add(ejbCuentasFacade.find(id));
        return lista;
    }
}

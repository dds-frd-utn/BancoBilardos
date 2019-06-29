/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.bancobilardos.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import utn.frd.bancobilardos.entities.TipoMovimientos;
import utn.frd.bancobilardos.rest.services.TipoMovimientoRest;

/**
 *
 * @author Fernando
 */
@Stateless
public class TipoMovimientosFacade extends AbstractFacade<TipoMovimientos> {

    @PersistenceContext(unitName = "utn.frd_bancobilardos_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoMovimientosFacade() {
        super(TipoMovimientos.class);
    }

    public void create(TipoMovimientoRest tipomovimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void edit(TipoMovimientoRest tipomovimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

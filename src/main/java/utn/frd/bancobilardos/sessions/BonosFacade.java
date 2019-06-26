/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.bancobilardos.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import utn.frd.bancobilardos.entities.Bonos;

/**
 *
 * @author Fernando
 */
@Stateless
public class BonosFacade extends AbstractFacade<Bonos> {

    @PersistenceContext(unitName = "utn.frd_bancobilardos_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BonosFacade() {
        super(Bonos.class);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.bancobilardos.sessions;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import utn.frd.bancobilardos.entities.Transferencias;

/**
 *
 * @author Fernando
 */
@Stateless
public class TransferenciasFacade extends AbstractFacade<Transferencias> {
    @PersistenceContext
    private EntityManager entityManager;    
    
    @PersistenceContext(unitName = "utn.frd_bancobilardos_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransferenciasFacade() {
        super(Transferencias.class);
    }
    
    public List<Transferencias> transferenciasPendientes() {
         return entityManager.createQuery("SELECT t FROM Transferencias t WHERE t.estado = 'pendiente'",
          Transferencias.class).getResultList();
    }
}

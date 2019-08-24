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
import utn.frd.bancobilardos.entities.Cuentas;

/**
 *
 * @author Fernando
 */
@Stateless
public class CuentasFacade extends AbstractFacade<Cuentas> {

    @PersistenceContext(unitName = "utn.frd_bancobilardos_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CuentasFacade() {
        super(Cuentas.class);
    }
    public List<Cuentas> cuentas(int id) {
        return em.createNamedQuery("Cuentas.findByIdCuenta").setParameter("idCuenta", id).getResultList();
    }

    /**
     *
     * @return 
     */
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Cuentas> ultimaCuentaCreada() {
         return entityManager.createQuery("SELECT c FROM Cuentas c ORDER BY c.idCuenta DESC",
          Cuentas.class).setMaxResults(1).getResultList();
    }
}

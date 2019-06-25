/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.bancobilardos.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fernando
 */
@Entity
@Table(name = "movimientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientos.findAll", query = "SELECT m FROM Movimientos m")
    , @NamedQuery(name = "Movimientos.findByIdMovimiento", query = "SELECT m FROM Movimientos m WHERE m.idMovimiento = :idMovimiento")
    , @NamedQuery(name = "Movimientos.findByIdCuenta", query = "SELECT m FROM Movimientos m WHERE m.idCuenta = :idCuenta")
    , @NamedQuery(name = "Movimientos.findByIdBono", query = "SELECT m FROM Movimientos m WHERE m.idBono = :idBono")
    , @NamedQuery(name = "Movimientos.findByIdTipoMovimiento", query = "SELECT m FROM Movimientos m WHERE m.idTipoMovimiento = :idTipoMovimiento")
    , @NamedQuery(name = "Movimientos.findByCbuReceptor", query = "SELECT m FROM Movimientos m WHERE m.cbuReceptor = :cbuReceptor")
    , @NamedQuery(name = "Movimientos.findByFechaMovimiento", query = "SELECT m FROM Movimientos m WHERE m.fechaMovimiento = :fechaMovimiento")
    , @NamedQuery(name = "Movimientos.findByMonto", query = "SELECT m FROM Movimientos m WHERE m.monto = :monto")
    , @NamedQuery(name = "Movimientos.findByPorcentajeAumento", query = "SELECT m FROM Movimientos m WHERE m.porcentajeAumento = :porcentajeAumento")})
public class Movimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_movimiento")
    private Long idMovimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cuenta")
    private long idCuenta;
    @Column(name = "id_bono")
    private BigInteger idBono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipo_movimiento")
    private long idTipoMovimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cbu_receptor")
    private long cbuReceptor;
    @Column(name = "fecha_movimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaMovimiento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private Double monto;
    @Column(name = "porcentaje_aumento")
    private Double porcentajeAumento;

    public Movimientos() {
    }

    public Movimientos(Long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Movimientos(Long idMovimiento, long idCuenta, long idTipoMovimiento, long cbuReceptor) {
        this.idMovimiento = idMovimiento;
        this.idCuenta = idCuenta;
        this.idTipoMovimiento = idTipoMovimiento;
        this.cbuReceptor = cbuReceptor;
    }

    public Long getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public BigInteger getIdBono() {
        return idBono;
    }

    public void setIdBono(BigInteger idBono) {
        this.idBono = idBono;
    }

    public long getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    public void setIdTipoMovimiento(long idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }

    public long getCbuReceptor() {
        return cbuReceptor;
    }

    public void setCbuReceptor(long cbuReceptor) {
        this.cbuReceptor = cbuReceptor;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public void setPorcentajeAumento(Double porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimiento != null ? idMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimientos)) {
            return false;
        }
        Movimientos other = (Movimientos) object;
        if ((this.idMovimiento == null && other.idMovimiento != null) || (this.idMovimiento != null && !this.idMovimiento.equals(other.idMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.bancobilardos.entities.Movimientos[ idMovimiento=" + idMovimiento + " ]";
    }
    
}

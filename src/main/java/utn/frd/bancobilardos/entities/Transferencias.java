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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fernando
 */
@Entity
@Table(name = "transferencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transferencias.findAll", query = "SELECT t FROM Transferencias t")
    , @NamedQuery(name = "Transferencias.findById", query = "SELECT t FROM Transferencias t WHERE t.id = :id")
    , @NamedQuery(name = "Transferencias.findByCuentaOrigen", query = "SELECT t FROM Transferencias t WHERE t.cuentaOrigen = :cuentaOrigen")
    , @NamedQuery(name = "Transferencias.findByCuentaDestino", query = "SELECT t FROM Transferencias t WHERE t.cuentaDestino = :cuentaDestino")
    , @NamedQuery(name = "Transferencias.findByFechaInicio", query = "SELECT t FROM Transferencias t WHERE t.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Transferencias.findByFechaFin", query = "SELECT t FROM Transferencias t WHERE t.fechaFin = :fechaFin")
    , @NamedQuery(name = "Transferencias.findByEstado", query = "SELECT t FROM Transferencias t WHERE t.estado = :estado")
    , @NamedQuery(name = "Transferencias.findByTipo", query = "SELECT t FROM Transferencias t WHERE t.tipo = :tipo")})
public class Transferencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cuenta_origen")
    private long cuentaOrigen;
    @Column(name = "cuenta_destino")
    private BigInteger cuentaDestino;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Lob
    @Size(max = 65535)
    @Column(name = "monto")
    private String monto;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Size(max = 100)
    @Column(name = "estado")
    private String estado;
    @Column(name = "tipo")
    private BigInteger tipo;

    public Transferencias() {
    }

    public Transferencias(Long id) {
        this.id = id;
    }

    public Transferencias(Long id, long cuentaOrigen) {
        this.id = id;
        this.cuentaOrigen = cuentaOrigen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(long cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public BigInteger getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(BigInteger cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigInteger getTipo() {
        return tipo;
    }

    public void setTipo(BigInteger tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transferencias)) {
            return false;
        }
        Transferencias other = (Transferencias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.bancobilardos.entities.Transferencias[ id=" + id + " ]";
    }
    
}

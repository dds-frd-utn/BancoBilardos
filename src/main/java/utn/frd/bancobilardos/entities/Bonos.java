/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.bancobilardos.entities;

import java.io.Serializable;
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
@Table(name = "bonos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bonos.findAll", query = "SELECT b FROM Bonos b")
    , @NamedQuery(name = "Bonos.findByIdBono", query = "SELECT b FROM Bonos b WHERE b.idBono = :idBono")
    , @NamedQuery(name = "Bonos.findByIdCliente", query = "SELECT b FROM Bonos b WHERE b.idCliente = :idCliente")
    , @NamedQuery(name = "Bonos.findByValorCompra", query = "SELECT b FROM Bonos b WHERE b.valorCompra = :valorCompra")
    , @NamedQuery(name = "Bonos.findByFechaVencimiento", query = "SELECT b FROM Bonos b WHERE b.fechaVencimiento = :fechaVencimiento")
    , @NamedQuery(name = "Bonos.findByFechaCompra", query = "SELECT b FROM Bonos b WHERE b.fechaCompra = :fechaCompra")
    , @NamedQuery(name = "Bonos.findByPorcentajeAumento", query = "SELECT b FROM Bonos b WHERE b.porcentajeAumento = :porcentajeAumento")
    , @NamedQuery(name = "Bonos.findByActivo", query = "SELECT b FROM Bonos b WHERE b.activo = :activo")
    , @NamedQuery(name = "Bonos.findByValorACobrar", query = "SELECT b FROM Bonos b WHERE b.valorACobrar = :valorACobrar")})
public class Bonos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_bono")
    private Long idBono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cliente")
    private long idCliente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_compra")
    private Double valorCompra;
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Column(name = "fecha_compra")
    @Temporal(TemporalType.DATE)
    private Date fechaCompra;
    @Column(name = "porcentaje_aumento")
    private Double porcentajeAumento;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "valor_a_cobrar")
    private Double valorACobrar;

    public Bonos() {
    }

    public Bonos(Long idBono) {
        this.idBono = idBono;
    }

    public Bonos(Long idBono, long idCliente) {
        this.idBono = idBono;
        this.idCliente = idCliente;
    }

    public Long getIdBono() {
        return idBono;
    }

    public void setIdBono(Long idBono) {
        this.idBono = idBono;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Double getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public void setPorcentajeAumento(Double porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Double getValorACobrar() {
        return valorACobrar;
    }

    public void setValorACobrar(Double valorACobrar) {
        this.valorACobrar = valorACobrar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBono != null ? idBono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bonos)) {
            return false;
        }
        Bonos other = (Bonos) object;
        if ((this.idBono == null && other.idBono != null) || (this.idBono != null && !this.idBono.equals(other.idBono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.bancobilardos.entities.Bonos[ idBono=" + idBono + " ]";
    }
    
}

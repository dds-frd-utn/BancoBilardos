/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.bancobilardos.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fernando
 */
@Entity
@Table(name = "tipo_movimientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoMovimientos.findAll", query = "SELECT t FROM TipoMovimientos t")
    , @NamedQuery(name = "TipoMovimientos.findByIdTipoMovimiento", query = "SELECT t FROM TipoMovimientos t WHERE t.idTipoMovimiento = :idTipoMovimiento")
    , @NamedQuery(name = "TipoMovimientos.findByCodigo", query = "SELECT t FROM TipoMovimientos t WHERE t.codigo = :codigo")})
public class TipoMovimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_movimiento")
    private Long idTipoMovimiento;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Character codigo;

    public TipoMovimientos() {
    }

    public TipoMovimientos(Long idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }

    public TipoMovimientos(Long idTipoMovimiento, Character codigo) {
        this.idTipoMovimiento = idTipoMovimiento;
        this.codigo = codigo;
    }

    public Long getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    public void setIdTipoMovimiento(Long idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getCodigo() {
        return codigo;
    }

    public void setCodigo(Character codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoMovimiento != null ? idTipoMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMovimientos)) {
            return false;
        }
        TipoMovimientos other = (TipoMovimientos) object;
        if ((this.idTipoMovimiento == null && other.idTipoMovimiento != null) || (this.idTipoMovimiento != null && !this.idTipoMovimiento.equals(other.idTipoMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.bancobilardos.entities.TipoMovimientos[ idTipoMovimiento=" + idTipoMovimiento + " ]";
    }
    
}

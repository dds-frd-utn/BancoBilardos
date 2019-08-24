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
import javax.validation.constraints.Size;
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
    , @NamedQuery(name = "Bonos.findById", query = "SELECT b FROM Bonos b WHERE b.id = :id")
    , @NamedQuery(name = "Bonos.findByActivo", query = "SELECT b FROM Bonos b WHERE b.activo = :activo")
    , @NamedQuery(name = "Bonos.findByDescripcion", query = "SELECT b FROM Bonos b WHERE b.descripcion = :descripcion")
    , @NamedQuery(name = "Bonos.findByFechaDePago", query = "SELECT b FROM Bonos b WHERE b.fechaDePago = :fechaDePago")
    , @NamedQuery(name = "Bonos.findByCodigo", query = "SELECT b FROM Bonos b WHERE b.codigo = :codigo")
    , @NamedQuery(name = "Bonos.findByInteres", query = "SELECT b FROM Bonos b WHERE b.interes = :interes")
    , @NamedQuery(name = "Bonos.findByIdCliente", query = "SELECT b FROM Bonos b WHERE b.idCliente = :idCliente")
    , @NamedQuery(name = "Bonos.findByMonto", query = "SELECT b FROM Bonos b WHERE b.monto = :monto")})
public class Bonos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "activo")
    private Boolean activo;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha_de_pago")
    @Temporal(TemporalType.DATE)
    private Date fechaDePago;
    @Size(max = 100)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 100)
    @Column(name = "interes")
    private String interes;
    @Size(max = 100)
    @Column(name = "id_cliente")
    private String idCliente;
    @Size(max = 100)
    @Column(name = "monto")
    private String monto;

    public Bonos() {
    }

    public Bonos(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(Date fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
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
        if (!(object instanceof Bonos)) {
            return false;
        }
        Bonos other = (Bonos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.bancobilardos.entities.Bonos[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vijay
 */
@Entity
@Table(name = "tbl_login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblLogin.findAll", query = "SELECT t FROM TblLogin t")
    , @NamedQuery(name = "TblLogin.findById", query = "SELECT t FROM TblLogin t WHERE t.id = :id")
    , @NamedQuery(name = "TblLogin.findBySpassword", query = "SELECT t FROM TblLogin t WHERE t.spassword = :spassword")
    , @NamedQuery(name = "TblLogin.findBySusername", query = "SELECT t FROM TblLogin t WHERE t.susername = :susername")
    , @NamedQuery(name = "TblLogin.findByTblAdmindetailsId", query = "SELECT t FROM TblLogin t WHERE t.tblAdmindetailsId = :tblAdmindetailsId")})
public class TblLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "SPASSWORD")
    private String spassword;
    @Size(max = 255)
    @Column(name = "SUSERNAME")
    private String susername;
    @Column(name = "TBL_ADMINDETAILS_ID")
    private BigInteger tblAdmindetailsId;

    public TblLogin() {
    }

    public TblLogin(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername;
    }

    public BigInteger getTblAdmindetailsId() {
        return tblAdmindetailsId;
    }

    public void setTblAdmindetailsId(BigInteger tblAdmindetailsId) {
        this.tblAdmindetailsId = tblAdmindetailsId;
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
        if (!(object instanceof TblLogin)) {
            return false;
        }
        TblLogin other = (TblLogin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAO.TblLogin[ id=" + id + " ]";
    }
    
}


package entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Tbl_Login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String sUserName;

    @Basic
    private String sPassword;
    
    @OneToOne(targetEntity = Tbl_AdminDetails.class)
    private Tbl_AdminDetails tbl_AdminDetails;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSUserName() {
        return this.sUserName;
    }

    public void setSUserName(String sUserName) {
        this.sUserName = sUserName;
    }

    public String getSPassword() {
        return this.sPassword;
    }

    public void setSPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public Tbl_AdminDetails getTbl_AdminDetails() {
        return this.tbl_AdminDetails;
    }

    public void setTbl_AdminDetails(Tbl_AdminDetails tbl_AdminDetails) {
        this.tbl_AdminDetails = tbl_AdminDetails;
    }

}
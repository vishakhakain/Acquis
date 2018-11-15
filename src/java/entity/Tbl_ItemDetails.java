
package entity;


import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tbl_ItemDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String sName;

    @Basic
    private double dPrice;

    @Basic
    private String sCategory;

    @Basic
    private String sDescription;

    @Basic
    private int iQuantity;

    @Basic
    private double iVat;

    @ManyToMany(targetEntity = Tbl_AdminDetails.class)
    private List<Tbl_AdminDetails> tbl_AdminDetailses;



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSName() {
        return this.sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public double getDPrice() {
        return this.dPrice;
    }

    public void setDPrice(double dPrice) {
        this.dPrice = dPrice;
    }

    public String getSCategory() {
        return this.sCategory;
    }

    public void setSCategory(String sCategory) {
        this.sCategory = sCategory;
    }

    public String getSDescription() {
        return this.sDescription;
    }

    public void setSDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    public int getIQuantity() {
        return this.iQuantity;
    }

    public void setIQuantity(int iQuantity) {
        this.iQuantity = iQuantity;
    }

    public double getIVat() {
        return this.iVat;
    }

    public void setIVat(double iVat) {
        this.iVat = iVat;
    }

    public List<Tbl_AdminDetails> getTbl_AdminDetailses() {
        return this.tbl_AdminDetailses;
    }

    public void setTbl_AdminDetailses(List<Tbl_AdminDetails> tbl_AdminDetailses) {
        this.tbl_AdminDetailses = tbl_AdminDetailses;
    }

}
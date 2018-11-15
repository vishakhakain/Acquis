package entity;

import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Tbl_Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private int iQuantity;

    @Basic
    private double dTotalPrice;

    @Basic
    private Timestamp time;
    //creating many to many relation with Tbl_AdminDetails
    @ManyToMany(targetEntity = Tbl_AdminDetails.class, mappedBy = "tbl_Orderses")
    private List<Tbl_AdminDetails> tbl_AdminDetailses;  // foreign key from Tbl_AdminDetailses.

 
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIQuantity() {
        return this.iQuantity;
    }

    public void setIQuantity(int iQuantity) {
        this.iQuantity = iQuantity;
    }

    public double getDTotalPrice() {
        return this.dTotalPrice;
    }

    public void setDTotalPrice(double dTotalPrice) {
        this.dTotalPrice = dTotalPrice;
    }

    public Timestamp getTime() {
        return this.time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public List<Tbl_AdminDetails> getTbl_AdminDetailses() {
        return this.tbl_AdminDetailses;
    }

    public void setTbl_AdminDetailses(List<Tbl_AdminDetails> tbl_AdminDetailses) {
        this.tbl_AdminDetailses = tbl_AdminDetailses;
    }

}
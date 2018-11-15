package entity;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity
public class Tbl_AdminDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String sFirstName;

    @Basic
    private String sLastName;

    @Basic
    private String sEmail;

    @Basic
    private String sAddressLine1;

    @Basic
    private String sAddressLine2;

    @Basic
    private String sAddressLine3;

    @Basic
    private String sPhoneNumber;

    @OneToOne(targetEntity = Tbl_Login.class, mappedBy = "tbl_AdminDetails")
    private Tbl_Login tbl_Login;

    @ManyToMany(targetEntity = Tbl_ItemDetails.class, mappedBy = "tbl_AdminDetailses")
    private List<Tbl_ItemDetails> tbl_ItemDetailses;

    @ManyToMany(targetEntity = Tbl_Orders.class)
    private List<Tbl_Orders> tbl_Orderses;

     public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSFirstName() {
        return this.sFirstName;
    }

    public void setSFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getSLastName() {
        return this.sLastName;
    }

    public void setSLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public String getSEmail() {
        return this.sEmail;
    }

    public void setSEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getSAddressLine1() {
        return this.sAddressLine1;
    }

    public void setSAddressLine1(String sAddressLine1) {
        this.sAddressLine1 = sAddressLine1;
    }

    public String getSAddressLine2() {
        return this.sAddressLine2;
    }

    public void setSAddressLine2(String sAddressLine2) {
        this.sAddressLine2 = sAddressLine2;
    }

    public String getSAddressLine3() {
        return this.sAddressLine3;
    }

    public void setSAddressLine3(String sAddressLine3) {
        this.sAddressLine3 = sAddressLine3;
    }

    public String getSPhoneNumber() {
        return this.sPhoneNumber;
    }

    public void setSPhoneNumber(String sPhoneNumber) {
        this.sPhoneNumber = sPhoneNumber;
    }

    public Tbl_Login getTbl_Login() {
        return this.tbl_Login;
    }

    public void setTbl_Login(Tbl_Login tbl_Login) {
        this.tbl_Login = tbl_Login;
    }

    public List<Tbl_ItemDetails> getTbl_ItemDetailses() {
        return this.tbl_ItemDetailses;
    }

    public void setTbl_ItemDetailses(List<Tbl_ItemDetails> tbl_ItemDetailses) {
        this.tbl_ItemDetailses = tbl_ItemDetailses;
    }

    public List<Tbl_Orders> getTbl_Orderses() {
        return this.tbl_Orderses;
    }

    public void setTbl_Orderses(List<Tbl_Orders> tbl_Orderses) {
        this.tbl_Orderses = tbl_Orderses;
    }

}

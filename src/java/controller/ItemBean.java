
package controller;
import DAO.ItemDAO;
import entity.Tbl_ItemDetails;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ItemBean implements Serializable{
    @Inject
    private ItemDAO dao;
    private String name;
    private double price;
    private String category;
    private String description;
    private int quantity;
    private String fcat;
    double vat;
    double pavat;
    private long fid;
   
    Tbl_ItemDetails p1;
    
    public String getFcat() {
        return fcat;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getPavat() {
        return pavat;
    }

    public void setPavat(double pavat) {
        this.pavat = pavat;
    }

    public void setFcat(String fcat) {
        this.fcat = fcat;
    }

    public String getCategory() {
        return category;
    }

   
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
  
    public long getFid() {
        return fid;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public ItemBean () {
    }

    public ItemDAO getDao() {
        return dao;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setDao(ItemDAO dao) {
        this.dao = dao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String createProd(){
        Tbl_ItemDetails p = new Tbl_ItemDetails();
          
           p.setSName(name);
           p.setDPrice(price);
           p.setSCategory(category);
           p.setSDescription(description);
           p.setIQuantity(quantity);
           p.setIVat(vat);
              
           dao.createProduct(p);
    return "confirmation1.xhtml";
    }
    
    public String ADDProd(){
        
        
     return "confirmation1.xhtml";   
    }
    
    public Tbl_ItemDetails findProductById(){
     return dao.findProduct(fid);
    }
    public Tbl_ItemDetails findProductByGivenId(long givenId){
     return dao.findProduct(givenId);
    }
    
    public List<Tbl_ItemDetails> listAll(){
    return dao.ListallProducts();
    }
  
    public String findByIdRtnString(){
      p1 =dao.findProduct(fid);
    return "edit.xhtml";}
    
//    public String update(){
//    
//      dao.updateName(name, fid);
//    return "confirmation.xhtml";}
    
        public String removeProduct() {
        dao.remove(fid);
        return "deletepage.xhtml";
    }

    public Tbl_ItemDetails getP1() {
        return p1;
    }

    public void setP1(Tbl_ItemDetails p1) {
        this.p1 = p1;
    }
    
//    public List<Tbl_ItemDetails> giveByCategory (){
//         return dao.categaryList(fcat);
//    }
//    
   public String method(){
   return "confirmation";}
}


package DAO;


import entity.Tbl_ItemDetails;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class ItemDAO {
    
      @PersistenceContext
    private EntityManager em;
   
    public void createProduct(Tbl_ItemDetails a){
        em.persist(a);
        
    }
  
      public void remove(long id) {
        Query query = em.createQuery("DELETE FROM Tbl_ItemDetails e WHERE e.id = :id")
                .setParameter("id", id);
        query.executeUpdate();

    }
     
   public Tbl_ItemDetails findProduct(long id){
   String query = "select p from Tbl_ItemDetails p where p.id = :id";
   Tbl_ItemDetails prod= (Tbl_ItemDetails)em.createQuery(query).setParameter("id", id).getSingleResult();
   return prod;
   } 
       
    public List<Tbl_ItemDetails> ListallProducts(){
    String query = "Select p from Tbl_ItemDetails as p";
    List <Tbl_ItemDetails> prod = em.createQuery(query).getResultList();
    return prod;
    }
    
    
    public void edit(Tbl_ItemDetails p){
     em.merge(p);
    }

    
//     public List<Tbl_ItemDetails> categaryList(String category){
//    String queryString = "Select p from Tbl_ItemDetails p where p.category = :category";
//    List<Tbl_ItemDetails> prod = (List<Tbl_ItemDetails>)em.createQuery(queryString).setParameter("category", category).getResultList();
//    return prod;
//    }
//    
}

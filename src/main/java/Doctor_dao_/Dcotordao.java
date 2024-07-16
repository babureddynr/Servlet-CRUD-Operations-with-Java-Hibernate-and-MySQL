package Doctor_dao_;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Doctor_dto.Doctordto;

public class Dcotordao {

    EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("Drew");
    EntityManager EntityManager = EntityManagerFactory.createEntityManager();
    EntityTransaction EntityTransaction = EntityManager.getTransaction();

   
    

    // Fetch Data by ID
    public Doctordto fetchById(int id) {
        return EntityManager.find(Doctordto.class, id);
    }

    // Fetch All Doctors
    public List<Doctordto> fetchAll() {
        TypedQuery<Doctordto> query = EntityManager.createQuery("SELECT d FROM Doctordto d", Doctordto.class);
        return query.getResultList();
    }

    // Delete Data by ID
    public String deleteById(int id)
    {
        EntityTransaction.begin();
        Doctordto dto = EntityManager.find(Doctordto.class, id);
      
            EntityManager.remove(dto);
            EntityTransaction.commit();
            return "Doctor with ID " + id + " deleted successfully.";
         
        
    }
    
    
    
 // Delete All Doctors
    public String deleteAll()
    {
        EntityTransaction.begin();
        Query query = EntityManager.createQuery("DELETE FROM Doctordto");
        int deletedCount = query.executeUpdate();
        EntityTransaction.commit();
        return deletedCount + " records deleted successfully.";
    }
    
  
 // Update Data by ID
    public String updateById(int id, String newName) {
      
        
    	
        Doctordto dto = EntityManager.find(Doctordto.class, id);
        EntityTransaction.begin();
            dto.setName(newName);
            EntityManager.merge(dto);
            EntityTransaction.commit();
            return "Doctor with ID " + id + " updated successfully.";
        
    }
    
    // Update 2

    public String update(Doctordto dto) {
      
        EntityTransaction.begin();
        EntityManager.merge(dto);
        EntityTransaction.commit();
        EntityManager.close();
        return "Data Updated Successfully";
    }

    
// insert
    

 public String insert(Doctordto dto) {
     // TODO: Auto-generated method stub
     EntityTransaction.begin();
     EntityManager.persist(dto);
     EntityTransaction.commit();
     return "Data inserted successfully";
 }
}
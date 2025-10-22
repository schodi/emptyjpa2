package jpa1;

import java.util.List;
import jakarta.persistence.*;

import jakarta.persistence.Query;
import jpa1.entities.*;


public class JPA1 {
    public JPA1() {
    }
    
    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA1PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Pupil p1 = new Pupil("Hannes", "Schulz", "IT2025");
        em.persist(p1);

        em.getTransaction().commit();
    }
}

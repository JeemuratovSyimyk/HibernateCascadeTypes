package org.example.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import org.example.Config.HibernateConfig;
import org.example.Entity.President;
import org.example.repository.PresidentRepository;
import org.hibernate.SessionFactory;

public class PresidentPepositoryImpl implements PresidentRepository {
   private final EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public void savePresident(President president) {
        entityManager.getTransaction().begin();
        entityManager.persist(president);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    @Override
    public void deletePresident(Long id) {
        entityManager.getTransaction().begin();
     President president = entityManager.find(President.class,id);
       president.getCountry().setPresident(null);
        entityManager.remove(president);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}

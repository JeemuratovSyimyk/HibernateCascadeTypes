package org.example.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.Config.HibernateConfig;
import org.example.Entity.Country;
import org.example.repository.CountryRepository;

public class CountryRepositoryImpl implements CountryRepository {
   private final EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public String save(Country country) {
        entityManager.getTransaction().begin();
        entityManager.persist(country);
        entityManager.getTransaction().commit();
        entityManager.close();
        return country.getName()+ " is saved";
    }

    @Override
    public void deleteCountryById(Long id) {
        entityManager.getTransaction().begin();
        Country country = entityManager.find(Country.class,id);
        entityManager.remove(country);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}

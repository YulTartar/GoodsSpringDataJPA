package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.models.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("GiveMeMyGoods");
             EntityManager em = emf.createEntityManager()) {

            try {
                em.getTransaction().begin();
                em.getTransaction().commit();
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }
        } // session.close()
    }
}
package sn.ngone.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sn.ngone.config.HibernateUtil;
import sn.ngone.entite.Service;

public class ServiceRepository {
    public void ajouterService(Service service) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(service);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
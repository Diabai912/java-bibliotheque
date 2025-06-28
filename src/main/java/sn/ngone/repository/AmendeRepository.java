package sn.ngone.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sn.ngone.config.HibernateUtil;
import sn.ngone.entite.Amende;

public class AmendeRepository {
    public void ajouterAmende(Amende amende) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(amende);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
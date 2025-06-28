package sn.ngone.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sn.ngone.config.HibernateUtil;
import sn.ngone.entite.Emprunt;

public class EmpruntRepository {
    public void ajouterEmprunt(Emprunt emprunt) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(emprunt);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
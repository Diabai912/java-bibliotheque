package sn.ngone.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sn.ngone.config.HibernateUtil;
import sn.ngone.entite.Livre;

public class LivreRepository {
    public void ajouterLivre(Livre livre) {
        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.persist(livre);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                try {
                    transaction.rollback();  // Attention : rollback uniquement si la session est ouverte
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();  // pour voir l'erreur exacte
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
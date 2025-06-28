package sn.ngone.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sn.ngone.config.HibernateUtil;
import sn.ngone.entite.Utilisateur;

public class UtilisateurRepository {

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(utilisateur);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // On pourra ajouter plus tard : getAll(), update(), delete()...
}
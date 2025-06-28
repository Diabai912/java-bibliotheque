package sn.ngone.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sn.ngone.config.HibernateUtil;
import sn.ngone.entite.Reservation;

public class ReservationRepository {
    public void ajouterReservation(Reservation reservation) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(reservation);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
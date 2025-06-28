package sn.ngone;

import org.hibernate.Session;
import sn.ngone.config.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        // Ouvrir une session Hibernate
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("✅ Connexion réussie ! Les entités devraient créer les tables si tout est correct.");
        } catch (Exception e) {
            System.out.println("❌ Erreur de connexion : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
package sn.ngone;

import org.hibernate.Session;
import sn.ngone.config.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            System.out.println("✅ Connexion Hibernate réussie !");
        } catch (Exception e) {
            System.out.println("❌ Échec de la connexion Hibernate !");
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }
}
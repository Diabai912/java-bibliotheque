package sn.ngone.test;

import sn.ngone.entite.Service;
import sn.ngone.repository.ServiceRepository;

public class MainTestService {
    public static void main(String[] args) {
        Service service = new Service();
        service.setNom("Informatique");

        ServiceRepository repo = new ServiceRepository();
        repo.ajouterService(service);

        System.out.println("✅ Service ajouté avec succès !");
    }
}
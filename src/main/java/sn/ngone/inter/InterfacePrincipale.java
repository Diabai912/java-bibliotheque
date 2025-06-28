package sn.ngone.inter;

import javax.swing.*;
import java.awt.*;

public class InterfacePrincipale extends JFrame {

    public InterfacePrincipale() {
        setTitle("Gestion de la Bibliothèque");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centre la fenêtre à l’écran

        // ✅ Création du panneau principal avec un layout centré
        JPanel panel = new JPanel(new BorderLayout());

        // ✅ Création du label "Bienvenue"
        JLabel label = new JLabel("Bienvenue dans la bibliothèque", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(new Color(33, 102, 172)); // Un joli bleu

        // ✅ Ajout du label au centre du panneau
        panel.add(label, BorderLayout.CENTER);

        // ✅ Ajout du panneau à la fenêtre
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new InterfacePrincipale();
    }
}

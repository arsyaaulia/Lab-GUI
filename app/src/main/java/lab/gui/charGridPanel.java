package lab.gui;

import javax.swing.*;
import java.awt.*;

public class charGridPanel extends JPanel {
    public charGridPanel() {
        setLayout(new GridLayout(4, 4, 10, 10)); 
        setBackground(Color.LIGHT_GRAY); // Warna latar belakang area karakter
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Padding di sekitar grid

        // Contoh data nama karakter (ganti dengan data Anda)
        String[] characterNames = {
                "Frieren", "Aglaea", "Anaxa", "Archer",
                "Argenti", "Asta", "Aventurine", "Bailu",
                "Bronya", "Clara", "Dan Heng", "Fu Xuan",
                " ", " ", "Hai "
        };

        // Tambahkan CharacterCard untuk setiap nama karakter
        for (String name : characterNames) {
            CharacterCard card = new CharacterCard(name);
            add(card);

            // Tambahkan label nama ke dalam CharacterCard (contoh sederhana)
            JLabel nameLabel = new JLabel(name, SwingConstants.CENTER);
            card.add(nameLabel, BorderLayout.SOUTH);

            // Tambahkan placeholder gambar (Anda akan mengganti ini dengan gambar sebenarnya)
            JPanel imagePanel = new JPanel();
            imagePanel.setPreferredSize(new Dimension(200, 200)); // Ukuran placeholder gambar
            imagePanel.setBackground(Color.WHITE); // Latar belakang putih untuk gambar
            card.add(imagePanel, BorderLayout.CENTER);
        }
    }
}
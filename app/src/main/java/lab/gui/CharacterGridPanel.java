package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CharacterGridPanel extends JScrollPane {
    private JPanel content;
    private List<CharacterCard> characterCards;

    public CharacterGridPanel() {
        content = new JPanel(new GridLayout(0, 4, 15, 15)); // 0 baris (auto), 4 kolom
        content.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        content.setBackground(new Color(240, 240, 240));
        setViewportView(content);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        characterCards = new ArrayList<>();
        String[] characterNames = {
            "Manusia Lidi 1", "Manusia Lidi 2", "Manusia Lidi 3", "Manusia Lidi 4", 
            "Argenti", "Asta", "Aventurine", "Bailu", 
            "Bronya", "Clara", "Dan Heng", "Fu Xuan", 
            "Himeko", "Kafka", "Luocha", ""};
        String[] imagePaths = {
            "/Mr Bread.jpeg", "/Mr Bread.jpeg", "/Mr Bread.jpeg", "/Mr Bread.jpeg", 
            "", "", "", "", 
            "", "", "", "", 
            "", "", "", ""
        };

        for (int i = 0; i < Math.min(characterNames.length, imagePaths.length); i++) {
            CharacterCard characterCard = new CharacterCard(characterNames[i]);
            ImageIcon icon = loadImage(imagePaths[i], 300, 300);
            characterCard.setImage(icon);
            characterCards.add(characterCard);
            content.add(characterCard);
        }
    }

    private ImageIcon loadImage(String path) { // Hapus parameter width dan height
        try {
            java.net.URL imageURL = getClass().getResource(path);
            if (imageURL == null) {
                System.err.println("Gambar tidak ditemukan di path: " + path);
                return null;
            }
            ImageIcon icon = new ImageIcon(imageURL);
            System.out.println("Lebar gambar setelah dimuat: " + icon.getIconWidth());
            System.out.println("Tinggi gambar setelah dimuat: " + icon.getIconHeight());
            return icon;
        } catch (Exception e) {
            System.err.println("Error loading image: " + path + " - " + e.getMessage());
            return null;
        }
    }
    
}
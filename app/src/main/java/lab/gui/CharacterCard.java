package lab.gui;

import javax.swing.*;
import java.awt.*;

public class CharacterCard extends JPanel {
    private CharacterImageCard imageCard;
    private CharacterInfoCard infoCard;

    public CharacterCard(String name) {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        setBackground(Color.WHITE); // Latar belakang untuk kartu
        setPreferredSize(new Dimension(250, 280)); // Ukuran preferred untuk kartu

        imageCard = new CharacterImageCard();
        add(imageCard, BorderLayout.CENTER);

        infoCard = new CharacterInfoCard(name);
        add(infoCard, BorderLayout.SOUTH);
    }

    public void setImage(ImageIcon icon) {
        imageCard.setImage(icon);
    }

    public void setName(String name) {
        infoCard.setName(name);
    }
}
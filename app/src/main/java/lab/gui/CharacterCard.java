package lab.gui;

import javax.swing.*;
import java.awt.*;

public class CharacterCard extends JPanel {
    private CharacterImageCard imageCard;
    private CharacterInfoCard infoCard;

    public CharacterCard(String name, int imageWidth, int imageHeight) {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(imageWidth, imageHeight + 30)); // Tinggi disesuaikan untuk info

        imageCard = new CharacterImageCard(imageWidth, imageHeight);
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
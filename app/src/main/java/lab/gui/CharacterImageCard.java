package lab.gui;

import javax.swing.*;
import java.awt.*;

public class CharacterImageCard extends JPanel {
    private JLabel imageLabel;

    public CharacterImageCard() {
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY); // Warna placeholder untuk gambar
        imageLabel = new JLabel("", SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);
        setPreferredSize(new Dimension(300, 300)); // Ukuran preferred untuk area gambar
    }

    public void setImage(ImageIcon icon) {
        if (icon != null) {
            Image scaledImage = icon.getImage().getScaledInstance(
                    getWidth(), -1, Image.SCALE_SMOOTH);
            if (scaledImage.getHeight(null) > getHeight()) {
                scaledImage = icon.getImage().getScaledInstance(
                        -1, getHeight(), Image.SCALE_SMOOTH);
            }
            imageLabel.setIcon(new ImageIcon(scaledImage));
        } else {
            imageLabel.setIcon(null);
            imageLabel.setText("");
        }
    }
}
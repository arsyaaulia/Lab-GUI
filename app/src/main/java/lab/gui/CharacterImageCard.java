package lab.gui;

import javax.swing.*;
import java.awt.*;

public class CharacterImageCard extends JPanel {
    private JLabel imageLabel;

    public CharacterImageCard(int width, int height) {
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY); // Warna placeholder untuk gambar
        imageLabel = new JLabel("", SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);
        setPreferredSize(new Dimension(width, height));
    }

    public void setImage(ImageIcon icon) {
        if (icon != null) {
            // Penskalaan gambar dilakukan di sini agar CharacterImageCard bertanggung jawab atas ukurannya
            Image scaledImage = getScaledImage(icon.getImage(), getWidth(), getHeight());
            imageLabel.setIcon(new ImageIcon(scaledImage));
        } else {
            imageLabel.setIcon(null);
            imageLabel.setText("No Image");
        }
    }

    private Image getScaledImage(Image srcImg, int w, int h) {
        if (w <= 0 || h <= 0 || srcImg == null) {
            return null;
        }
        return srcImg.getScaledInstance(w, h, Image.SCALE_SMOOTH);
    }
}
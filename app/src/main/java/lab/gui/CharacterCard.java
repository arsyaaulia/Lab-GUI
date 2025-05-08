package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CharacterCard extends JPanel {
    public CharacterCard(String name, String imagePath) {
        setLayout(new BorderLayout());

        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        BufferedImage image = null;

        try {
            image = ImageIO.read(getClass().getResourceAsStream(imagePath));
        } catch (IOException | IllegalArgumentException e) {
            // Gambar gagal dimuat, biarkan image tetap null
        }

        if (image == null) {
            // Gambar null → buat gambar putih polos ukuran 150x150
            image = new BufferedImage(150, 150, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = image.createGraphics();
            g2.setColor(Color.WHITE); // warna putih
            g2.fillRect(0, 0, 150, 150);
            g2.dispose();
        }

        imageLabel.setIcon(new ImageIcon(image));
        JLabel nameLabel = new JLabel(name, SwingConstants.CENTER);

        add(imageLabel, BorderLayout.CENTER);
        add(nameLabel, BorderLayout.SOUTH);
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }
}
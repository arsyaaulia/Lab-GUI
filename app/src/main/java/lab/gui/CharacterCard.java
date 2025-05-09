package lab.gui;

import javax.swing.*;
import java.awt.*;

public class CharacterCard extends JPanel {
    private JLabel imageLabel;
    private JLabel nameLabel;

    public CharacterCard(String name, ImageIcon icon) {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(200, 200));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        if (icon != null) {
            imageLabel.setIcon(icon);
        } else {
            imageLabel.setPreferredSize(new Dimension(150, 150));
            imageLabel.setBackground(Color.WHITE);
            imageLabel.setOpaque(true);
        }

        nameLabel = new JLabel(name, JLabel.CENTER);

        add(imageLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        add(nameLabel, BorderLayout.SOUTH);
    }
}

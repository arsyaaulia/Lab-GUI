package lab.gui;

import javax.swing.*;
import java.awt.*;

public class CharacterInfoCard extends JPanel {
    private JLabel nameLabel;

    public CharacterInfoCard(String name) {
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        setBackground(Color.WHITE);
        nameLabel = new JLabel(name, SwingConstants.CENTER);
        add(nameLabel);
        // Tidak perlu setPreferredSize di sini, biarkan layout manager yang mengatur
    }

    public void setName(String name) {
        nameLabel.setText(name);
    }
}
package lab.gui;

import javax.swing.*;
import java.awt.*;

public class CharacterInfoCard extends JPanel {
    private JLabel nameLabel;

    public CharacterInfoCard(String name) {
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5)); // Atur tata letak untuk nama
        setBackground(Color.WHITE); // Latar belakang untuk info
        nameLabel = new JLabel(name, SwingConstants.CENTER);
        add(nameLabel);
        setPreferredSize(new Dimension(150, 30)); // Ukuran preferred untuk area nama
    }

    public void setName(String name) {
        nameLabel.setText(name);
    }
}
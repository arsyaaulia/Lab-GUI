package lab.gui;

import javax.swing.*;
import java.awt.*;

public class EpisodePanel extends JPanel {
    public EpisodePanel() {
        

        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);

        JLabel comingSoon = new JLabel("Episode Page - Coming Soon!", SwingConstants.CENTER);
        comingSoon.setForeground(Color.WHITE);
        comingSoon.setFont(new Font("SansSerif", Font.BOLD, 24));

        add(comingSoon, BorderLayout.NORTH);
    }
}

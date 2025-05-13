package lab.gui;

import javax.swing.*;
import java.awt.*;

public class ComingSoon extends JPanel{
    public ComingSoon(){
        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);

        JLabel comingSoon = new JLabel("Coming Soon!", SwingConstants.CENTER);
        comingSoon.setForeground(Color.WHITE);
        comingSoon.setFont(new Font("SansSerif", Font.BOLD, 24));
        comingSoon.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));

        add(comingSoon, BorderLayout.NORTH);
    } 
}

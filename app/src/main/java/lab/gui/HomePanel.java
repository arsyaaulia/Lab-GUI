package lab.gui;
import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel{
    public HomePanel(){

        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);

        JLabel comingSoon = new JLabel("Welcome!", SwingConstants.CENTER);
        comingSoon.setForeground(Color.BLACK);
        comingSoon.setFont(new Font("SansSerif", Font.BOLD, 24));
        comingSoon.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        add(comingSoon, BorderLayout.NORTH);
    }
    
}

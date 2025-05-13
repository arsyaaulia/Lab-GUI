package lab.gui;

import javax.swing.*;
import java.awt.*;

public class Header extends JPanel {
    public Header(String title) {
        setBackground(Color.decode("#aba0cb"));
        setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        JLabel label = new JLabel(title, SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(label);
    }
}
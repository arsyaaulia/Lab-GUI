package lab.gui;

import javax.swing.*;
import java.awt.*;

public class Sidebar extends JPanel {
    public Sidebar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(40, 40, 50));
        setPreferredSize(new Dimension(200, 300));
        
        String[] buttons = {"Home", "Characters", "Episodes", "Settings"};

        // Dimension buttonSize = new Dimension(150, 40);
        
        add(Box.createVerticalStrut(10)); 
        for(int i = 0; i < buttons.length; i++){

            JButton btn = new JButton(buttons[i]);
            btn.setBorder(BorderFactory.createEmptyBorder());
            btn.setForeground(Color.WHITE);
            btn.setBackground(Color.decode("#18161d"));
            btn.setOpaque(true);
            btn.setPreferredSize(new Dimension(150, 40));
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            
            add(btn);


            if (i < buttons.length - 1){
                add(Box.createVerticalStrut(10)); 
            }
        }
        
       
    }
}
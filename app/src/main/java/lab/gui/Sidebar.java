package lab.gui;

import javax.swing.*;
import java.awt.*;

public class Sidebar extends JPanel {
    public Sidebar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(40, 40, 50));
        setPreferredSize(new Dimension(200, 300));
        
        String[] buttonTexts = {"Home", "Characters", "Episodes", "Settings", "Town"};

        // Dimension buttonSize = new Dimension(150, 40);
        
        add(Box.createVerticalStrut(10));
        for (int i = 0; i < buttonTexts.length; i++) {
            setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
            String text = buttonTexts[i];
            customButton btn = customButton.primaryButton(text); // Gunakan primaryButton
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            btn.setMaximumSize(new Dimension(180, 40));
            add(btn);

            if (i < buttonTexts.length - 1) {
                add(Box.createVerticalStrut(10));
            }
        }
    }
}
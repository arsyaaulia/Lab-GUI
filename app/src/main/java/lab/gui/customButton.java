package lab.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class customButton extends JButton {
    public customButton(String text, Color bgColor, Color textColor) {
        super(text);
        Dimension buttonSize = new Dimension(120, 30);
        setBackground(bgColor);
        setForeground(textColor);
        setBorder(BorderFactory.createEmptyBorder());
        setOpaque(true);
        setPreferredSize(buttonSize);

        // Simpan warna asli
        Color originalColor = bgColor;
        Color hoverColor = bgColor.brighter(); // Warna saat hover

        // efek hover
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(originalColor);
            }
        });
        
    }

    public static customButton pinkButton(String text) {
        return new customButton(text, Color.decode("#fb9dc9"), Color.BLACK);
    }

    public static customButton blueButton(String text) {
        return new customButton(text, Color.decode("#6be4fa"), Color.BLACK);
    }

    public static customButton primaryButton(String text) {
        return new customButton(text, Color.decode("#78708f"), Color.WHITE);
    }
}

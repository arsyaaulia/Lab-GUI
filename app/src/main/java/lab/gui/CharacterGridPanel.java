package lab.gui;

import javax.swing.*;
import java.awt.*;

public class CharacterGridPanel extends JScrollPane {
    private JPanel content;

    public CharacterGridPanel() {
        content = new JPanel(new GridLayout(0, 4, 15, 15));
        content.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        content.setBackground(Color.BLACK);
        setViewportView(content);

        setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);

        for (CharacterData data : CharacterData.getCharacterList()) {
            ImageIcon icon = loadImage(data.imagePath, 150, 150);
            CharacterCard card = new CharacterCard(data.name, icon);
            content.add(card);
        }
    }

    private ImageIcon loadImage(String path, int width, int height) {
        try {
            if (path == null || path.isBlank()) return null;
            java.net.URL imgURL = getClass().getResource(path);
            if (imgURL == null) return null;

            ImageIcon icon = new ImageIcon(imgURL);
            Image scaled = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(scaled);
        } catch (Exception e) {
            return null;
        }
    }
}

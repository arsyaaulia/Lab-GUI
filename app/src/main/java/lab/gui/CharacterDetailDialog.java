package lab.gui;

import javax.swing.*;
import java.awt.*;

public class CharacterDetailDialog extends JDialog {

    public CharacterDetailDialog(JFrame parent, String name, ImageIcon icon, String description) {
        super(parent, "Character Detail", true);

        setLayout(new BorderLayout());
        setSize(300, 400);
        setLocationRelativeTo(parent); // muncul di tengah

        JLabel nameLabel = new JLabel(name, JLabel.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        nameLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel iconLabel = new JLabel();
        iconLabel.setHorizontalAlignment(JLabel.CENTER);
        if (icon != null) {
            iconLabel.setIcon(icon);
        }

        JTextArea descArea = new JTextArea(description);
        descArea.setLineWrap(true);
        descArea.setWrapStyleWord(true);
        descArea.setEditable(false);
        descArea.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        add(nameLabel, BorderLayout.NORTH);
        add(iconLabel, BorderLayout.CENTER);
        add(new JScrollPane(descArea), BorderLayout.SOUTH);
    }
}

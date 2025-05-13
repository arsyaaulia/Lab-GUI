package lab.gui;

import javax.swing.*;
import java.awt.*;

public class BlogCard extends JPanel {
    
    public BlogCard(String title, String content) {
        setLayout(new BorderLayout(10, 10));
        setBackground(Color.WHITE);
        
        setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.GRAY, 0),
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));

        // Title
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel, BorderLayout.NORTH);

        // Content
        JTextArea contentArea = new JTextArea(content);
        contentArea.setLineWrap(true);
        contentArea.setWrapStyleWord(true);
        contentArea.setEditable(false);
        contentArea.setBackground(Color.WHITE);
        contentArea.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        
        add(new JScrollPane(contentArea), BorderLayout.CENTER);
    }
}
package lab.gui;

import javax.swing.*;
import java.awt.*;

public class DetailDialog extends JDialog {

    public DetailDialog(JFrame parent, String name, ImageIcon icon, String description) {
        super(parent, "Character Detail", true);

        setLayout(new BorderLayout());
        setSize(300, 450);
        setLocationRelativeTo(parent);

        // Title
        JLabel nameLabel = new JLabel(name, JLabel.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        nameLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        nameLabel.setBackground(Color.decode("#f6f6fe"));

        // Image - with proper scaling
        JLabel iconLabel = new JLabel();
        iconLabel.setHorizontalAlignment(JLabel.CENTER);
        if (icon != null) {
            // Scale image to reasonable size (e.g., 300x300 max while maintaining aspect ratio)
            int maxWidth = 300;
            int maxHeight = 300;
            
            // Calculate scaled dimensions
            int originalWidth = icon.getIconWidth();
            int originalHeight = icon.getIconHeight();
            
            int scaledWidth = originalWidth;
            int scaledHeight = originalHeight;
            
            // Scale down if too large
            if (originalWidth > maxWidth || originalHeight > maxHeight) {
                double widthRatio = (double)maxWidth / originalWidth;
                double heightRatio = (double)maxHeight / originalHeight;
                double ratio = Math.min(widthRatio, heightRatio);
                
                scaledWidth = (int)(originalWidth * ratio);
                scaledHeight = (int)(originalHeight * ratio);
            }
            
            Image scaledImage = icon.getImage().getScaledInstance(
                scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            iconLabel.setIcon(new ImageIcon(scaledImage));
        } else {
            iconLabel.setText("No Image Available");
            iconLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        }
        
        // Put image in a panel with some padding
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        imagePanel.add(iconLabel, BorderLayout.CENTER);
        

        // Description
        JTextArea descArea = new JTextArea(description);
        descArea.setLineWrap(true);
        descArea.setWrapStyleWord(true);
        descArea.setEditable(false);
        descArea.setFont(new Font("Arial", Font.PLAIN, 14));
        descArea.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        JScrollPane scrollPane = new JScrollPane(descArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        
        add(imagePanel, BorderLayout.CENTER);
        add(nameLabel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.SOUTH);
    }
}
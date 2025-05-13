package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardPanel extends JPanel {
    // Colors for the card states
    private final Color defaultColor = Color.WHITE;
    private final Color hoverColor = Color.decode("#f6f6fe");
    
    public CardPanel(CardData.CardItem item) {
        setLayout(new BorderLayout());
        setBackground(defaultColor);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setPreferredSize(new Dimension(200, 250));
        setCursor(new Cursor(Cursor.HAND_CURSOR)); // Change cursor to hand when hovering

        // Image
        JLabel imageLabel = new JLabel();
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(item.imagePath));
            Image scaled = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaled));
            // icon.setPreferredSize(new Dimension(180, 180)); 
            // imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        } catch (Exception e) {
            imageLabel.setText("No Image");
        }
        add(imageLabel, BorderLayout.CENTER);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        

        // Name
        JLabel nameLabel = new JLabel(item.name, SwingConstants.CENTER);
        nameLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(nameLabel, BorderLayout.SOUTH);

        // Tooltip
        setToolTipText("<html><b>" + item.name + "</b><br>" + item.detail + "</html>");

        // Mouse listener for hover and click effects
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
                // setBorder(BorderFactory.createLineBorder(Color.decode("#6a5acd"), 2));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(defaultColor);
                setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            // @Override
            // public void mouseClicked(MouseEvent e) {
            //     // Get the parent window
            //     Window window = SwingUtilities.getWindowAncestor(CardPanel.this);
                
            //     // Create and show detail dialog
            //     if (window instanceof JFrame) {
            //         JFrame parentFrame = (JFrame) window;
            //         ImageIcon icon = null;
            //         try {
            //             icon = new ImageIcon(getClass().getResource(item.imagePath));
            //         } catch (Exception ex) {
            //             icon = null;
            //         }
                    
            //         // // Create your detail dialog here (you'll need to implement CharacterDetailDialog)
            //         // new CharacterDetailDialog(
            //         //     parentFrame, 
            //         //     item.name, 
            //         //     icon, 
            //         //     item.detail
            //         // ).setVisible(true);
            //     }
            // }
        });
    }
}
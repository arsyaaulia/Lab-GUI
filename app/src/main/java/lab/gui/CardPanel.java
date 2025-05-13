package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardPanel extends JPanel {
    private final Color defaultColor = Color.WHITE;
    private final Color hoverColor = Color.decode("#f6f6fe");
    private final CardData.CardItem item; // Store the item as a field
    
    public CardPanel(CardData.CardItem item) {
        this.item = item; // Initialize the field
        setLayout(new BorderLayout());
        setBackground(defaultColor);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setPreferredSize(new Dimension(200, 250));
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Image
        JLabel imageLabel = new JLabel();
        ImageIcon icon = null;
        try {
            icon = new ImageIcon(getClass().getResource(item.imagePath));
            Image scaled = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaled));
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

        // Mouse listener
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(defaultColor);
                setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                Window win = SwingUtilities.getWindowAncestor(CardPanel.this);
                ImageIcon dialogIcon = null;
                try {
                    dialogIcon = new ImageIcon(getClass().getResource(item.imagePath));
                } catch (Exception ex) {
                    dialogIcon = null;
                }
                
                new DetailDialog(
                    (JFrame) win, 
                    item.name, 
                    dialogIcon, 
                    item.detail
                ).setVisible(true);
            }
        });
    }
}
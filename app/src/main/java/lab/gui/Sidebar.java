package lab.gui;

import javax.swing.*;
import java.awt.*;


public class Sidebar extends JPanel {
    private App app;

    public Sidebar(App app) {
        this.app = app;

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(40, 40, 50));
        setPreferredSize(new Dimension(200, 300));
        
        String[] buttonTexts = {"Home", "Characters", "Episodes", "Settings", "Town", "Song", "Merchandise", "Credits"};

        // Dimension buttonSize = new Dimension(150, 40);
        
        add(Box.createVerticalStrut(10));
        for (int i = 0; i < buttonTexts.length; i++) {
            setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
            String text = buttonTexts[i];
            customButton btn = customButton.primaryButton(text); // Gunakan primaryButton
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            btn.setMaximumSize(new Dimension(180, 40));
            
            
            btn.addActionListener(e -> {
                // JPanel newPanel = null;
                switch (text) {
                    case "Characters":
                        // newPanel = new CharacterGridPanel();
                        app.showContent(new CharacterGridPanel());
                        break;
                    case "Episodes":
                    // System.out.println("epi");
                        // newPanel = new EpisodePanel();
                        app.showContent(new EpisodePanel());
                        break;
                    default:
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this),
                            text + " Panel is not ready!");
                        return;
                }

                // JFrame window = (JFrame) SwingUtilities.getWindowAncestor(this);
                // Container contentPane = window.getContentPane();

                // Remove all and add the new panel to center
                // contentPane.removeAll();
                // contentPane.setLayout(new BorderLayout());

                // contentPane.add(this, BorderLayout.WEST); // Sidebar stays
                
                // contentPane.add(newPanel, BorderLayout.CENTER); // New panel appears
                // contentPane.revalidate();
                // contentPane.repaint();
            });
            
            add(btn);

            if (i < buttonTexts.length - 1) {
                add(Box.createVerticalStrut(10));
            }

            
        }
    }
}
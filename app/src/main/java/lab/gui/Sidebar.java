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
        
        String[] buttonTexts = {"Home", "All Characters", "Beyond Journey's End", "Aura the Guillotine", "Travels to Äußerst", "First-Class Mage Exam 1", "First-Class Mage Exam 2", "First-Class Mage Exam 3", "Credit"};

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
                    case "Home":
                        // newPanel = new CharacterGridPanel();
                        app.showContent(new HomePanel());
                        break;
                    case "All Characters":
                        // newPanel = new CharacterGridPanel();
                        app.showContent(new AllChar());
                        break;
                    case "Beyond Journey's End":
                    // System.out.println("epi");
                        // newPanel = new EpisodePanel();
                        app.showContent(new BeyondJourneysEnd());
                        break;

                    case "Aura the Guillotine":
                    // System.out.println("epi");
                        // newPanel = new EpisodePanel();
                        app.showContent(new AuratheGuillotine());
                        break;

                    case "Travels to Äußerst":
                    // System.out.println("epi");
                        // newPanel = new EpisodePanel();
                        app.showContent(new TravelstoAuberst());
                        break;
                    
                    case "First-Class Mage Exam 1":
                    // System.out.println("epi");
                        // newPanel = new EpisodePanel();
                        app.showContent(new FirstClassMageExam1());
                        break;

                    case "First-Class Mage Exam 2":
                    // System.out.println("epi");
                        // newPanel = new EpisodePanel();
                        app.showContent(new FirstClassMageExam2());
                        break;

                    case "First-Class Mage Exam 3":
                    // System.out.println("epi");
                        // newPanel = new EpisodePanel();
                        app.showContent(new FirstClassMageExam3());
                        break;
                    
                    case "Credit":
                    // System.out.println("epi");
                        // newPanel = new EpisodePanel();
                        app.showContent(new credit());
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
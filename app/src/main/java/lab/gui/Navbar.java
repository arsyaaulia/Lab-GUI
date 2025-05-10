package lab.gui;

import javax.swing.*;
import java.awt.*;

public class Navbar extends JPanel {
    private JPanel contentPanel;

    public Navbar() {
        //Aturan desainnya
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(0,60));
        setBackground(new Color(30, 30, 30));
        
        
        // Judul
        JLabel title = new JLabel("Bread Barbershop");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JPanel right = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,10));
        right.setOpaque(false); //atur transparansinya, tidak transparan
        
        

        // Dimension buttonSize = new Dimension(120,30);

        // Button Join Discord
        // JButton discord = new JButton("Join Discord");
        // discord.setBorder(BorderFactory.createEmptyBorder());
        // discord.setForeground(Color.BLACK);
        // discord.setBackground(Color.decode("#6be4fa"));
        // discord.setOpaque(true);
        // discord.setPreferredSize(buttonSize);

        //Button Kofi
        // JButton kofi = new JButton("Buy Us a Ko-Fi");
        // kofi.setBorder(BorderFactory.createEmptyBorder());
        // kofi.setForeground(Color.BLACK);
        // kofi.setBackground(Color.decode("#fb9dc9"));
        // kofi.setOpaque(true);
        // kofi.setPreferredSize(buttonSize);
        
        // Panggil object diatas tadi
        
        right.add(customButton.blueButton("Join Discord"));
        right.add(customButton.pinkButton("Buy Us a Coffee"));

        add(title, BorderLayout.WEST); 
        add(right, BorderLayout.EAST);
        
    }

    public void showContent(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
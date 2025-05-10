package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CharacterCard extends JPanel {
    private JLabel imageLabel;
    private JLabel nameLabel;
    

    public CharacterCard(String name, ImageIcon icon, String detail) {
        setLayout(new BorderLayout());
        setOpaque(true); // agar background tampil & bisa klik

        setFocusable(true); // bisa menangkap event
        setPreferredSize(new Dimension(200, 200));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        Color defaultColor = Color.WHITE;
        Color hoverColor = Color.decode("#e4e2e9");

        setBackground(defaultColor); // awalnya putih

        // Animasi hover: ini ditambahkan ke this (panel ini sendiri)
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(defaultColor);
            }

            // public void mouseClicked(MouseEvent e) {
            //     Window win = SwingUtilities.getWindowAncestor(CharacterCard.this);
            //     new CharacterDetailDialog((JFrame) win, name, icon, detail).setVisible(true);
            // }

            // public void mouseClicked(MouseEvent e) {
            //     JOptionPane.showMessageDialog(null, "Card clicked!");
            // }
        });

        // this.addMouseListener(new MouseAdapter() {
        //     // @Override
        //     public void mouseClicked(MouseEvent e) {
        //         System.out.println("Card clicked: " + data.name);
        
        //         Window win = SwingUtilities.getWindowAncestor(card);
        //         new CharacterDetailDialog((JFrame) win, data.name, icon, data.detail).setVisible(true);
        //     }
        // });
        

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        if (icon != null) {
            imageLabel.setIcon(icon);
        } else {
            imageLabel.setPreferredSize(new Dimension(150, 150));
            imageLabel.setBackground(Color.WHITE);
            // imageLabel.setOpaque(false);
        }

        nameLabel = new JLabel(name, JLabel.CENTER);

        add(imageLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        add(nameLabel, BorderLayout.SOUTH);

    }
}

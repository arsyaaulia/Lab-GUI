package lab.gui;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    public App() {
        setTitle("Tugas OOP");
        setSize(1200, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Navbar di atas
        add(new Navbar(), BorderLayout.NORTH);
        add(new Sidebar(), BorderLayout.WEST);
        // Sidebar dan Konten Karakter
        // Sidebar sidebar = new Sidebar();
        CharacterGridPanel characterGridPanel = new CharacterGridPanel();
        
        add(characterGridPanel, BorderLayout.CENTER); // Langsung tambahkan CharacterGridPanel

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            System.out.println("Menjalankan App...");
            new App();
        });
    }
    
}

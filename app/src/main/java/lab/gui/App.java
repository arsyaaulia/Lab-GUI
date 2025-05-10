package lab.gui;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    private JPanel mainContent;

    public App() {
        setTitle("Tugas OOP");
        setSize(1200, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        mainContent = new JPanel(new BorderLayout());
        // mainContent.add(new CharacterGridPanel(), BorderLayout.CENTER); // tampilan awal

        // Navbar di atas
        add(new Navbar(), BorderLayout.NORTH);
        add(new Sidebar(this), BorderLayout.WEST); //biar sidebar bisa panggil app
        // Sidebar dan Konten Karakter
        // Sidebar sidebar = new Sidebar();

        add(mainContent, BorderLayout.CENTER);

        // CharacterGridPanel characterGridPanel = new CharacterGridPanel();
        // add(characterGridPanel, BorderLayout.CENTER); // Langsung tambahkan CharacterGridPanel

        //tampilkan halaman awal
        showContent(new CharacterGridPanel());

        setVisible(true);
    }

    // Ganti container bagian isi saja, navbar dan sidebar tetap stay
    public void showContent(JComponent panel){
        mainContent.removeAll();
        mainContent.add(panel, BorderLayout.CENTER);
        mainContent.revalidate();
        mainContent.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // System.out.println("Menjalankan App...");
            new App();
        });
    }
    
}

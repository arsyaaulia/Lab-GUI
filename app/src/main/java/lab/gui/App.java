package lab.gui;

import java.awt.*;
import javax.swing.*;

public class App extends JFrame{
    public App(){
        setTitle("Tugas OOP");
        setSize (1200, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // tambahkan komponen utama
        add(new Navbar(), BorderLayout.NORTH);
        add(new Sidebar(), BorderLayout.WEST);
        add(new charGridPanel(), BorderLayout.CENTER);
        
        charGridPanel charGridPanel = new charGridPanel();
        JScrollPane scrollPane = new JScrollPane(charGridPanel);

        // Atur kebijakan scrollbar (vertical as needed, horizontal never)
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        add(scrollPane, BorderLayout.CENTER);

        
        // Sidebar sidebar = new Sidebar();
        // // CharacterPanel CharacterPanel = new CharacterPanel();
       
        // JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sidebar);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App();
        });
    }
}
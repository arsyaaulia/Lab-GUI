package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CharacterGridPanel extends JScrollPane {
    private JPanel content;
    private List<CharacterCard> characterCards;
    private static final int CARD_WIDTH = 150;
    private static final int CARD_HEIGHT = 200;
    private static final int GRID_COLUMN = 4;
    private static final int GRID_HGAP = 15;
    private static final int GRID_VGAP = 15;
    private static final int PANEL_BORDER = 15;

    public CharacterGridPanel() {
        content = new JPanel(new GridLayout(0, GRID_COLUMN, GRID_HGAP, GRID_VGAP));
        content.setBorder(BorderFactory.createEmptyBorder(PANEL_BORDER, PANEL_BORDER, PANEL_BORDER, PANEL_BORDER));
        content.setBackground(new Color(240, 240, 240));
        setViewportView(content);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        characterCards = new ArrayList<>();
        String[] characterNames = {
                "Manusia Lidi 1", "Manusia Lidi 2", "Manusia Lidi 3", "Manusia Lidi 4",
                "Bread", "Asta", "Aventurine", "Bailu",
                "Bronya", "Clara", "Dan Heng", "Fu Xuan",
                "Himeko", "Kafka", "Luocha", ""
        };
        String[] imagePaths = {
                "/Gambar1.png", "/Gambar2.png", "/Gambar3.png", "/Gambar4.png",
                "/Mr bread.jpeg", "/resources/gambar6.png", "/resources/gambar7.png", "/resources/gambar8.png",
                "/resources/gambar9.png", "/resources/gambar10.png", "/resources/gambar11.png", "/resources/gambar12.png",
                "/resources/gambar13.png", "/resources/gambar14.png", "/resources/gambar15.png", "/resources/gambar16.png"
        };

        for (int i = 0; i < Math.min(characterNames.length, imagePaths.length); i++) {
            final String name = characterNames[i];
            final String path = imagePaths[i];

            // Pemuatan gambar dilakukan di luar EDT agar tidak memblokir UI
            SwingWorker<ImageIcon, Void> worker = new SwingWorker<ImageIcon, Void>() {
                @Override
                protected ImageIcon doInBackground() throws Exception {
                    return loadImage(path, CARD_WIDTH, CARD_HEIGHT);
                }

                @Override
                protected void done() {
                    ImageIcon icon = null;
                    try {
                        icon = get();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    CharacterCard card = new CharacterCard(name, CARD_WIDTH, CARD_HEIGHT);
                    card.setImage(icon);
                    characterCards.add(card);
                    content.add(card);
                    content.revalidate();
                    content.repaint();
                }
            };
            worker.execute();
        }
    }

    private ImageIcon loadImage(String path, int width, int height) {
        try {
            java.net.URL imageURL = getClass().getResource(path);
            if (imageURL == null) {
                System.err.println("Gambar tidak ditemukan di path: " + path);
                return null;
            }
            ImageIcon icon = new ImageIcon(imageURL);
            if (icon.getImageLoadStatus() != MediaTracker.COMPLETE) {
                System.err.println("Gagal memuat gambar sepenuhnya: " + path + " - Status: " + icon.getImageLoadStatus());
                return null;
            }
            Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        } catch (Exception e) {
            System.err.println("Error loading image: " + path + " - " + e.getMessage());
            return null;
        }
    }
}
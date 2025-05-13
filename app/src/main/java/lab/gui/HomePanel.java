package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class HomePanel extends JPanel {
    public HomePanel() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Add header
        Header header = new Header("About Frieren : Beyond Journey's End");
        add(header, BorderLayout.NORTH);

        // Create panel for cards
        JPanel cardsPanel = new JPanel();
        cardsPanel.setLayout(new BoxLayout(cardsPanel, BoxLayout.Y_AXIS));
        cardsPanel.setBackground(Color.WHITE);

        // Get data and create cards
        List<BlogCardData.BlogCardItem> blogItems = BlogCardData.getHomePanel();
        for (BlogCardData.BlogCardItem item : blogItems) {
            BlogCard card = new BlogCard(item.title, item.content);
            card.setAlignmentX(Component.LEFT_ALIGNMENT);
            cardsPanel.add(card);
            cardsPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        }

        add(new JScrollPane(cardsPanel), BorderLayout.CENTER);
    }
}
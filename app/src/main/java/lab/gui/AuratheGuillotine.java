package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AuratheGuillotine extends JPanel {  // Changed to JPanel
    public AuratheGuillotine() {
        setLayout(new BorderLayout());

        // 1. Create cards (4 per row)
        List<CardData.CardItem> items = CardData.getAuratheGuillotineData();
        CardsContainer cardsContainer = new CardsContainer(items, 4);

        // 2. Create header at bottom
        Header Header = new Header("Aura the Guillotine");

        // Add components
        add(new JScrollPane(cardsContainer), BorderLayout.CENTER);
        add(Header, BorderLayout.NORTH);
    }
}
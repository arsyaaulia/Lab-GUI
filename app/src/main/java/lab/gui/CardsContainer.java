package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CardsContainer extends JPanel {
    public CardsContainer(List<CardData.CardItem> items, int columns) {
        setLayout(new GridLayout(0, columns, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (CardData.CardItem item : items) {
            add(new CardPanel(item));
        }
    }
}
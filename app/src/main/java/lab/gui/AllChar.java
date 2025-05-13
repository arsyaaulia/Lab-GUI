package lab.gui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JScrollPane;

public class AllChar extends ComingSoon{
    public AllChar(){
        setLayout(new BorderLayout());

        List<CardData.CardItem> items = CardData.getAllChar();
        CardsContainer cardsContainer = new CardsContainer(items, 4);

        // 2. Create header at bottom
        Header Header = new Header("All Character of Frieren : Beyond Journey's End");

        // Add components
        add(new JScrollPane(cardsContainer), BorderLayout.CENTER);
        add(Header, BorderLayout.NORTH);
    }
}

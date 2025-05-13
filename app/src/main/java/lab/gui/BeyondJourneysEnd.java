package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BeyondJourneysEnd extends ComingSoon {
    public BeyondJourneysEnd(){
        setLayout(new BorderLayout());
        
        List<CardData.CardItem> items = CardData.getBeyondJourneysEnd();
        CardsContainer cardsContainer = new CardsContainer(items, 4);

        Header header = new Header("Character of Beyond Journey's End");

        add(new JScrollPane(cardsContainer), BorderLayout.CENTER);
        add(header, BorderLayout.NORTH);
    }
}

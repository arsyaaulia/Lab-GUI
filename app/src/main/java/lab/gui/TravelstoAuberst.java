package lab.gui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TravelstoAuberst extends JPanel{
    public TravelstoAuberst(){
        setLayout(new BorderLayout());

        List<CardData.CardItem> items = CardData.getTravelstoAuberst();
        CardsContainer cardsContainer = new CardsContainer(items, 4);

        Header header = new Header("Travels to Äußerst");

        add(new JScrollPane(cardsContainer), BorderLayout.CENTER);
        add(header, BorderLayout.NORTH);
    }
}

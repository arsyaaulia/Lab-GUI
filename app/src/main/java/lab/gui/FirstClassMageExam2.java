package lab.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FirstClassMageExam2 extends JPanel{
    public FirstClassMageExam2(){
        setLayout(new BorderLayout());

        List<CardData.CardItem> items = CardData.getFirstClassMageExam2();
        CardsContainer cardsContainer = new CardsContainer(items, 4);

        Header header = new Header("First Class Mage Exam : Stage 1");

        add(new JScrollPane(cardsContainer), BorderLayout.CENTER);
        add(header, BorderLayout.NORTH);
    }
}

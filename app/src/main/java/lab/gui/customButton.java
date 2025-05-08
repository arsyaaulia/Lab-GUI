package lab.gui;
import javax.swing.*;
import java.awt.*;

public class customButton extends JButton{
    public customButton(String text, Color bgColor, Color textColor){
        super(text);
        Dimension buttonSize = new Dimension(120,30);
        setBackground(bgColor);
        setForeground(textColor);
        setBorder(BorderFactory.createEmptyBorder());
        setOpaque(true);
        setPreferredSize(buttonSize);
    }

    public static customButton pinkButton(String text){
        return new customButton(text, (Color.decode("#fb9dc9")), Color.BLACK);
    }

    public static customButton blueButton(String text){
        return new customButton(text, (Color.decode("#6be4fa")), Color.BLACK);
    }

    public static customButton primaryButton(String text){
        return new customButton(text, (Color.decode("#78708f")), Color.WHITE);
        
    }
}



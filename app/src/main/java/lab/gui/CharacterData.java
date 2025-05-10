package lab.gui;

import java.util.ArrayList;
import java.util.List;

public class CharacterData {
    public String name;
    public String imagePath;
    public String detail;

    public CharacterData(String name, String imagePath, String detail) {
        this.name = name;
        this.imagePath = imagePath;
        this.detail = detail;
    }

    public static List<CharacterData> getCharacterList() {
        List<CharacterData> list = new ArrayList<>();

       
        list.add(new CharacterData("Mr Bread", "/Mr Bread.jpeg", "A genius but egotistical barber who runs Bread Barbershop."));
        list.add(new CharacterData("Wilk", "/Wilk.jpeg", "A clumsy milk carton working as Mr. Bread's assistant."));
        list.add(new CharacterData("Choco", "/Choco.jpeg","A smart and strict cupcake who serves as the cashier and receptionist."));
        list.add(new CharacterData("Vanilla Ice Cream", "/Ice cream.jpeg","A soft-spoken and sweet ice cream character with a cute appearance"));
        list.add(new CharacterData("Baekseolgi", "/Baekseolgi.png","A white rice cake ninja seeking revenge on Mr. Bread"));
        list.add(new CharacterData("Chapssaltteok", "/Chapssaltteok.png", "A mustached rice cake mentor guiding Baekseolgi."));
        list.add(new CharacterData("Garaetteok", "/Garaetteok.png", "A long rice cake ninja devoted to preserving Korean tradition"));
        list.add(new CharacterData("Princess Cake", "/Princess Cake.png", "A spoiled and glamorous princess who loves to stand out"));
        list.add(new CharacterData("Potato Chips", "/Potato chips.jpeg", "A boastful troublemaker who often annoys Wilk"));
        list.add(new CharacterData("Macaron", "/Macaron.png", "A famous pop star known for her kindness and friendship with Wilk."));
        list.add(new CharacterData("Bilk", "/Bilk.png", "A green milk drink with glasses who often struggles with confidence"));
        list.add(new CharacterData("Cheese", "/Cheese.png", "A quiet friend of Wilk who loves playing video games."));
        list.add(new CharacterData("Sausage", "/Sausage.jpeg", "A cute pet dog who often joins the trio’s adventures"));
        list.add(new CharacterData("Juliet", "/Juliet.jpeg", "A graceful strawberry cake from a wealthy family secretly dating Romeo"));
        list.add(new CharacterData("Romeo", "/Romeo.jpeg", "A chocolate cake hopelessly in love with Juliet despite family rivalry."));
        


        return list;
    }
}

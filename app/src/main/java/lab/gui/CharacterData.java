package lab.gui;

import java.util.ArrayList;
import java.util.List;

public class CharacterData {
    public String name;
    public String imagePath;

    public CharacterData(String name, String imagePath) {
        this.name = name;
        this.imagePath = imagePath;
    }

    public static List<CharacterData> getCharacterList() {
        List<CharacterData> list = new ArrayList<>();

       
        list.add(new CharacterData("Mr Bread", "/Mr Bread.jpeg"));
        list.add(new CharacterData("Wilk", "/Wilk.jpeg"));
        list.add(new CharacterData("Choco", "/Choco.jpeg"));
        list.add(new CharacterData("Vanilla Ice Cream", "/Ice cream.jpeg"));
        list.add(new CharacterData("Baekseolgi", "/Baekseolgi.png"));
        list.add(new CharacterData("Chapssaltteok", "/Chapssaltteok.png"));
        list.add(new CharacterData("Garaetteok", "/Garaetteok.png"));
        list.add(new CharacterData("Princess Cake", "/Princess Cake.png"));
        list.add(new CharacterData("Potato Chips", "/Potato chips.jpeg"));
        list.add(new CharacterData("Macaron", "/Macaron.png"));
        list.add(new CharacterData("Bilk", "/Bilk.png"));
        list.add(new CharacterData("Cheese", "/Cheese.png"));
        list.add(new CharacterData("Wilk", "/Wilk.jpeg"));
        list.add(new CharacterData("Choco", "/Choco.jpeg"));
        list.add(new CharacterData("Vanilla Ice Cream", "/Ice cream.jpeg"));
        


        return list;
    }
}

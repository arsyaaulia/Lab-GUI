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
        list.add(new CharacterData("Aventurine", "/images/aventurine.png"));
        list.add(new CharacterData("Bailu", "/images/bailu.png"));
        list.add(new CharacterData("Argenti", "/images/argenti.png"));
        list.add(new CharacterData("Asta", "/images/asta.png"));
        list.add(new CharacterData("Aventurine", "/images/aventurine.png"));
        list.add(new CharacterData("Bailu", "/images/bailu.png"));
        list.add(new CharacterData("Argenti", "/images/argenti.png"));
        list.add(new CharacterData("Asta", "/images/asta.png"));
        list.add(new CharacterData("Aventurine", "/images/aventurine.png"));
        list.add(new CharacterData("", ""));


        return list;
    }
}

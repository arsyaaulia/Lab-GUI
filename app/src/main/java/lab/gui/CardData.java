package lab.gui;

import java.util.ArrayList;
import java.util.List;

public class CardData {
    public static class CardItem {
        public String name;
        public String imagePath;
        public String detail;

        public CardItem(String name, String imagePath, String detail) {
            this.name = name;
            this.imagePath = imagePath;
            this.detail = detail;
        }
    }

    public static List<CardItem> getAllChar() {
        List<CardItem> list = new ArrayList<>();
        list.add(new CardItem("Frieren", "/FrierenBaru/Fern.png", "An immortal elf mage who embarks on a journey to understand human emotions and the value of her past friendships."));
        list.add(new CardItem("Fern", "/FrierenBaru/Frieren.png", "Description..."));
        list.add(new CardItem("Stark", "/FrierenBaru/Stark.png", "Description..."));
        list.add(new CardItem("Himmel", "/FrierenBaru/Himmel.png", "Description..."));
        list.add(new CardItem("Heiter", "/FrierenBaru/Frieren.png", "Description..."));
        list.add(new CardItem("Eisen", "/FrierenBaru/Frieren.png", "Description..."));
        list.add(new CardItem("Flamme", "/FrierenBaru/Frieren.png", "Description..."));
        list.add(new CardItem("Demon King", "/FrierenBaru/Frieren.png", "Description..."));
        return list;
    }

    public static List<CardItem> getBeyondJourneysEnd() {
        List<CardItem> list = new ArrayList<>();
        list.add(new CardItem("Frieren", "/FrierenBaru/Fern.png", "An immortal elf mage who embarks on a journey to understand human emotions and the value of her past friendships."));
        list.add(new CardItem("Fern", "/FrierenBaru/Frieren.png", "Description..."));
        list.add(new CardItem("Stark", "/FrierenBaru/Stark.png", "Description..."));
        list.add(new CardItem("Himmel", "/FrierenBaru/Himmel.png", "Description..."));
        list.add(new CardItem("Heiter", "/FrierenBaru/Heiter.png", "Description..."));
        list.add(new CardItem("Eisen", "/FrierenBaru/Eisen.png", "Description..."));
        list.add(new CardItem("Flamme", "/FrierenBaru/Flamme.png", "Description..."));
        list.add(new CardItem("Qual", "/FrierenBaru/Qual.png", "Description..."));
        return list;
    }

    public static List<CardItem> getAuratheGuillotineData() {
        List<CardItem> list = new ArrayList<>();
        list.add(new CardItem("Aura", "/FrierenBaru/Aura.png", ""));
        list.add(new CardItem("Lügner", "/FrierenBaru/Lugner.png", "Description..."));
        list.add(new CardItem("Linie", "/FrierenBaru/Linnie.png", "Description..."));
        list.add(new CardItem("Draht", "/FrierenBaru/Draht.png", "Description..."));
        list.add(new CardItem("Graf Granat", "/FrierenBaru/Graf Granat.png", "Description..."));
        return list;
    }
}
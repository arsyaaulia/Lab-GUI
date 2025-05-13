package lab.gui;

import java.util.ArrayList;
import java.util.List;

public class BlogCardData {
    public static class BlogCardItem{
        public String title;
        public String content;

        public BlogCardItem(String title, String content) {
            this.title = title;
            this.content = content;
        }
    }

    public static List<BlogCardItem> getHomePanel(){
        List<BlogCardItem> list = new ArrayList<>();
        list.add(new BlogCardItem("Synopsis", "The demon king has been defeated, and the victorious hero party returns home before disbanding. The four—mage Frieren, hero Himmel, priest Heiter, and warrior Eisen—reminisce about their decade-long journey as the moment to bid each other farewell arrives. But the passing of time is different for elves, thus Frieren witnesses her companions slowly pass away one by one."+ "\n" + "\n" + "Before his death, Heiter manages to foist a young human apprentice called Fern onto Frieren. Driven by the elf's passion for collecting a myriad of magic spells, the pair embarks on a seemingly aimless journey, revisiting the places that the heroes of yore had visited. Along their travels, Frieren slowly confronts her regrets of missed opportunities to form deeper bonds with her now-deceased comrades."));

        list.add(new BlogCardItem("Publication", "Frieren: Beyond Journey's End is written by Kanehito Yamada and illustrated by Abe Tsukasa. The series began in Shogakukan's Weekly Shonen Sunday on April 28, 2020 in Issue 22-23 (2020). Its chapters have been compiled into individual tankobon volumes by Shogakukan, with the first volume published on August 18, 2020. As of March 18, 2025, fourteen volumes have been released."+ "\n" + "\n" + "In February 2021, Viz Media announced that they licensed the series for English release in North America, and the first volume was released on November 9, 2021. As of February 11, 2025, twelve volumes have been published, with the thirteenth volume releasing on May 13, 2025."));

        list.add(new BlogCardItem("Reception", "In March 2021, the Frieren: Beyond Journey's End manga announced that there were two million copies in circulation, which included both physical and digital sales.[5] By the release of Season 1 of the anime in September 2023, the manga had ten million copies in circulation.ORICON NEWS,[6] This figure doubled to 20 million after the season's conclusion in March 2024.[7] As of February 2025, the manga has over 24 million copies in circulation.[8]"));

        return list;
    }
}

package swing;

import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CharacterData extends JPanel {
    private List<Character> allCharacters;
    private int columns = 4; // Default number of columns

    public CharacterData() {
        this(null, false);
    }

    public CharacterData(String groupFilter) {
        this(groupFilter, false);
    }

    public CharacterData(String groupFilter, boolean isHome) {
        // Use GridBagLayout for more control over the grid
        setLayout(new GridBagLayout());
        setBackground(new Color(240, 240, 240)); // Light gray background
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Initialize characters
        allCharacters = createCharacterList();

        // Display filtered characters
        displayCharacters(groupFilter, isHome);
    }

    private List<Character> createCharacterList() {
        return new ArrayList<>(List.of(
                new Character("Hoshino Ichika", "/Ichika.png", "Leo/need", "Yakisoba buns", "August 11th",
                        "Leo/need's vocalist and guitarist. She seems aloof at first, but is friendly and caring when you get to know her. She has formed a band with her childhood friends, Saki, Honami and Shiho, and they have achieved their dream of becoming professional musicians. She writes lyrics for Leo/need's original songs and has recently begun making music using hatsune miku."),
                new Character("Tenma Saki", "/Saki.png", "Leo/need", "Snacks", "May 9th",
                        "Leo/need's keyboardist. Always cheerful, she's the funny one of the group. Having missed much of her school life due to illness. Saki treasures every precious memory with her loved ones and celebrates every youth milestone. Being there for those in need is important to her, and she pours these feelings into her songwriting."),
                new Character("Mochizuki Honami", "/Honami.png", "Leo/need", "Apple Pie", "October 27th",
                        "Leo/need's drummer. She excels in both sports and schoolwork and has a kind and caring personality. She used to be afraid of making decisions due to not wanting to hurt others, but her time in the band has made her a little braver about it. Honami now supports Leo/need with her strong spirit"),
                new Character("Hinomori Shiho", "/Shiho.png", "Leo/need", "Ramen, Salisbury steak", "January 8th",
                        "Leo/need's bassist. She is determined about music and is often misunderstood due to being a lone wolf who dislikes clinginess. Shiho deeply cares for her band members, alongside who she has chased and achieved the dream of becoming professional musicians."),
                new Character("Hanasoto Minori", "/Minori.png", "MORE MORE JUMP!", "Salmon", "April 14th",
                        "A wide-eyed hard worker. Minori was initially the only member of MORE MORE JUMP! with no prior idol experience, but her work with the group has led to her garnering a fanbase and performing in her first solo show. Now, she continues to work towards her goal of becoming an A-list idol worthy of performing at the Dome."),
                new Character("Kiritani Haruka", "/Haruka.png", "MORE MORE JUMP!", "Anything sweet", "October 5th",
                        "Former member of ASRUN, an idol group known nationwide, The MORE MORE JUMP! solo show has left Haruka more ready than ever to pursue her idol career. Along with Minori, she has decided to switch over to credit-based course and focus all her energy into being an idol."),
                new Character("Momoi Airi", "/Airi.png", "MORE MORE JUMP!", "Japanese sweets", "March 19th",
                        "Former member of the idol group QT. She inspires the other members of MORE MORE JUMP! with her intense passion and pride for being an idol. Airi also excels at planning and scheduling, allowing her to proactively manage MORE MORE JUMP!'s work in the absence of an agency."),
                new Character("Hinomori Shizuku", "/Shizuku.png", "MORE MORE JUMP!", "Udon noodles, Tofu skin",
                        "December 6th",
                        "Former lead of the ever-popular idol group Cheerful * Days. Not getting along well with the other members, Shizuku ended up leaving the group with a heavy heart. However, a joint TV appearance with her old group gave her the chance to open up about the topic, With newfound courage, Shizuku is able to move on and move forward."),
                new Character("Azusawa Kohane", "/Kohane.png", "Vivid BAD SQUAD", "Peach buns, Sesame balls",
                        "March 2nd",
                        "Once a timid girl, Kohane has since gained confidence in her singing thanks to the support of her team members and training under Taiga, a member of the group that put on the legendary event RAD WEEKEND. Despite feeling frustrated after an overwhelming defeat at the hands of Taiga, Kohane has used that frustration to get back on her feet and reaffirm her drive to surpass RAD WEEKEND."),
                new Character("Shiraishi An", "/An.png", "Vivid BAD SQUAD", "Rum raisin ice cream", "July 26th",
                        "Cheerful and honest, An helps out at Weekend Garage. She was working towards surpassing her father's team's legendary event, RAD WEEKEND, when she learned an earth-shattering secret about Nagi, his teammate and her role model. After learning about Nagi's hopes from her father, An has bounced back, pledging once more to surpass the legend."),
                new Character("Shinonome Akito", "/Akito.png", "Vivid BAD SQUAD", "Pancakes, Cheesecake",
                        "November 12th",
                        "Incredibly hard-working, Akito puts everything he has into training to surpass the legendary event RAD WEEKEND. His efforts almost came to a screeching halt after he learned the truth behind the event, but his strong desire to pursue his dream has fueled him to keep going"),
                new Character("Aoyagi Toya", "/Toya.png", "Vivid BAD SQUAD", "Coffee, Cookies", "May 25th",
                        "The son of a classical musician and a prodigy. Toya aims to surpass the legendary event RAD WEEKEND and has started composing for Vivid BAD SQUAD. Despite initially feeling overwhelmed after seeing the heights he would need to climb to reach that goal, he now hopes to use his experience to surmount this wall with his team and see the view from the top."),
                new Character("Tenma Tsukasa", "/Tsukasa.png", "Wonderlands X Showtime",
                        "Acqua pazza, Ginger fried pork", "May 17th",
                        "Aspiring world's greatest star and troupe leader of Wonderlands X Showtime. After gaining a wide range of experiences as a phoenix wonderland cast member. Tsukasa desires to learn more and broaden his horizons. Together with his fellow troupe members, he has decided to say farewell to the Wonder Stage to take the next step of his journey."),
                new Character("Otori Emu", "/Emu.png", "Wonderlands X Showtime", "Taiyaki", "September 9th",
                        "A bundle of energy and innocence. Emu dreams of carrying the torch for her grandfather's theme park, Phoenix Wonderland, and was prepared to part ways with the rest of Wonderlands X Showtime as they pursued their dreams. However, with encouragement from her brothers and fellow troupe members, she has decided that in order for her to grow, she needs to venture out into the world."),
                new Character("Kusanagi Nene", "/Nene.png", "Wonderlands X Showtime", "Grapefruit", "July 20th",
                        "A girl dreaming of being an international musical star. Though Nene lost confidence in her ability to sing during a rehearsal for an important show, this led her to reaffirm her passion for singing. Together with the other Wonderlands X Showtime members, she is determined to take in the many experiences the world has to offer."),
                new Character("Kamishiro Rui", "/Rui.png", "Wonderlands X Showtime", "Soda candy", "June 24th",
                        "A carefree genius director. Formerly a solo performer, Rui found a new home among the Wonderlands X Showtime members, who accepted his bold ideas. In his search for a way for the troupe to stay together despite chasing different dreams, he has devised an arrangement that lets them put on shows together while each still following their chosen path."),
                new Character("Yoisaki Kanade", "/Kanade.png", "Nigthcord at 25:00", "Instant noodles, Canned foods",
                        "February 10th",
                        "Nightcord at 25:00's composer. Kanade was delighted as her songs started to evoke more and more emotion from Mafuyu, but this happiness was cut short when Mafuyu's mother asked Kanade to stay away from her daughter. Finding this woman's behavior disconcerting. Kanade refused and chose to stick by Mafuyu's side."),
                new Character("Asahina Mafuyu", "/Mafuyu.png", "Nigthcord at 25:00", "Mom's home cooking",
                        "January 27th",
                        "Nigthcord at 25:00's lyricist. Mafuyu lost her sense of self amid pressure to be the 'good, kind girl' her mother expected her to be, but found refuge within music and Nigthcord at 25:00. Faced with the threat of her only safe space being taken away, she has run away from home and sought Kanade's help."),
                new Character("Shinonome Ena", "/Ena.png", "Nigthcord at 25:00", "Pancakes, Cheesecake", "April 30th",
                        "Nigthcord at 25:00's illustrator. Despite wrestling with her belief that she has no artistic talent and being at the receiving end of the criticism. Ena persists in creating art. She has a straightforward personality and was initially frustrated with Mafuyu for not expressing her true feelings to her mother. However, noticing the changes in Mafuyu since they first met, Ena has resolved to look after her dear friend."),
                new Character("Akiyama Mizuki", "/Mizuki.png", "Nigthcord at 25:00", "Curry rice, French fries",
                        "August 27th",
                        "Nigthcord at 25:00's video editor. Mizuki wanted to do something about the worsening relationship between Mafuyu and her mother, but felt unable to offer anything knowing that they are running away from their problems. However, Mizuki realized that there are things that can be gained by running away, and told Mafuyu that doing so is always an option.")

        ));
    }

    private void displayCharacters(String groupFilter, boolean isHome) {
        removeAll(); // Clear existing components

        List<Character> toDisplay = getFilteredCharacters(groupFilter, isHome);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding around cards
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST; // Force top-left alignment

        int row = 0;
        int col = 0;

        for (Character character : toDisplay) {
            gbc.gridx = col;
            gbc.gridy = row;
            gbc.weightx = 0; // Don't expand horizontally
            gbc.weighty = 0; // Don't expand vertically

            Card card = new Card(character);
            add(card, gbc);

            col++;
            if (col >= columns) {
                col = 0;
                row++;
            }
        }

        // Add empty filler panel to take remaining space
        gbc.gridx = 0;
        gbc.gridy = row + 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0; // This will push content up
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.SOUTH; // Anchor glue to bottom
        add(Box.createGlue(), gbc);

        revalidate();
        repaint();
    }

    public void setColumns(int columns) {
        this.columns = columns;
        revalidate();
        repaint();
    }

    private List<Character> getFilteredCharacters(String groupFilter, boolean isHome) {
        if ("Top 5".equalsIgnoreCase(groupFilter)) {
            return allCharacters.stream()
                    .filter(c -> "Shiraishi An".equals(c.name) || "Leo/need".equals(c.group))
                    .collect(Collectors.toList());
        } else if (isHome) {
            return allCharacters.stream()
                    .limit(15)
                    .collect(Collectors.toList());
        } else if (groupFilter == null) {
            return new ArrayList<>(allCharacters);
        } else {
            return allCharacters.stream()
                    .filter(c -> c.group.equalsIgnoreCase(groupFilter))
                    .collect(Collectors.toList());
        }
    }
}
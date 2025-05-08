package swing;
import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class Card extends JButton {

    public Card(Character character) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);

        Dimension size = new Dimension(200, 250);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);

        JLabel charImage = new JLabel();
        charImage.setAlignmentX(CENTER_ALIGNMENT);

        URL imgUrl = getClass().getResource(character.imagePath);
        if (imgUrl != null) {
            ImageIcon original = new ImageIcon(imgUrl);
            Image originalImage = original.getImage();
            int width = 180; 
            int height = (originalImage.getHeight(null) * width) / originalImage.getWidth(null); 

            int maxHeight = 180;
            if (height > maxHeight) {
                height = maxHeight;
                width = (originalImage.getWidth(null) * height) / originalImage.getHeight(null); 
            }

            Image scaled = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            charImage.setIcon(new ImageIcon(scaled));
        } else {
            System.err.println("Image not found: " + character.imagePath);
        }

        JLabel charName2 = new JLabel(character.name);
        charName2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        charName2.setAlignmentX(CENTER_ALIGNMENT);

        add(Box.createVerticalStrut(10));
        add(charImage);
        add(Box.createVerticalStrut(10)); 
        add(charName2);
        add(Box.createVerticalGlue()); 

        addActionListener(e -> {
            new CharacterDetail(character).setVisible(true);
        });
    }
}

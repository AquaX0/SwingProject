package swing;

import javax.swing.*;
import java.awt.*;

public class CharacterDetail extends JFrame {
    public CharacterDetail(Character character) {
        setTitle(character.name + " - Detail");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout(10, 10));

        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 0));
        leftPanel.setBackground(Color.WHITE);
        leftPanel.setPreferredSize(new Dimension(220, 0));

        ImageIcon icon = new ImageIcon(getClass().getResource(character.imagePath));
        Image originalImage = icon.getImage();
        Image scaledImage = originalImage.getScaledInstance(200, -1, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel nameLabel = new JLabel(character.name, SwingConstants.CENTER);
        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        nameLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        leftPanel.add(imageLabel, BorderLayout.CENTER);
        leftPanel.add(nameLabel, BorderLayout.SOUTH);

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.X_AXIS));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 10));
        infoPanel.setBackground(Color.WHITE);

        JLabel birthdayLabel = new JLabel("Birthday: " + character.birthday);
        birthdayLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        birthdayLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel foodLabel = new JLabel("Favorite food: " + character.food);
        foodLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        foodLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        infoPanel.add(birthdayLabel);
        infoPanel.add(Box.createVerticalStrut(5));
        infoPanel.add(foodLabel);

        JTextArea bioArea = new JTextArea(character.bio);
        bioArea.setWrapStyleWord(true);
        bioArea.setLineWrap(true);
        bioArea.setEditable(false);
        bioArea.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        bioArea.setBackground(Color.WHITE);

        JScrollPane bioScroll = new JScrollPane(bioArea);
        bioScroll.setBorder(BorderFactory.createTitledBorder("Bio"));

        JPanel rightPanel = new JPanel(new BorderLayout(10, 10));
        rightPanel.setBackground(Color.WHITE);
        rightPanel.add(infoPanel, BorderLayout.NORTH);
        rightPanel.add(bioScroll, BorderLayout.CENTER);

        // === MAIN LAYOUT ===
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);
    }
}

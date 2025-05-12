package swing;

import java.awt.*;
import javax.swing.*;

public class Sidebar extends JPanel {
    private JSplitPane splitPane;

    public Sidebar(JSplitPane splitPane) {
        this.splitPane = splitPane;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.DARK_GRAY);
        setBorder(BorderFactory.createEmptyBorder(1,10,1,10));

        add(Box.createVerticalStrut(10));
        add(createButton("Home", "Home"));
        add(Box.createVerticalStrut(10));
        add(createButton("All Characters", "All"));
        add(Box.createVerticalStrut(10));
        add(createButton("Personal Top 5", "Top 5"));
        add(Box.createVerticalStrut(10));
        add(createButton("Leo/need", "Leo/need"));
        add(Box.createVerticalStrut(10));
        add(createButton("More More Jump", "MORE MORE JUMP!"));
        add(Box.createVerticalStrut(10));
        add(createButton("Vivid BAD SQUAD", "Vivid BAD SQUAD"));
        add(Box.createVerticalStrut(10));
        add(createButton("Wonderlands X Showtime", "Wonderlands X Showtime"));
        add(Box.createVerticalStrut(10));
        add(createButton("Nightcord at 25:00", "Nightcord at 25:00"));
    }

    private JButton createButton(String label, String groupFilter) {
        JButton button = new SideButtons(label);
        button.addActionListener(new Filter(splitPane, groupFilter));
        return button;
    }
}
package swing;
import java.awt.*;
import javax.swing.*;

public class Sidebar extends JPanel {
    public Sidebar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.DARK_GRAY);
        setBorder(BorderFactory.createEmptyBorder(1,10,1,10));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Home"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("All Characters"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Personal Top 5"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Leo/Need"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("More More Jump"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Vivid Bad Squad"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Wonderland x Showtime"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Nightcord at 25:00"));
    }
}
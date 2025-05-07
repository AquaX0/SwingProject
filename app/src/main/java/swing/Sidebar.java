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
        add(new SideButtons("Characters"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Tier List"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Songs"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Cover Alts"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Events"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Cards"));
        add(Box.createVerticalStrut(10));
        add(new SideButtons("Tools"));
    }
}
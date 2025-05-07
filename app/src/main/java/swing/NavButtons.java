package swing;
import java.awt.*;
import javax.swing.*;

public class NavButtons extends JButton {
    public NavButtons(String text, String color) {
        setText(text);
        setForeground(Color.WHITE);
        setBackground(Color.decode(color));
        setFont(new Font("Segoe UI", Font.BOLD, 12));
        setBorder(BorderFactory.createEmptyBorder(7,10,7,10)); 
    }
}
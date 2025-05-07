package swing;
import java.awt.*;
import javax.swing.*;

public class SideButtons extends JButton {
    public SideButtons(String text) {
        setText(text);
        setForeground(Color.WHITE);
        setBackground(Color.GRAY);
        setFont(new Font("Segoe UI", Font.BOLD, 15));
        setAlignmentX(CENTER_ALIGNMENT);
        setBorder(BorderFactory.createEmptyBorder());
        setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        
    }
}
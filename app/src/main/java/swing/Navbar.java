package swing;
import java.awt.*;
import javax.swing.*;

public class Navbar extends JPanel{
    public Navbar() {
        setLayout(new BorderLayout());
        setBackground(Color.decode("#2d2d2d"));
        setBorder(BorderFactory.createEmptyBorder(7, 10, 7, 15));

        add(new Title(), BorderLayout.WEST);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setOpaque(false);
        buttonPanel.add(new NavButtons("Join Discord", "#2F23FF"));
        buttonPanel.add(new NavButtons("Buy us a Ko-Fi", "#FF0074"));
        
        add(buttonPanel, BorderLayout.EAST);
    }
}

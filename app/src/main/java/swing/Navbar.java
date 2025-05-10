package swing;
import java.awt.*;
import javax.swing.*;

public class Navbar extends JPanel {
    
    // Constructor for the navbar
    public Navbar() {
        setLayout(new BorderLayout());
        setBackground(Color.decode("#232323"));
        setBorder(BorderFactory.createEmptyBorder(7, 10, 7, 15)); 

        add(new Title(), BorderLayout.WEST);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        NavButtons discordButton = new NavButtons("Join Discord", "#5865F2");
        NavButtons kofiButton = new NavButtons("Buy us a Ko-Fi", "#E53C5B");
        discordButton.addActionListener(new Discord(discordButton));
        kofiButton.addActionListener(new Kofi(kofiButton));
        buttonPanel.setOpaque(false);
        buttonPanel.add(discordButton);
        buttonPanel.add(kofiButton);
        
        add(buttonPanel, BorderLayout.EAST);
        
    }
}
package swing;
import java.awt.*;
import javax.swing.*;

public class Characters extends JPanel{
    public Characters () {
        setLayout(new GridLayout(0, 4, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));
        setBackground(Color.GRAY);

        add(new Card("Hoshino Ichika", "/Ichika.png"));
        add(new Card("Tenma Saki", "/Saki.png"));
        add(new Card("Mochizuki Honami", "/Honami.png"));
        add(new Card("Hinomori Shiho", "/Shiho.png"));
        add(new Card("Hanasoto Minori", "/Minori.png"));
        add(new Card("Kiritani Haruka", "/Haruka.png"));
        add(new Card("Momoi Airi", "/Airi.png"));
        add(new Card("Hinomori Shizuku", "/Shizuku.png"));
        add(new Card("Azusawa Kohane", "/Kohane.png"));
        add(new Card("Shiraishi An", "/An.png"));
        add(new Card("Shinonome Akito", "/Akito.png"));
        add(new Card("Aoyagi Toya", "/Toya.png")); 
        add(new Card("Otori Emu", "/Emu.png"));
        add(new Card("Kusanagi Nene", "/Nene.png"));
        add(new Card("Shinonome Ena", "/Ena.png"));
    }
}

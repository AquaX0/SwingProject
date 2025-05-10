package swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Kofi implements ActionListener{
    
    JButton button;

    public Kofi(JButton button) {
        this.button = button;
    }

    public void openWebPage(String url){
        try {         
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        openWebPage("https://ko-fi.com/");
    }
}
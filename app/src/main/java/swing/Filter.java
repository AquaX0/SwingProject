package swing;
import java.awt.event.*;
import javax.swing.*;

public class Filter implements ActionListener {
    private JSplitPane splitPane;
    private String groupName;

    public Filter(JSplitPane splitPane, String groupName) {
        this.splitPane = splitPane;
        this.groupName = groupName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JPanel filteredPanel = new CharacterData(groupName); 

        JScrollPane scrollPane = new JScrollPane(filteredPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(32);
        scrollPane.setBorder(null); 

        splitPane.setDividerLocation(240);
        splitPane.setRightComponent(scrollPane); 
    }
}

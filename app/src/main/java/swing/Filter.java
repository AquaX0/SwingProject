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
        JPanel newPanel;

        if ("Home".equalsIgnoreCase(groupName)) {
            newPanel = new CharacterData(null, true);
        } else if ("All".equalsIgnoreCase(groupName)) {
            newPanel = new CharacterData(null, false);
        } else {
            newPanel = new CharacterData(groupName, false);
        }

        JScrollPane scrollPane = new JScrollPane(newPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(32);
        scrollPane.setBorder(null);

        splitPane.setDividerLocation(240);
        splitPane.setRightComponent(scrollPane);
    }
}

package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FlipflopTableViewer extends JPanel {
    public JButton menuButton = new JButton("Menu");
    public FlipflopTableViewer(){
        this.setPreferredSize(new Dimension(500,500));
        this.add(menuButton);
        menuButton.setBounds(100,100,100,100);
    }
    public void menuButtonListener(ActionListener listenformenuButton){menuButton.addActionListener(listenformenuButton);}
}

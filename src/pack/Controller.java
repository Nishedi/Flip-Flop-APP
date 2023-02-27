package pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    MainFrame mainFrame = new MainFrame();
    public Controller(){
        mainFrame.JK(new JKbuttonListener());
        mainFrame.D(new DbuttonListener());
        mainFrame.T(new TbuttonListener());
        mainFrame.SR(new RSbuttonListener());
    }
    class JKbuttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainFrame.add(mainFrame.flipflopTableViewer);
        }
    }
    class DbuttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("D");
        }
    }
    class TbuttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("T");
        }
    }
    class RSbuttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("RS");
        }
    }
}

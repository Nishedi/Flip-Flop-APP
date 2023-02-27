package pack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{

    public JButton JK = new JButton("JK");
    public JButton D = new JButton("D");
    public JButton T = new JButton("T");
    public JButton SR = new JButton("SR");
    public FlipflopTableViewer flipflopTableViewer = new FlipflopTableViewer();

    public MainFrame(){
        this.setTitle("True table of Flip-Flop");
        this.setSize(530,500);
        this.getContentPane().setBackground(Color.CYAN);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JPanel chosePanel = new JPanel();
        chosePanel.setPreferredSize(new Dimension(250,500));
        chosePanel.setLayout(new FlowLayout(FlowLayout.CENTER,55,50));
        chosePanel.setBackground(Color.cyan);
        JPanel textPanel = new JPanel();
        textPanel.setPreferredSize(new Dimension(250,500));
        textPanel.setLayout(new FlowLayout());
        JK.setPreferredSize(new Dimension(200,50));
        D.setPreferredSize(new Dimension(200,50));
        T.setPreferredSize(new Dimension(200,50));
        SR.setPreferredSize(new Dimension(200,50));
        chosePanel.add(JK);
        chosePanel.add(D);
        chosePanel.add(T);
        chosePanel.add(SR);
        textPanel.setBackground(Color.GREEN);
        this.add(chosePanel);
        this.add(textPanel);
        this.setVisible(true);
    }
    public void JK(ActionListener actionListener){JK.addActionListener(actionListener);}
    public void D(ActionListener actionListener){D.addActionListener(actionListener);}
    public void T(ActionListener actionListener){T.addActionListener(actionListener);}
    public void SR(ActionListener actionListener){SR.addActionListener(actionListener);}

}

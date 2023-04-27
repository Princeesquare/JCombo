import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCombo extends JFrame implements ActionListener {
    JRadioButton rb1, rb2, rb3, rb4;
    JLabel l1, l2, l3;
    public static void main(String[] args) {
        new JCombo();

    }

    public JCombo(){
        setSize(230, 215);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        rb1 = new JRadioButton("Bird");
        rb1.addActionListener(this);
        rb2 = new JRadioButton("Dog");
        rb2.addActionListener(this);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(rb1);bg1.add(rb2);

        rb3 = new JRadioButton("Green");
        rb3.addActionListener(this);
        rb4 = new JRadioButton("Yellow");
        rb4.addActionListener(this);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rb3);bg2.add(rb4);

        l1 = new JLabel("image label");
        l2 = new JLabel("Choose: ");
        l3 = new JLabel("Black Color?");

        add(l2);add(rb1);add(rb2);add(l3);add(rb3);add(rb4);add(l1);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rb1){
            ImageIcon img = new ImageIcon( new ImageIcon("bird.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            l1.setIcon(img);
        }


    }
}

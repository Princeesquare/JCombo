import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLearnRB extends JFrame implements ActionListener {
    JRadioButton rb1, rb2, rb3, rb4;
    JLabel l1, l2, l3;
    public static void main(String[] args) {
        new JLearnRB();

    }

    public JLearnRB(){
        //Setting the Frame
        setSize(230, 215);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);

        //Creating RadioButtons
        rb1 = new JRadioButton("Bird");
        rb1.addActionListener(this);
        rb2 = new JRadioButton("Dog");
        rb2.addActionListener(this);

        //Adding RadioButtons to a group
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(rb1);bg1.add(rb2);

        rb3 = new JRadioButton("Green");
        rb3.addActionListener(this);
        rb4 = new JRadioButton("Pink");
        rb4.addActionListener(this);

        //Adding RadioButtons to a group
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rb3);bg2.add(rb4);

        //Creating Labels
        l1 = new JLabel();
        l2 = new JLabel("Choose: ");
        l3 = new JLabel("Black Color?");

        //Adding all Components to the Form
        add(l2);add(rb1);add(rb2);add(l3);add(rb3);add(rb4);add(l1);

        //Making the frame visible
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rb1){
            ImageIcon img = new ImageIcon( new ImageIcon("bird.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            l1.setIcon(img);
        }
        else if (e.getSource() == rb2){
            ImageIcon img = new ImageIcon( new ImageIcon("dog.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            l1.setIcon(img);
        }
        else if (e.getSource() == rb3){
            getContentPane().setBackground(Color.GREEN);
        }
        else if (e.getSource() == rb4){
            getContentPane().setBackground(Color.PINK);
        }
    }
}

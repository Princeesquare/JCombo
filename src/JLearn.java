import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLearn extends JFrame implements ActionListener {
    public static void main(String[] args) {

    }
    public JLearn()
    {
        //Setting the Frame
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

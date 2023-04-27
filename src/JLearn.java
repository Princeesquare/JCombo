import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLearn extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new JLearn();

    }

    private final JTextArea T;
    private final JComboBox<Object> Cb1;
    private final JComboBox<Object> Cb2;
    public JLearn()
    {
        //Setting the Frame
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);

        T = new JTextArea(10, 30);
        Cb1 = new JComboBox<>();

        Cb1.addItem("Choose Back Color");
        Cb1.addItem("Green");
        Cb1.addItem("Gray");
        add(Cb1);

        Cb2 = new JComboBox<>();

        Cb2.addItem("Choose Text Color");
        Cb2.addItem("Red");
        Cb2.addItem("Yellow");

        add(Cb2);
        add(T);

        Cb2.addActionListener(this);
        Cb1.addActionListener(this);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Cb1.getSelectedItem() == "Green")
            T.setBackground(Color.GREEN);
        else if (Cb1.getSelectedItem() == "Gray")
            T.setBackground(Color.GRAY);
        if (Cb2.getSelectedItem() == "Red")
            T.setForeground(Color.RED);
        else if (Cb2.getSelectedItem() == "Yellow")
            T.setForeground(Color.YELLOW);
        }
}

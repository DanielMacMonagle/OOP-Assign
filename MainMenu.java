import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenu { //extends AddCarGUI{ .... JB - remove this inheritance as this GUI shouldn't inherit from AddCarGUI

    public static void main(String[] args) {

        // ----- Menu Image ----- //

        JFrame f = new JFrame();
        f.setTitle("MacMonagle Car Sales");

        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel(new GridBagLayout());

        JButton b1 = new JButton("Add Car");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //How do I move to the AddCarGUI page?
                new AddCarGUI().main(null); //line of code added by JB here to make "Add Car" GUI appear
            }
        });

        JButton b2 = new JButton("Sell Car");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //How do I move to the SellCarGUI page?
            }
        });

        JButton b3 = new JButton("Quit");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);

        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);

        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = -2;
        c.gridy=-2;
        p.add(b1);

        c.gridx = 0;
        c.gridy=0;
        p.add(b2);

        c.gridx = 2;
        c.gridy= 2;
        p.add(b3);

        f.add(p);

        f.setVisible(true);

    }
}

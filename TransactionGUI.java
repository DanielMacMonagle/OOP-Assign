import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransactionGUI extends JFrame {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("MacMonagle Car Sales");

        f.setSize(600, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        p.setLayout(null);//one line of code added here by JB

        // ----- Forename ----- //
        JLabel labelForename;
        JTextField forenameField;
        labelForename = new JLabel("Forename: ",SwingConstants.RIGHT); //Make the text appear on the right of the label
        forenameField = new JTextField(15);
        labelForename.setBounds(150,40,100,30);
        p.add(labelForename);
        forenameField.setBounds(250,40,150,30);
        p.add(forenameField);

        // ----- Surname ----- //
        JLabel labelSurname;
        JTextField surnameField;
        labelSurname = new JLabel("Surname: ",SwingConstants.RIGHT);
        surnameField = new JTextField(15);
        labelSurname.setBounds(150,80,100,30);
        p.add(labelSurname);
        surnameField.setBounds(250,80,150,30);
        p.add(surnameField);

        // ----- Registration ----- //
        JLabel labelRegistration;
        JTextField RegistrationField;
        labelRegistration = new JLabel("Registration: ",SwingConstants.RIGHT);
        RegistrationField = new JTextField(11);
        labelRegistration.setBounds(150,120,100,30);
        p.add(labelRegistration);
        RegistrationField.setBounds(250,120,150,30);
        p.add(RegistrationField);

        // ----- Card Number ----- //
        JLabel labelCardNumber;
        JTextField CardNumberField;
        labelCardNumber = new JLabel("Card Number: ",SwingConstants.RIGHT);
        CardNumberField = new JTextField(16);
        labelCardNumber.setBounds(150,160,100,30);
        p.add(labelCardNumber);
        CardNumberField.setBounds(250,160,150,30);
        p.add(CardNumberField);

        // ----- CVV ----- //
        JLabel labelCVV;
        JTextField CVVField;
        labelCVV = new JLabel("CVV: ",SwingConstants.RIGHT);
        CVVField = new JTextField(3);
        labelCVV.setBounds(150,200,100,30);
        p.add(labelCVV);
        CVVField.setBounds(250,200,150,30);
        p.add(CVVField);

        // ----- Bank Name ----- //
        JLabel labelBankName;
        JTextField BankNameField;
        labelBankName = new JLabel("Bank Name: ",SwingConstants.RIGHT);
        BankNameField = new JTextField(15);
        labelBankName.setBounds(150,240,100,30);
        p.add(labelBankName);
        BankNameField.setBounds(250,240,150,30);
        p.add(BankNameField);

        // ----- Bank Number ----- //
        JLabel labelBankNumber;
        JTextField BankNumberField;
        labelBankNumber = new JLabel("Bank Number: ",SwingConstants.RIGHT);
        BankNumberField = new JTextField(15);
        labelBankNumber.setBounds(150,280,100,30);
        p.add(labelBankNumber);
        BankNumberField.setBounds(250,280,150,30);
        p.add(BankNumberField);

        // ----- Submit Label ----- //
        JLabel labelErrorMessage;
        labelErrorMessage = new JLabel("All Fields must be filled in order to continue");
        labelErrorMessage.setBounds(200,320,400,30);
        p.add(labelErrorMessage);
        labelErrorMessage.setVisible(false);

        // ----- Submit Button ----- //
        JButton button1 = new JButton();
        button1.setText("Submit");
        button1.setBounds(250,360,100,30);
        p.add(button1);

        // ----- Return Button ----- //
        JButton button2 = new JButton();
        button2.setText("Return");
        button2.setBounds(350,360,100,30);
        p.add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                labelErrorMessage.setText(""); //line added by JB to make sure label set blank when all fields are filled with values

                if (!(forenameField.getText().equals("") || surnameField.getText().equals("") || RegistrationField.getText().equals("") ||
                        CardNumberField.getText().equals("") || CVVField.getText().equals("") || BankNameField.getText().equals("") ||
                        BankNumberField.getText().equals("")))
                {
                    labelErrorMessage.setVisible(false);
                }
                else {
                    labelErrorMessage.setVisible(true);
                    labelErrorMessage.setText("All fields must be filled in order to continue!");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new MainMenu().main(null);
                f.setVisible(false);
            }
        });



        f.add(p);
        f.setVisible(true);


    }
}
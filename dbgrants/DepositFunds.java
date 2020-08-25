package dbgrants;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;

public class DepositFunds extends Frame implements ActionListener, WindowListener {
    TextField firstNameTextField;
    TextField lastNameTextField;
    TextField amountTextField;
    TextField accountNumberTextField;
    Label firstNameLabel;
    Label lastNameLabel;
    Label amountLabel;
    Label accountNumberLabel;
    Button depositButton;
    Account account;

    DepositFunds() throws SQLException, ClassNotFoundException{
        account = new Account("jdbc:mysql://localhost:3306/tracomdb", "readuser", "passread");
        setTitle("Open User Account");
        setSize(600, 300);
        setLayout(null);
        setVisible(true);
        addWindowListener(this);
        setResizable(false);

        firstNameTextField = new TextField();
        firstNameTextField.setBounds(200, 50, 300, 20);
        add(firstNameTextField);

        lastNameTextField = new TextField();
        lastNameTextField.setBounds(200, 90, 300, 20);
        add(lastNameTextField);

        amountTextField = new TextField();
        amountTextField.setBounds(200, 130, 300, 20);
        add(amountTextField);

        accountNumberTextField = new TextField();
        accountNumberTextField.setBounds(200, 170, 300, 20);
        add(accountNumberTextField);

        firstNameLabel = new Label();
        firstNameLabel.setText("First Name: ");
        firstNameLabel.setBounds(15, 50, 115, 20);
        add(firstNameLabel);

        lastNameLabel = new Label();
        lastNameLabel.setText("Last Name: ");
        lastNameLabel.setBounds(15, 90, 115, 20);
        add(lastNameLabel);

        amountLabel = new Label();
        amountLabel.setText("Amount No: ");
        amountLabel.setBounds(15, 130, 115, 20);
        add(amountLabel);

        accountNumberLabel = new Label();
        accountNumberLabel.setText("Account No: ");
        accountNumberLabel.setBounds(15, 170, 115, 20);
        add(accountNumberLabel);

        depositButton = new Button("MAKE DEPOSIT");
        depositButton.setBounds(200, 210, 300, 30);
        depositButton.addActionListener(this);
        add(depositButton);
        account.checkDetails();
    }

    public void actionPerformed(ActionEvent e){
        String firstName = this.firstNameTextField.getText();
        String lastName = this.lastNameTextField.getText();
        String accountNumber = this.accountNumberTextField.getText();
        String amount  = this.amountTextField.getText();
        try {
            account.createAccount(firstName, lastName, accountNumber, amount);
            firstNameTextField.setText(" ");
            lastNameTextField.setText(" ");
            accountNumberTextField.setText(" ");
            amountTextField.setText(" ");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    // Listen for actions on the window
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) { dispose(); }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}


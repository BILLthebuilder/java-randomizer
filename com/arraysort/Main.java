package com.arraysort;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class Main extends Frame implements ActionListener, WindowListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    TextField inputTextField;
    TextField outputTextField;
    Label inputLabel;
    Label outputLabel;
    Button button;
    ArrayProcessing arrayProcessing;
    Main(){
        setTitle("Array Sort");
        setSize(400, 200);
        setLayout(null);
        setVisible(true);
        addWindowListener(this);
        setResizable(false);
        outputTextField = new TextField();
        outputTextField.setBounds(80, 50, 300, 20);
        outputTextField.setEditable(false);
        outputLabel = new Label();
        outputLabel.setBounds(10, 50, 60, 20);
        outputLabel.setText("output: ");
        inputLabel = new Label();
        inputLabel.setBounds(10, 80, 60, 20);
        inputLabel.setText("input: ");
        inputTextField  = new TextField();
        inputTextField.setBounds(80, 80, 200, 20);
        button = new Button("Add");
        button.setBounds(80, 110, 200, 30);
        button.addActionListener(this);
        add(inputTextField);
        add(outputTextField);
        add(button);
        add(inputLabel);
        add(outputLabel);
        arrayProcessing = new ArrayProcessing();
    }

      public void actionPerformed(ActionEvent e){
        String output = "";
        String input = inputTextField.getText();
        if(Main.isNumeric(input)) {
            inputTextField.setText("");
            try {
                output = arrayProcessing.addGetElements(input);
                outputTextField.setText(output);
            } catch (ElementExistInArrayException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "DUPLICATE ELEMENT", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "PROVIDE A NUMBER", "INVALID INPUT", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // Listen for actions on the window
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) { dispose(); }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}

    public void windowDeactivated(WindowEvent e) {
    }
    
    public static void main(String[] args) {
        new Main();
    }

}

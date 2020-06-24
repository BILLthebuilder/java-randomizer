import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class Main extends Frame implements ActionListener, WindowListener {
    TextField textField;
    Label label;
    Button button;
    //int numbers[] = new int[10];
    ArrayList<Integer>numbers = new ArrayList<Integer>();
    int counter = 0;
    
    String output = " ";

    Main() {
        setTitle("Array Sort");
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        addWindowListener(this);
        setResizable(false);
        label = new Label();
        label.setBounds(50, 50, 800, 20);
        textField = new TextField();
        textField.setBounds(50, 80, 200, 20);
        button = new Button("Add");
        button.setBounds(50, 110, 200, 30);
        button.addActionListener(this); // Passing current instance
        add(textField);
        add(label);
        add(button);
    }
    
    int[] expand(int[] arr) {
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, arr.length);

        // an alternative to using System.arraycopy would be a for-loop:
        // for(int i = 0; i < OrigArray.length; i++)
        // newArray[i] = OrigArray[i];
        return arr = newArray;
    }
    public void actionPerformed(ActionEvent e){
        String input = textField.getText();
        textField.setText("");
        int num = Integer.parseInt(input);
        numbers.add(num);
        // numbers[counter] = num;
        // if (numbers.length > 10) {
        //     expand(numbers); 
        // }
        counter += 1;
        int numAtIndex;
        //output = " ";
        // for (int i = 0; i < counter; i++) {
        //     numAtIndex = numbers[i];
            output += String.valueOf(num);
            //output += " ";
        // }
        label.setText(output);
    }

    // Listen for actions on the window
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) { dispose(); }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new Main();
    }
}

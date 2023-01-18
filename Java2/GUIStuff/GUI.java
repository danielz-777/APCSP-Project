package Java2.GUIStuff;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GUI 
{
    // JButton button;
    
    // public GUI()
    // {
    //     button = new JButton();
    //     button.setBounds(0, 100, 250, 100); //x pos and y pos, width, height
    //     button.addActionListener(this);
    //     button.setText("I'm a button!");
    // }
    
    public static void main(String args[])
    {
        myFrame2 frame = new myFrame2();
        JLabel label = new JLabel(); //creates a kinda textbook
        label.setText("Hello world");
        frame.add(label);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setForeground(Color.black);
        label.setFont(new Font("Arial", Font.BOLD, 12));

        JLabel label2 = new JLabel(""); //creates an image under JLabel
        ImageIcon image = new ImageIcon("google.jpg");
        label2.setIcon(image);
        frame.add(label2);
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);

        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.TOP);

        

        



        
        // JFrame frame = new JFrame(); //creates new frame
        // frame.getContentPane().setBackground(new Color(128, 0, 128)); //sets frame color
        // frame.setSize(600,600); //sets frame size
        // frame.setVisible(true); //makes the frame visible
        // frame.setTitle("The is the homework"); //name of the window
        // frame.setDefaultCloseOperation(0);
    }
    public void actionPerformed(ActionEvent e) {
        //when you add a button, you must have a class that shows what happens when you press the button
        System.out.println("hi");
    }
    

    
}

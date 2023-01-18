package Java2.GUIStuff;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame2 extends JFrame implements ActionListener 
{
    JButton button1; //creates a button
    JButton button2;
    JButton button3;
    JButton button4;
    int sum = 0;

    
    public myFrame2()//this is a constructor, so we use this.
    {
        button1 = new JButton();
        button1.setBounds(0, 100, 250, 100); //x pos and y pos, width, height
        button1.addActionListener(this);
        button1.setText("I'm a button!");

        button2 = new JButton();
        button2.setBounds(100, 100, 200, 400); //x pos and y pos, width, height
        button2.addActionListener(this);
        button2.setText("I'm a button!");

        button3 = new JButton();
        button3.setBounds(200, 100, 250, 100); //x pos and y pos, width, height
        button3.addActionListener(this);
        button3.setText("I'm a button!");

        button4 = new JButton();
        button4.setBounds(300, 100, 250, 100); //x pos and y pos, width, height
        button4.addActionListener(this);
        button4.setText("I'm a button!");

        button1.setFocusable(false); //check if you can type in it

        this.getContentPane().setBackground(new Color(128, 0, 128)); //sets frame color
        this.setSize(600,600); //sets frame size
        this.setVisible(true); //makes the frame visible
        this.setTitle("The is the homework"); //name of the window
        this.setDefaultCloseOperation(0);
        this.setTitle("TITLE");

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
    }
    //we want a specific thing to reference the object we have
    //we want to reference the specific frame 
    // this.getContentPane().setBackground(new Color(128, 0, 128)); //sets frame color
    // this.setSize(600,600); //sets frame size
    // this.setVisible(true); //makes the frame visible
    // this.setTitle("The is the homework"); //name of the window
    // this.setDefaultCloseOperation(0);
  
    //overriding stuff from the imported file
    @Override
    public void actionPerformed(ActionEvent e) //e = tells you whetehr button was pressed or not
    {
        //when you add a button, you must have a class that shows what happens when you press the button
        if(e.getSource() ==button1)
        {
            sum++;
            System.out.println(sum);
            //if button 1 is pressed, do someting
        }
        else if(e.getSource() ==button2)
        {
            sum--;
            System.out.println(sum);
        }
        else if(e.getSource() ==button3)
        {
            sum = sum + 10;
            System.out.println(sum);
        }
        else if(e.getSource() ==button4)
        {
            sum = sum - 10;
            System.out.println(sum);
        }
        
        //run the file thru GUI
    }
}

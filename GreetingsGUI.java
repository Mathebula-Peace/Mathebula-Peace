package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GreetingsGUI extends JFrame
{
    //Panels
    private JPanel namePn1;
    private JPanel surnamePn1;
    private JPanel nameAndSurnamePn1;
    private JPanel greetingsAreaPn1;
    private JPanel btnPn1;
    private JPanel mainPn1;
    private  JPanel headingPn1;
    
    //Labels
    private JLabel headingLb1;
    private JLabel nameLb1;
    private JLabel surnameLb1;
    
    //TextFields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //TextArea
    private JTextArea greetingsTxtArea;
    
    //Buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public GreetingsGUI()
    {
        //Configure the GUI
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700, 750);
        setBackground(Color.yellow);
        
        //Create the panels
        namePn1 = new JPanel(new FlowLayout());
        surnamePn1 = new JPanel(new FlowLayout());
        
        nameAndSurnamePn1 = new JPanel(new GridLayout(2, 1));
        greetingsAreaPn1 = new JPanel(new FlowLayout());
        greetingsAreaPn1.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Greetings"));
        
        btnPn1 = new JPanel(new FlowLayout());
        mainPn1 = new JPanel(new BorderLayout());
        
        //Create the labels
        headingLb1 = new JLabel("Greetings App");
        nameLb1 = new JLabel("Name: ");
        surnameLb1 = new JLabel("Surname: ");
        
        //Create the text fields
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        //Create the text area
        greetingsTxtArea = new JTextArea(40, 50);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [name]  [surname]");
        
        //Create the button
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //Add name label textField to name panel
        namePn1.add(nameLb1);
        namePn1.add(nameTxtFld);
        
        //Add surname label textField to surname panel
        surnamePn1.add(surnameLb1);
        surnamePn1.add(surnameTxtFld);
        
        //Add name and surname pabel to the collection panel
        nameAndSurnamePn1.add(namePn1);
        nameAndSurnamePn1.add(surnamePn1);
        
        //add the greetings area to its panel
        btnPn1.add(greetBtn);
        btnPn1.add(clearBtn);
        btnPn1.add(exitBtn);
        
        //add all the panels to the main panel
        mainPn1.add(nameAndSurnamePn1, BorderLayout.NORTH);
        mainPn1.add(greetingsAreaPn1, BorderLayout.CENTER);
        mainPn1.add(btnPn1, BorderLayout.SOUTH);
        
        //add the main panel to the frame's panel
        add(headingLb1, BorderLayout.NORTH);
        add(mainPn1, BorderLayout.CENTER);
        
        setVisible(true);
    }
}

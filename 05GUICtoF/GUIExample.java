import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIExample extends JFrame implements ActionListener{
    private Container pane;
    private Container text;
    private Container button;
    
    private JButton b;
    private JLabel c, f;
    private JTextField C, F;
    
    public GUIExample(){
	this.setTitle("Celcius to Farenheit Converter");
	this.setSize(600, 100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout());

    }





}
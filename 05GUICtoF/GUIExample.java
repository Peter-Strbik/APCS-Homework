import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIExample extends JFrame implements ActionListener{
    private Container pane;
    private Container textStuff;
    private Container buttons;
    
    private JButton b, clear;
    private JLabel c, f;
    private JTextField C, F;
    private JRadioButton CF, FC;
    
    public GUIExample(){
	this.setTitle("Celsius to Farenheit Converter");
	this.setSize(600, 100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,1));

	c = new JLabel("Celsius:",null,JLabel.CENTER);
	f = new JLabel("Fahrenheit:",null,JLabel.CENTER);
	C = new JTextField(20);
	F = new JTextField(20);
	b = new JButton("Convert!");
	clear = new JButton("Clear!");
	CF = new JRadioButton("C to F", true);
	FC = new JRadioButton("F to C");

	ButtonGroup group = new ButtonGroup();
	group.add(CF);
	group.add(FC);

	b.setActionCommand("Convert");
	b.addActionListener(this);
	clear.setActionCommand("Clear");
	clear.addActionListener(this);

	textStuff = new Container();
	textStuff.setLayout(new FlowLayout());
	textStuff.add(c);
	textStuff.add(C);
	textStuff.add(f);
	textStuff.add(F);

	buttons = new Container();
	buttons.setLayout(new FlowLayout());
	buttons.add(CF);
	buttons.add(FC);
	buttons.add(b);
	buttons.add(clear);

	pane.add(textStuff);
	pane.add(buttons);
    }


    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (action.equals("Convert")){
	    if (CF.isSelected()){
		String s = C.getText();
	        int c = Integer.parseInt(s);
		int res = CToF(c);
		String StrRes = Integer.toString(res);
		F.setText(StrRes);
	    }
	    else{
		String t = F.getText();
	        int f = Integer.parseInt(t);
		int res = FToC(f);
		String StrRes = Integer.toString(res);
		C.setText(StrRes);
	    }
	}
	if (action.equals("Clear")){
	    C.setText("");
	    F.setText("");
	}

    }

    public static void main(String[] args){
	GUIExample g = new GUIExample();
	g.setVisible(true);
    }

    public int CToF(int C){
	return (C * 9 / 5) + 32;
    }

    public int FToC(int F){
	return (F - 32) * 5 / 9;
    }
    





}

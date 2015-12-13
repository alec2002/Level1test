
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class level1 implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton yellow;
	JButton red;
	JButton blue;
	JButton green;
public static void main(String[] args) {
	level1 x = new level1();
}
level1(){
	frame = new JFrame("Color Teacher");
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setSize(400, 400);
	panel = new JPanel();
	yellow = new JButton();
	red = new JButton();
	blue = new JButton();
	green = new JButton();
	panel.add(yellow);
	panel.add(red);
	panel.add(blue);
	panel.add(green);
	frame.add(panel);
	yellow.addActionListener(this);
	red.addActionListener(this);
	blue.addActionListener(this);
	green.addActionListener(this);
	yellow.setBackground(Color.YELLOW);
	yellow.setOpaque(true);
	red.setBackground(Color.RED);
	red.setOpaque(true);
	blue.setBackground(Color.BLUE);
	blue.setOpaque(true);
	green.setBackground(Color.GREEN);
	green.setOpaque(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()== yellow){
		speak("yellow");
	}
	if(e.getSource()== red){
		speak("red");
	}
	if(e.getSource()== blue){
		speak("blue");
	}
	if(e.getSource()== green){
		speak("green");
	}
}
void speak(String words){
	try{
		Runtime.getRuntime().exec("say " + words);
	}catch (IOException e){
			e.printStackTrace();
		}
	}
 

}




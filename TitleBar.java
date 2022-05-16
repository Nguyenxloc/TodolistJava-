package classes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TitleBar extends JPanel{
	JLabel titleText;
	JLabel textleft;
	JLabel textright;
	TitleBar()
	{
this.setPreferredSize(new Dimension(400,60));
this.add(Box.createHorizontalStrut(35));
		textleft = new JLabel("Uncomplete");
		textleft.setPreferredSize(new Dimension(200,60));
		textleft.setFont(new Font("Sans-serif",Font.BOLD, 20));
		
		this.add(textleft);
		
		
		this.add(Box.createHorizontalStrut(65));
		titleText = new JLabel("To Do List");
		titleText.setPreferredSize(new Dimension(200,60));
		titleText.setFont(new Font("Sans-serif",Font.BOLD, 20));
		
		this.add(titleText);
		
		this.add(Box.createHorizontalStrut(20));
		textright = new JLabel("Complete");
		textright.setPreferredSize(new Dimension(200,60));
		textright.setFont(new Font("Sans-serif",Font.BOLD, 20));
		
		this.add(textright);
		
		
	}
}

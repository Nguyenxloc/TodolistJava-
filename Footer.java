package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Footer extends JPanel{
	
	JButton addTask;
	
	JButton memorize;
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	Footer()
	{
		this.setPreferredSize(new Dimension(400,60));
		
		addTask = new JButton("Add Task");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Sans-serif",Font.PLAIN, 20));
		addTask.setVerticalAlignment(JButton.BOTTOM);
		
		this.add(addTask);
		this.add(Box.createHorizontalStrut(20));
		memorize = new JButton("Memorize");
		memorize.setFont(new Font("Sans-serif",Font.PLAIN, 20));
		memorize.setBorder(emptyBorder);
		this.add(memorize);	
	}
	
	public JButton getNewTask(){
		return addTask;
	}
	

	public JButton getmemorize() {
		return memorize;
	}
	
}

package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;

public class Taskf extends JPanel{
	
	JLabel indexf;
	JTextField taskNamef;
	JButton donef;
	
	private boolean checked;
	
	Taskf()
	{
		Task task = new Task();
		List list = new List();
		this.setPreferredSize(new Dimension(400,20));
		this.setBackground(Color.red);
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		indexf = new JLabel("");
		indexf.setPreferredSize(new Dimension(20,20));
		indexf.setHorizontalAlignment(JLabel.CENTER);
		this.add(indexf,BorderLayout.WEST);
		
		
		taskNamef = new JTextField("");
		taskNamef.setBorder(BorderFactory.createEmptyBorder());
		taskNamef.setBackground(Color.red);
		
		
		this.add(taskNamef,BorderLayout.CENTER);
		
		donef = new JButton("Done");
		donef.setPreferredSize(new Dimension(40,20));
		donef.setBorder(BorderFactory.createEmptyBorder());
		donef.setFocusPainted(false);
		
		this.add(donef,BorderLayout.EAST);
		
	}
	public void changeIndexf(int num)
	{
		this.indexf.setText(num+"");
		this.revalidate();
		
	}
	
	
	public JButton getDonef()
	{
		return donef;
	}
	
	public boolean getStatef()
	{
		return checked;
		
	}
	
	public void changeStatef()
	{
		List list = new List();
		Task task= new Task();
		this.setBackground(Color.green);
		taskNamef.setBackground(Color.green);
		checked = true;
		revalidate();
		System.out.print("");
		
		taskNamef.setText(""+task.getData());
		
	}
}
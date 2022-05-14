package classes;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Task extends JPanel{
	
	JLabel index;
	JTextField taskName;
	JButton done;
	public static String getValue;
	
	private  boolean checked;
	
	Task()
	{	
		 
		this.setPreferredSize(new Dimension(400,20));
		this.setBackground(Color.red);
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);
		
		taskName = new JTextField("TEST1");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Color.red);

		
		this.add(taskName,BorderLayout.CENTER);
		
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setFocusPainted(false);
		
		this.add(done,BorderLayout.EAST);
		
		
		done.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e){
				        getValue = taskName.getText();
				        
			   }
			});
	}
	
	
	
	public void changeIndex(int num)
	{
		this.index.setText(num+"");
		this.revalidate();
		
	}
	public  String getData()
	{
		return getValue;
		 
	}
	
	public JButton getDone()
	{
		return done;
		 
	}
	
	public boolean getState()
	{
		return checked;
		
	}
	
	public void changeState()
	{
		this.setBackground(Color.green);
		taskName.setBackground(Color.green);
		checked = true;
		revalidate();
		
	}
}

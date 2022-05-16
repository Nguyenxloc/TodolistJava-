package classes;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel{

	List()
	{
		Task task = new Task();
		task.getData();
		GridLayout layout = new GridLayout(10,1);
		layout.setVgap(5);
		
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(400,560));
		
	}
	
	public void updateNumbers()
	{
		Component[] listItems = this.getComponents();
		
		for(int i = 0;i<listItems.length;i++)
		{
			if(listItems[i] instanceof Task)
			{
				((Task)listItems[i]).changeIndex(i+1);
				
			}
		}
		
	}
	
	public void removeCompletedTasks()
	{	
		
		
		for(Component a : getComponents())
		{
			if(a instanceof Task)
			{
				if(((Task)a).getState())
				{
			
					remove(a);
					
					
					updateNumbers();
					
				}
				
			}
		}
		
	}
	public void moveCompletedTasks()
	{	
		
		
 		for(Component a : getComponents())
		{
			if(a instanceof Task)
			{
				if(((Task)a).getState())
				{
					
					updateNumbers();
					
}
}
		}
	}
	
}
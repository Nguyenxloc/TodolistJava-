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
			if(listItems[i] instanceof Task)//object listItems is of instanof ? 
			{
				((Task)listItems[i]).changeIndex(i+1);
				
			}
		}
		
	}
	
	public void removeCompletedTasks()
	{	
		
		
		for(Component a : getComponents())// a: Task
		{
			if(a instanceof Task)// a is of class Task
			{
				if(((Task)a).getState())/// if true -> remove
				{////get state of task if task done --> remove->
			
					remove(a);
					
					
					updateNumbers();
					
				}
				
			}
		}
		
	}
	public void moveCompletedTasks()
	{	
		
		
 		for(Component a : getComponents())// loop each data task 1 2 3
		{
			if(a instanceof Task)// a is of class Task
			{
				if(((Task)a).getState())/// if true -> remove
				{////get state of task if task done --> remove->
					
				    
					
					
					
					updateNumbers();
					
}
}
		}
	}
	
}
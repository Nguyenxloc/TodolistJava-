package classes;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class test extends JPanel{

	test()
	{
		
		GridLayout layout = new GridLayout(10,1);
		layout.setVgap(5);
		
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(370,560));
		
	}
	public void updateNumbers1()
	{
		Component[] listItems1 = this.getComponents();
		
		for(int i = 0;i<listItems1.length;i++)
		{
			if(listItems1[i] instanceof Taskf)
			{
				((Taskf)listItems1[i]).changeIndexf(i+1);
				System.out.print(i);
			}
		}
		
	}
	
	
	public void removeCompletedTasks1()
	{
		
		
		for(Component b : getComponents())
		{
			if(b instanceof Task)
			{
				if(((Task)b).getState())
				{
					remove(b);
					
					
				
				}
			}
		}
		
	}
}

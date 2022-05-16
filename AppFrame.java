package classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


public class AppFrame extends JFrame{ 
	
	private TitleBar title;
	private Footer footer;
	private List list;
	private JButton newTask;
	private JButton memorize;
	private test test1;
	AppFrame()
	{
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title = new TitleBar();
		footer = new Footer();
		list = new List();
		test1 = new test();
		this.add(title,BorderLayout.NORTH);
		this.add(footer,BorderLayout.SOUTH);
		this.add(list,BorderLayout.WEST);
		newTask = footer.getNewTask();
		memorize= footer.getmemorize();
		this.setVisible(true);
		addListeners();
		}
		public void memtaskdone() {
			 
			GridLayout layout = new GridLayout(10,1);
			layout.setVgap(5);
			test1.setLayout(layout);
			test1.setPreferredSize(new Dimension(370,560));
			
			this.add(test1,BorderLayout.EAST);
			this.setVisible(true);
			
		}
		

		public void addListeners()
		{
			newTask.addMouseListener(new MouseAdapter()
			{
				@override
				public void mousePressed(MouseEvent e)
				{	
					Task task = new Task();	
					list.add(task);		
					
					list.updateNumbers();					
					task.getDone().addMouseListener(new MouseAdapter()					
					{
						@override
						public void mousePressed(MouseEvent e)
						{
							if(e.getClickCount()==2){
							Taskf taskf =new Taskf();						
							task.changeState();						
							taskf.changeStatef();
							test1.add(taskf);
							test1.setLayout(null);
							revalidate();
						}
							if(e.getClickCount()==2){
								Taskf taskf =new Taskf();	
								test1.updateNumbers1();																				
								revalidate();
							}
							
							
						}
					});
				}
				
			});
			
			
			
			memorize.addMouseListener(new MouseAdapter()
			{
				@override
				public void mousePressed(MouseEvent e)
				{
					memtaskdone();
					list.removeCompletedTasks();
					repaint();
					
				}
			});
		}	
		
	}

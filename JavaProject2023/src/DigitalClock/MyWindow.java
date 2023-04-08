package DigitalClock;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MyWindow extends JFrame
{
	
	private JLabel heading;
	
	private JLabel clockLable;
	
	private Font font=new Font("",Font.BOLD,35);
	
	
	MyWindow()
	{
		super.setTitle("My Clock");
		super.setSize(600, 600);
		super.setLocation(400, 70);
		this.createGUI();
		this.startClock();
		super.setVisible(true);
	}
	
	
	public void createGUI()
	{
		heading= new JLabel("My Clock");
		
		clockLable= new JLabel("Clock");
		
		heading.setFont(font);
		
		clockLable.setFont(font);
		
		this.setLayout(new GridLayout(2,1));
		
		this.add(heading);
		
		this.add(clockLable);
		
	}
	
	public void startClock()
	{
		Timer timer = new  Timer(1000, new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
//				String dateTime= new Date().toString();
				
//				String dateTime= new Date().toLocaleString();
				
				Date d= new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
				
				String dateTime = sdf.format(d);
				
				clockLable.setText(dateTime);
			}
		});
		timer.start();
	}
}
	
//	

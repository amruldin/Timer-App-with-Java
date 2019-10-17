import javax.swing.JFrame;


import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class MainFrame{
	
	private JFrame frm;
	private JButton btn;
	private JTextArea textArea;
	private JLabel text;
	
	
	public MainFrame()
	{
		
		super();
		frm = new JFrame();		
		text = new JLabel("",JLabel.CENTER);
		createFrame();
		showTime();
		

		
	}
	
	
	public void createFrame()
	{
		frm.setLayout(new BorderLayout());
		frm.setTitle("Timer");
		frm.setSize(150, 100);
		frm.setVisible(true);
		//frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void showTime()
	{
		Color color = new Color(255);
		
		
		text.setForeground(Color.darkGray);
		text.setFont(new Font("Time new Roman", Font.PLAIN, 30));
		text.setBackground(Color.green);
		text.setSize(100, 150);
		frm.add(text, BorderLayout.CENTER);

		
		
		
	}
	
	public void updateTime(String time)
	{
		Random rnd = new Random();
	
		String colors[] = {"BLUE", "BLACK", "CYAN", "DARK_GRAY", "GREEN"};
		
		
		int index = rnd.nextInt(colors.length);
		

		text.setText(time);
	}
	
	

}

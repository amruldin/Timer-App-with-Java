import java.awt.BorderLayout;

import javax.swing.*;
public class Gui extends JFrame {
	private JFrame frame;
	private JButton btn;
	private JLabel lbl;
	//private BorderLayout layout;
	
	
	
	public Gui()
	{
		super();
		frame= new JFrame();
		btn = new JButton("fsdfas");
		lbl = new JLabel("HI");
		
		//
		createFrame();
		//setupGui();
		setLayout(new BorderLayout());
		
		add(lbl, BorderLayout.CENTER);
		
		add(btn, BorderLayout.SOUTH);

		
		
		
	}
	
	
	public void createBtn()
	{
		btn.setText("Click Me");
		
	}
	
	public void createFrame()
	{
		frame.setTitle("Tm");
		frame.setVisible(true);
		frame.setLocation(0, -600);
		frame.setSize(200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	
	public void createLabel(String time)
	{
		lbl.setText(time);
	}
	
	public void setupGui()
	{
		add(lbl, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
	}
	
	

}

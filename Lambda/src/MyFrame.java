

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame {

	JButton myButton = new JButton("My button");
	JButton myButton2 = new JButton("My button 2");
	
	MyFrame() {
		
		myButton.setBounds(100, 100, 200, 100);
		myButton.addActionListener(
				
				(e) -> System.out.println("this is the first button")
				
		);
		
		
		myButton2.setBounds(100, 200, 200, 100);
		myButton2.addActionListener(
				
		
				(e) -> System.out.println("this is the second button")
		);
		
		
		
//		myButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("you click a button");
//			}
//		});
		
		this.add(myButton2);
		this.add(myButton);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("sophies playhouse");

		
	}
}

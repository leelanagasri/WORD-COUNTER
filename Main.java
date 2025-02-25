package Demo;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main implements ActionListener {
	JFrame frame;
	JButton button;
	JScrollPane spane;
	JTextField text;
	JTextArea area;
	public Main() {
		frame = new JFrame();
		button = new JButton("Count");
		text = new JTextField();
		area = new JTextArea();
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 500);
		frame.setResizable(false);
		frame.setTitle("Word Counter");
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		
		area.setLineWrap(false);
		area.setWrapStyleWord(false);
		area.setFont(new Font("Times New Roman",Font.PLAIN,18));
		area.setBounds(50, 20, 400, 300);
		
		
		spane = new JScrollPane(area);
		spane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		spane.setBounds(50,70,500,250);
		frame.add(spane);
		
		
		button.setFocusable(false);
		button.addActionListener(this);
		button.setBounds(250, 350, 100, 40);
		button.setFont(new Font("Times New Roman",Font.PLAIN,18));
		frame.add(button);
				
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			String con = area.getText();
			int tot = counted(con);
			System.out.println(con + "   "+ tot);
			JOptionPane.showMessageDialog(null, "Total words: "+tot, "Word Count", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	public static int counted(String s) {
		if(s == null) {
			return 0;
		}
		String[] words = s.split("\\s+");
		return words.length;
	}
	
	public static void main(String[] args) {
		new Main();
	}
}

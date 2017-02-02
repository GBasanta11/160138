import java.awt.*;
import  java.awt.event.*;
import javax.swing.*;

	public class TestIcon {
		public static void main(String[] args) {
			FrameMan fm = new FrameMan();
		}
	}
	class FrameMan implements ActionListener{
		
		JFrame frame;
		JPanel panel;
		JLabel label;
		ImageIcon img;
		ImageIcon img2;
		JButton button;


		public FrameMan(){	
			frame = new JFrame("SetIcon");

			frame.setLocation(400,400);
			frame.setSize(600,600);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			img = new ImageIcon("img/1.jpg");
			img2 = new ImageIcon("img/2.jpg");
			
			label = new JLabel(img);
			panel = new JPanel();
			button = new JButton("ClickMe!");
			button.addActionListener(this);
			button.setActionCommand("open");

			Container con = frame.getContentPane();
			panel.add(label);
			panel.add(button);
			con.add(panel);

			frame.setVisible(true);
}
 public void actionPerformed(ActionEvent ae){
	String cmd = ae.getActionCommand();
 	if (cmd.equals("open")){
 		label.setIcon(img);
 		label.setIcon(img2);
 	}
    	}
    	}
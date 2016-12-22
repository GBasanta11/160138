
import java.awt.*;
import javax.swing.*;
public class AlohaWindow1{
		Static JFrame frame;
		Static JLabel label;
		Static JButton button;
		Static Container ctnr;
public static void main(String[] args) {
	frame = new JFrame();
	frame.setSize(400,400);
	frame.setTitle("ギミレ　バサンタ");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new FlowLayout()); 

	label = new JLabel("HELLO!!");

	button = new JButton("ClickMe!");
	Container ctnr = frame.getContentPane();
	ctnr.add(label);
	ctnr.add(button);
	frame.setVisible(true);

	}
}
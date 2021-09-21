package net.progressit.visualz.samples.sample1;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import net.progressit.visualz.VColors;

public class Sample1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		JLabel test1 = new JLabel("test1");
		JLabel test2 = new JLabel("test2");
		JPanel panel = new JPanel(new MigLayout("","[grow, fill][grow, fill]","[]"));
		frame.add(panel);
		panel.add(test1);
		panel.add(test2);
		frame.setSize(new Dimension(800,600));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		test1.setBackground( VColors.antiqueWhiteColor() );
		test2.setBackground( VColors.ghostWhiteColor() );
		test1.setOpaque(true);
		test2.setOpaque(true);
	}
}

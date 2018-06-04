package Framework;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Themes.Dark;

public class Main {

	public static void main(String[] args) {
		
		//DELET THIS >:(
		Dark dark = new Dark();
		JFrame frame = dark.getJFrame();
		JPanel panel = dark.getJPanelBackground();
		panel.setLayout(new FlowLayout());
		panel.add(dark.getJButton("Button", true));
		frame.add(panel);
		panel.add(dark.getJButton("Button", true));
		frame.add(panel);
		panel.add(dark.getJButton("Button", true));
		frame.add(panel);
		panel.add(dark.getJButton("Button", true));
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		JMenuBar bar = dark.getJMenuBar();
		JMenu men = dark.getJMenu("File");
		JMenuItem menuItem = dark.getJMenuItem("Save...");
		JMenuItem menuItem2 = dark.getJMenuItem("Save As...");
		JMenuItem menuItem3 = dark.getJMenuItem("Open...");
		JMenuItem menuItem4 = dark.getJMenuItem("Import...");
		JMenuItem menuItem5 = dark.getJMenuItem("Export...");
		men.add(menuItem);
		men.add(menuItem2);
		men.add(menuItem3);
		men.add(menuItem4);
		men.add(menuItem5);
		bar.add(men);
		frame.setJMenuBar(bar);
		frame.setVisible(true);
		Button button;

	}

}

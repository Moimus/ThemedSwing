package Framework;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public interface ITheme 
{
	
	public JFrame getJFrame();
	public JPanel getJPanelBackground();
	public JPanel getJPanelForeground();
	public JMenuBar getJMenuBar();
	public JMenu getJMenu(String title);
	public JMenuItem getJMenuItem(String title);
	
	public JButton getJButton(String title,Boolean roundedCorners);
	

}

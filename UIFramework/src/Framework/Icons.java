package Framework;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Icons 
{
	public static ImageIcon radioButtonChecked;
	public static ImageIcon radioButtonUnchecked;
	
	public Icons(Theme theme)
	{
		radioButtonChecked = new ImageIcon(theme.radioButtonCheckedPath); //TODO
		radioButtonUnchecked = new ImageIcon(theme.radioButtonCheckedPath); //TODO
	}

}
